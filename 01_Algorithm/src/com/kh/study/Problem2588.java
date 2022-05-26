package com.kh.study;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem2588 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		int length = (int) Math.log10(num2) + 1;
		
		int sum = 0;
		for(int i = 0; i < length; i++) {
			int digit = (int) Math.pow(10, i);
			int temp = num1 * (num2 % (digit * 10) / digit);
			
			System.out.println(temp);
			sum += temp * digit;
		}
		System.out.println(sum);
	}

}
