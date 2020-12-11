package com.javaex.ex01;

public class DigitThread extends Thread{
	
	//필드 - 생략
	
	//생성자 - 디폴드 생성자 활용 (생략)
	
	//메소드 getter/setter - 필드가 없으니 생략
	
	//메소드 일반
	@Override
	public void run() {
		for(int cnt=0; cnt<10;cnt++) {
			System.out.print(cnt);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
