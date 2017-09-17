package com.pharamaeasy.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pharamaeasy.base.Itest;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:META-INF/spring/test-datasource-beans.xml",
		"classpath:/META-INF/spring/applicationContext.xml" })
public class TestInterface {

	@Autowired
	private Itest test;

	@Test
	public void testService() {
		test.test();
	}

}
