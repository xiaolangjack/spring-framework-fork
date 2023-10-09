package com.jack;

import com.jack.model.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created By: yy<workinglang@163.com>
 * Created At: 2022/5/2 0:15
 * <p></p>
 */

public class Demo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Person person = context.getBean("person", Person.class);
		System.out.println(person);
	}

}
