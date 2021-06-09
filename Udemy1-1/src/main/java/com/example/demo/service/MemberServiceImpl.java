package com.example.demo.service;

public class MemberServiceImpl implements MemberService {

	@Override
	public int sumOf(int x, int y) {
		int sum=0;
		for(int i = x, i <= y, i++) {
			sum += i;
		}
		return sum;
	}

}
