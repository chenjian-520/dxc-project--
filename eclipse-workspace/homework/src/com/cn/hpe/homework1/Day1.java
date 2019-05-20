package com.cn.hpe.homework1;

import java.util.Arrays;

/**
 * 冒泡排序
 * 
 * @author jchen251
 *
 */
public class Day1 {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 6, 4, 7, 44, 5344, 75, 87, 5, 234, 46, 67, 878 };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					arr[j] = arr[j] ^ arr[j + 1];
					arr[j + 1] = arr[j] ^ arr[j + 1];
					arr[j] = arr[j] ^ arr[j + 1];
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
