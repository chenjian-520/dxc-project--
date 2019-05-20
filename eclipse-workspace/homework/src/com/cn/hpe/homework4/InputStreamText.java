package com.cn.hpe.homework4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStreamText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:/chenjian/baidu/password.txt");
		File file1 = new File("C:/chenjian/baidu/password4.txt");
		ConyReadFile(file, file1);
	}

	// 1 文件复制 原文件 到 复制文件
	public static void ConyReadFile(File file, File file1) {
		//
		if (!file1.exists()) {
			try {
				file1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		FileInputStream input = null;
		FileOutputStream output = null;
		try {
			input = new FileInputStream(file);
			output = new FileOutputStream(file1);
			int len = 0;
			byte[] bytes = new byte[1024];
			while ((len = input.read(bytes)) != -1) {
				output.write(bytes, 0, len);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (input != null) {
					input.close();
				}
				if (output != null) {
					output.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
