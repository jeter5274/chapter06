package com.javaex.ex02;

public class UpperThread extends Thread{

	//영문 소문자 A~Z까지 출력하는 Thread
	
	//필드 - 생략
	
	//생성자 - 기본 생성자 활용으로 생략
	
	//메소드 getter/setter - 필드가 없으므로 생략
	
	//메소드 일반
	@Override
	public void run() {
		for(char ch='A';ch<='Z';ch++) {
			System.out.print(ch);
		}
	}
}
