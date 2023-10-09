package com.jack.config;

import com.jack.model.Person;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
 * Created By: Jacky<workinglang@163.com>
 * Created At: 2023/9/23 0:41
 * <p></p>
 */
@Configurable
public class Config {
	@Bean(name = "person1")
	private Person person(){
		return new Person("Jacky","18");
	}
}
