package com.kh.study;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem2839 {

	/**
	 * 1. 5로만 나눠질 때
	 * 2. 5와 3 조합으로 나눠질 때 - 3이 1개, 2개, 3개...
	 * 3. 3으로만 나눠질 때
	 * 
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine());
		
		
		// 1번째 경우, 3번째 경우
		boolean bool1 = input % 5 == 0;
		boolean bool3 = input % 3 == 0;
		
		// 2번째 경우
		boolean bool2 = false;
		int shareBy5 = 0;
		int shareBy3 = 0;
		
		int temp = input;
		while(temp > 3) {
			temp -= 3;
			shareBy3++;
			if(temp % 5 == 0) {
				bool2 = true;
				shareBy5 = temp / 5;
				break;
			}
		}
		
		// 출력값
		int result = -1;
		
		if(bool1) result = input / 5;
		else if(bool2) result = shareBy5 + shareBy3;
		else if(bool3) result = input / 3;
		
		System.out.println(result);
	}
}
