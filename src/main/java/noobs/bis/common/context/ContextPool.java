package noobs.bis.common.context;

import java.util.Optional;

public final class ContextPool {
	
	private static final ThreadLocal<Context> POOL = new ThreadLocal<Context>();
	
	public static final Optional<Context> get() {
		return Optional.ofNullable(POOL.get());
	}
	
	public static final void set(Context context) {
		POOL.set(context);
	}
	
}
