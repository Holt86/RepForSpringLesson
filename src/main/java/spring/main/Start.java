package spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.impls.robot.ModelT1000;


public class Start {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
//		ModelT1000 t10001 = (ModelT1000) context.getBean("t1000Empty");
//		t1000.dance();
//		t1000.action();
//		System.out.println("=================================");
//		t10001.dance();
//		t10001.action();


	}
}
