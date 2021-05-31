package kodlamaio.northwind.core.concretes;

import kodlamaio.northwind.core.abstracts.EmailVerificationService;
import kodlamaio.northwind.core.results.Result;
import kodlamaio.northwind.core.results.SuccessResult;

public class EmailVerificationManager implements EmailVerificationService  {

	@Override
	public Result send(String email) {
		
		return new SuccessResult("Mail gönderildi");
	}

}
