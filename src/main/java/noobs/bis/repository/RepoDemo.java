package noobs.bis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import noobs.bis.entity.user.User;

@Repository
public interface RepoDemo extends JpaRepository<User, Long> {
	
}
