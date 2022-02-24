package br.com.stark.invoice.invoiceTrial;

import com.starkbank.*;
import com.starkbank.utils.Generator;

public class test {
	public static void main(String[] args) {
		String privateKeyContent = "-----BEGIN EC PRIVATE KEY-----\n"
				+ "MHQCAQEEIBCUgqBo7v84iMpoyciqqe8pabsv5vh7VjBaXYM5XbEroAcGBSuBBAAK\n"
				+ "oUQDQgAElvMZeKIdKxTeNQ398gmBj9/Txii7Sf71irgxW2UHzsgedgTbm6LcLAju\n"
				+ "hB5AVxt9A/yZWsnSi+nz4J3NaXV0Dw==\n"
				+ "-----END EC PRIVATE KEY-----";
		
		try {
			Project project = new Project("sandbox", "4750343523008512", privateKeyContent);
			
			Settings.user = project;
			
			Settings.language = "pt-BR";
			
			Generator<Webhook> webhooks = Webhook.query();
			
			for(Webhook webhook : webhooks) {
				System.out.println(webhook);
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
