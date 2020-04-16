package com.makersacademy.acebook.controller;

import com.makersacademy.acebook.model.Post;
import com.makersacademy.acebook.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@Autowired
	private PostRepository postRepository;

	@Autowired
	public HomeController(PostRepository postRepository){
		this.postRepository = postRepository;
	}

	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}

	@RequestMapping(value = "api/createPost", method = RequestMethod.POST) {
		public String createPost(@RequestParams String content) {
			Post post = new Post(content);
			postRepository.save(post);
			return "redirect: index";
		}
	}
}
