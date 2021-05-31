package kodlamaio.northwind.core.abstracts;

import kodlamaio.northwind.core.results.Result;

public interface EmailVerificationService {
	public Result send(String email) ;
}
