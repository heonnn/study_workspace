package com.kh.study;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem179549 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] inputArr = br.readLine().split(" ");
		int fixedCost = Integer.parseInt(inputArr[0]);
		int variableCost = Integer.parseInt(inputArr[1]);
		int price = Integer.parseInt(inputArr[2]);
		
		// 갯수
		long count = 0;
		long output = 0;
		long input = 0;
		
		
		do {
			// 손익분기점 존재여부판단
			if(price <= variableCost) {
				count = -1;
				break;
			}
			count++;
			output = fixedCost + variableCost * count;
			input = price * count;
			
		} while(output >= input);
		System.out.println(count);
	}

}
