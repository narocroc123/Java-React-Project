package com.makersacademy.acebook.model;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

import org.junit.Test;

import java.sql.Timestamp;
import java.time.LocalDateTime;

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
