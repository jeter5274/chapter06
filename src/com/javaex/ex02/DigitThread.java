package com.javaex.ex02;

public class DigitThread extends Thread{

	//1~9까지 출력하는 Thread
	
	//필드 - 생략
	
	//생성자 - 기본 생성자 활용으로 생략
	
	//메소드 getter/setter - 필드가 없으므로 생략
	
	//메소드 일반
	
	@Override
	public void run() {
		
		for(int cnt=1; cnt<10; cnt++) {
			System.out.print(cnt);
		}
	}
	
}
