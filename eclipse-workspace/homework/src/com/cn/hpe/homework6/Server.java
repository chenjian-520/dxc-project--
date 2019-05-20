package com.cn.hpe.homework6;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


class ThreadRead implements Runnable{
	Socket socket = null;
	
	public ThreadRead(Socket socket) {
		this.socket = socket;
	}
	String sr ;
	@Override
	public void run() {
		// TODO Auto-generated method stub

		InputStream is = null;
		try {
			is = socket.getInputStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner in = new Scanner(is);
		while(true) {
			if(in.hasNextLine()) {
		sr = in.nextLine();
		System.out.println("客户端说：" + sr);
		if(sr.equals("end")) {
			break;
			}
		}
		}
		try {
			socket.close();
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


class ThreadWriter implements Runnable{
	Socket socket = null;
	
	public ThreadWriter(Socket socket) {
		this.socket = socket;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		OutputStream os;
		PrintWriter out = null;
		try {
			os = socket.getOutputStream();
			out = new PrintWriter(os, true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sw;
		out.println("连接服务器成功");
		Scanner input = new Scanner(System.in);
		while (true) {
			// 1写
			

//			System.out.println("服务器说：");
			sw = input.nextLine();
			out.println(sw);
			if (sw.equals("end")) {
				break;
			}

		}
		try {
			socket.close();
			input.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}



public class Server {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 1服务器
		ServerSocket server = new ServerSocket(5278);
	
			// 1获得一个客户端连接
			Socket socket = server.accept();
			System.out.println("-----------1服务器------------");	
			
			ThreadRead tr = new ThreadRead(socket);
			ThreadWriter tw = new ThreadWriter(socket);
			
			Thread t1 =new Thread(tr); 
			Thread t2 =new Thread(tw); 
			
			t1.start();
			t2.start();
			
		}
}

