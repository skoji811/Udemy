package com.example.demo.entity;

import java.util.ArrayList;

import com.example.demo.service.MemberService;

public class MemberServiceImpl implements MemberService {

	@Override
	public String greet(int i) {
		String[]greetings = {"Good Morning","Hello","Good Evening"};
		return greetings[i];
	}

	@Override
	public ArrayList<Member> getAll() {
		ArrayList<Member> list = new ArrayList<>();
		Member mem1 = new Member(1,"Linda","linda@com");
		Member mem2 = new Member(2,"James","james@com");
		list.add(mem1);
		list.add(mem2);
		return list;

	}

}
