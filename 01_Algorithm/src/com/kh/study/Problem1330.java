package com.kh.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 두 수 비교하기
 *
 */
public class Problem1330 {

	public static void main(String[] args) throws IOException {
		// 1. Scanner
//		Scanner sc = new Scanner(System.in);
//		String[] input = sc.nextLine().split(" "); 
		
		// 2. BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		
		int A = Integer.parseInt(input[0]);
		int B = Integer.parseInt(input[1]);
		
		// 변수 초기화
		String operator = "";
		
		// 3가지 경우로 대입값 분류
		if(A > B) operator = ">";
		else if(A < B) operator = "<";
		else operator = "==";
		
		// 변수 출력
		System.out.println(operator);
	}

}
