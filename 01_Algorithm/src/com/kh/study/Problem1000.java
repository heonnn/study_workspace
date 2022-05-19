package com.kh.study;

import java.util.Scanner;

/**
 * A+B : 두수를 입력받고 합을 출력하는 문제
 *
 */
public class Problem1000 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		// 정수 2개 입력
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		// 합 출력
		System.out.println(A + B);
	}

}
