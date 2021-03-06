package org20210809;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class XmlMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext gxac
		= new AnnotationConfigApplicationContext("Classpath:XmlConf.xml");
		
		
		//싱글톤
		A a1 = gxac.getBean(A.class);
		A a2 = gxac.getBean(A.class);
		B b = gxac.getBean(B.class);
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(b);
		
		System.out.println(a1.getAa());
		a1.setAa(200);
		System.out.println(a2.getAa());
		
		System.out.println(b.getA().getAa());
		
		gxac.close();
		
	}
}
