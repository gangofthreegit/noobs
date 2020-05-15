package noobs.bis.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import noobs.bis.constant.Gender;
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
	
	@GetMapping("/save")
	public void saveDemoDataForUser() {
		User u = new User();
		u.setAddress("addr");
		u.setDateOfBirth(new Date());
		u.setEmail("test@test.com");
		u.setFamilyName("李");
		u.setGender(Gender.FEMALE);
		u.setGivenName("美丽");
		u.setMobile("18888888888");
		repoDemo.save(u);
	}
	
	@GetMapping("/update")
	public void updateExistingDemoDataForUser() {
		User u = repoDemo.getOne(1L);
		u.setGivenName("六六");
		repoDemo.save(u);
	}
	
}
