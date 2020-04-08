package com.makersacademy.acebook.model;

import org.junit.Test;

import java.sql.Timestamp;

import static org.junit.Assert.assertEquals;

public class PostTest {

	private Post post = new Post("Test Post");

	@Test
	public void postHasContent() {
		String testPost = "Test Post";
		assertEquals(testPost, post.getContent());
	}

	@Test
	public void postHasTimestamp() {
		Timestamp testDate = null;
		assertEquals(testDate, post.getTimestamp());
	}
}
