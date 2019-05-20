package com.cn.hpe.homework5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ThreadPrintDemo implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		File file = new File("C:/chenjian/baidu/password1.txt");
		ConyReadFile(file);
	}

	// 1 文件打印
	public static void ConyReadFile(File file) {
		//
		if (!file.exists()) {
			System.out.println("文件不存在");
		}

		FileReader input = null;
		BufferedReader bfIn = null;

		try {
			input = new FileReader(file);
			bfIn = new BufferedReader(input);

			String value = null;

			while ((value = bfIn.readLine()) != null) {
				System.out.println(value);
				Thread.sleep(500);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (bfIn != null) {
				try {
					bfIn.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		ThreadPrintDemo tP = new ThreadPrintDemo();
		Thread stp = new Thread(tP);
		stp.start();

	}
}
