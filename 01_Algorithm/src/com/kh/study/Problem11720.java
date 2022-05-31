package com.kh.study;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem11720 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int len = Integer.parseInt(br.readLine());
		String input = br.readLine();
		
		int[] inputArr = new int[len];
		int sum = 0;
		for(int i = 0; i < inputArr.length; i++) {
			inputArr[i] = Character.getNumericValue(input.charAt(i));
			sum += inputArr[i];
		}
		
		System.out.println(sum);
	}

}
