package com.makersacademy.acebook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

//	@Autowired
//	private PostRepository postRepository;
//
//	@Autowired
//	public HomeController(PostRepository postRepository){
//		this.postRepository = postRepository;
//	}

	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}

//	@RequestMapping(value = "api/createPost", method = RequestMethod.POST) {
//		public String createPost(@RequestParams String content) {
//			Post post = new Post(content);
//			postRepository.save(post);
//			return "redirect: index";
//		}
//	}
}
