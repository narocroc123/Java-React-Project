package com.makersacademy.acebook.model;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

import org.junit.Test;

import java.time.LocalDateTime;

public class PostTest {

	private Post post = new Post("hello");

	@Test
	public void postHasContent() {
		String testPost = "hello";
		assertEquals(post.getContent(), testPost);
	}

//	@Test
//	public void postHasTimestamp() {
//		String testDate = "2020-04-07";
//		assertEquals(post, testDate);
//	}
}
