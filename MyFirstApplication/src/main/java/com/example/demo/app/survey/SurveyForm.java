package com.example.demo.app.survey;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SurveyForm {
	
	@Size( min = 1, max = 150, message = "正しい数値を入力して下さい")
	private int age;
	@Size( min = 1, max = 5, message = "1~5までの入力です")
	private int satisfaction;
	@Size( min = 1, max = 200, message = "200文字以内です")
	@NotNull
	private String comment;
	
	public SurveyForm() {
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSatisfaction() {
		return satisfaction;
	}

	public void setSatisfaction(int satisfaction) {
		this.satisfaction = satisfaction;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	
}
