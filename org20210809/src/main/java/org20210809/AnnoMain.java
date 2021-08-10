package org20210809;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnoMain {
	/*
	 * AnnoMain -> 메인함수
	 * AnnotationConfigApplicationContext 객체담는통
	 * A...객체 담는통안에 들어갈 클래스
	 * B...객체 담는통인데 들어갈 클래스
	 */
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext acac
		= new AnnotationConfigApplicationContext(AnnoConf.class);
		
		
		//싱글톤
		A a = acac.getBean(A.class);
		B b = acac.getBean(B.class);
		
		System.out.println(a);
		System.out.println(b);
		
		acac.close();
		
	}
}
