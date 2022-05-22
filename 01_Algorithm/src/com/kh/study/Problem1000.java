package com.kh.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * A+B : 두수를 입력받고 합을 출력하는 문제
 *
 */
public class Problem1000 {

	public static void main(String[] args) throws IOException {
		// 1. Scanner
//		Scanner sc = new Scanner(System.in);
//		String[] input = sc.nextLine().split(" ");
		
		// 2. BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		
		int A = Integer.parseInt(input[0]);
		int B = Integer.parseInt(input[1]);
		
		System.out.println(A + B);
	}

}
