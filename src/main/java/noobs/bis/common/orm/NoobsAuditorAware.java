package noobs.bis.common.orm;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import noobs.bis.common.context.Context;
import noobs.bis.common.context.ContextPool;

@Component("noobsAuditorAware")
public class NoobsAuditorAware implements AuditorAware<Long> {

	@Override
	public Optional<Long> getCurrentAuditor() {
		Optional<Context> opt = ContextPool.get();
		if (opt.isPresent()) {
			return Optional.of(opt.get().getUserId());
		}
		return Optional.of(-1L);
	}

}
