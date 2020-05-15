package noobs.bis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import noobs.bis.entity.user.User;
import noobs.bis.repository.RepoDemo;

@RestController
@RequestMapping("/demo")
public class DemoController {

	@Autowired
	private RepoDemo repoDemo;
	
	@Autowired
	private RedisTemplate<String, Object> redisTemplate;
	
	@GetMapping("/test")
	public User getUser() {
		return repoDemo.getOne(1L);
	}
	
	@GetMapping("/redis")
	public String getFromRedis() {
		User u = repoDemo.getOne(1L);
		redisTemplate.opsForHash().put("test", 1L, u.getFamilyName() + u.getGivenName());
		String username = (String) redisTemplate.opsForHash().get("test", 1L);
		return username;
	}
	
}
