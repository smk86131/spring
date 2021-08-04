package org;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractRefreshableConfigApplicationContext;

public class MainConfig {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext acac =
				new AnnotationConfigApplicationContext(SpringConfig.class);
		
		AA a1 = acac.getBean(AA.class);
		AA a2 = acac.getBean(AA.class);
		
		System.out.println(a1);
		System.out.println(a2);
		
		acac.close();
	}

}
