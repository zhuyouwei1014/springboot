package com.cssl.test;

import org.springframework.beans.factory.annotation.Autowired;

import com.cssl.entity.User;

public class Test {
		@Autowired
		private User u;
		public void ss() {
			u.setName("dnwk");
		System.out.println(u.getName());
		}
}
