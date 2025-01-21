package com;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class SmsSending {
	public static void main(String[] args) {
		
		try {
			HttpResponse response = Unirest.get("https://www.fast2sms.com/dev/bulkV2?authorization=WXfAe5cjnlMG0thTkdLD9IsgRyZbS7w41UzP3H8mKiqQNVEova9vDJtywEXpMNoUieOfPlq1r8HhdnTL&variables_values=5599&route=otp&numbers=9099613040")
					  .header("cache-control", "no-cache")
					  .asString();
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
