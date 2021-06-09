package com.example.demo.service;

import java.util.ArrayList;

import com.example.demo.entity.Member;

public interface MemberService {

	String greet(int i);
	
	int sumOf(int x, int y);
	
	ArrayList<Member> getAll();
}
