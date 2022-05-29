package com.kh.study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Problem1065 {

	/**
	 * 1 부터 입력값까지의 한수 갯수
	 * 
	 */
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		outer :
		for(int num = 1; num <= input; num++) {
			int len = (int) Math.log10(num); // 자릿수 - 1
			
			// 1 ~ 99 모두 포함 (len = 0, 1)
			if(len < 2) {
				cnt++;
				continue;
			}
			
			// 100 ~ (len = 2, 3, 4...)
			List<Integer> diffArr = new ArrayList<>();
			for(int i = 0; i < len; i++) {
				int diff = ((int)(num / Math.pow(10, i + 1)) % 10 - (int)(num / Math.pow(10, i)) % 10);
				diffArr.add(diff);
			}
			
			for(int i = 0; i < diffArr.size(); i++) {
				if(diffArr.get(0) != diffArr.get(i)) continue outer;
			}
			cnt++;
		}
		System.out.println(cnt);
	}
}
