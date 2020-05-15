package noobs.bis.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages={"noobs.bis"}) // 扫描beans
@EnableJpaRepositories("noobs.bis.repository") // 扫描hibernate JPA repository
@EntityScan({"noobs.bis.entity"}) //扫描数据库表映射对象
@EnableJpaAuditing(auditorAwareRef="noobsAuditorAware") // 拦截处理auditor
@ServletComponentScan({"noobs.bis"}) //扫描servlet组件（filter，servlet...）
public class Starter {
	
	public static void main(String[] args) {
		SpringApplication.run(Starter.class, args);
	}
	
}
