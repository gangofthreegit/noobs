package noobs.bis.startup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;

import noobs.bis.constant.CachedDataKeys;
import noobs.bis.constant.HotData;

@Configuration
public class Startup {
	
	public Startup(@Autowired RedisTemplate<String, Object> redisTemplate) {
		redisTemplate.opsForSet().add(CachedDataKeys.TAGS, HotData.values());
	}
	
}
