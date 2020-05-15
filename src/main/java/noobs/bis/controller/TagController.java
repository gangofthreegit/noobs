package noobs.bis.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import noobs.bis.constant.CachedDataKeys;
import noobs.bis.constant.ControllerPrefix;
import noobs.bis.constant.HotData;

@RestController
@RequestMapping(ControllerPrefix.TAG)
public class TagController {
	
	@Autowired
	private RedisTemplate<String, HotData> redisTemplate;
	
	@GetMapping("/getTags")
	public Set<HotData> getTags() {
		Set<HotData> tags = redisTemplate.opsForSet().members(CachedDataKeys.TAGS);
		return tags;
	}
	
}
