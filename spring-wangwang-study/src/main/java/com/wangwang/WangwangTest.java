package com.wangwang;

import com.wangwang.bean.A;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WangwangTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(ac.getBean(A.class));
	}
}
