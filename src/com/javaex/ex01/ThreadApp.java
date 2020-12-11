package com.javaex.ex01;

public class ThreadApp {

	public static void main(String[] args) throws Exception {
		
		//스레드 준비
		Thread thread = new DigitThread();	//섞어쓰기(업캐스팅)
		
		//스레드 실행 -> 출장
		//thread.run();을 실행하면 스레드가 실행되는게 아니라 메소드가 실행됨
		thread.start();
			
		
		for(char ch='A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
			Thread.sleep(1000);	//1초 쉼
		}

	}

}
