package spring.demo.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

	public String Verify(String username,String password){
		
		if(username.equals("root") && password.equals("root")){
			return "Login Success！";
		}else{
			return "Login Failed,Please Try Again！";
		}
	}
}
