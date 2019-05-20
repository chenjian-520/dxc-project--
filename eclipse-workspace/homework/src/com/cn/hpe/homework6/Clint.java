package com.cn.hpe.homework6;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

class ClintRead implements Runnable{
	Socket socket = null;
	
	public ClintRead(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		
		InputStream is = null;
		try {
			is = socket.getInputStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner sc = new Scanner(is);
		String sr = null;
		while(true) {
			if(sc.hasNextLine()) {
			sr = sc.nextLine();
			System.out.println("服务器说：" + sr);
			
			}
			if(sr.equals("end")) {
				break;
			}
		}
		try {
			socket.close();
			sc.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class ClintWriter implements Runnable{
	Socket socket = null;
	
	public ClintWriter(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		OutputStream os = null;
		try {
			os = socket.getOutputStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PrintWriter out = new PrintWriter(os, true);
		String sw;
		Scanner input = new Scanner(System.in);
		while (true) {
			
//			System.out.println("客户端说：");
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

public class Clint {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		// 1创建一个客户端
		// 1服务器的IP 端口
		Socket socket = new Socket("127.0.1.1", 5278);
		System.out.println("-----------1客户端------------");		
		ClintRead tr = new ClintRead(socket);
		ClintWriter tw = new ClintWriter(socket);
		
		Thread t1 =new Thread(tr); 
		Thread t2 =new Thread(tw); 
		
		t1.start();
		t2.start();
		
	}

}

