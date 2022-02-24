package br.com.stark.invoice.invoiceTrial;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class ServiceHandler implements RequestHandler<String, Object>{

	@Override
	public Object handleRequest(String input, Context context) {
		context.getLogger().log("Input: " + input);
		return "Lambda Function is invoked...." + input;
	}
	
}
