package com.makersacademy.acebook.model;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class PostTest {

	private Post post = new Post("hello");

	@Test
	public void postHasContent() {
		String testPost = "hello";
		assertThat(post.getContent(), containsString(testPost));
	}

	@Test
	public void postHasTimestamp() {
		String testDate = "2020-04-07";
		assertThat(post.getContent(), containsString(testDate));
	}
}
