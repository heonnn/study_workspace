package com.kh.study;

import java.util.Scanner;

/**
 * 두 수 비교하기
 *
 */
public class Problem1330 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 정수 2개 입력
		int A = sc.nextInt();
		int B = sc.nextInt();
		
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
