package service;

import org.springframework.stereotype.Service;


@Service("demoService")
public class DemoServiceImpl implements DemoService {

	public String sayHello() {
		
		
		System.out.println("sayHello----------->");
		return null;
	}

}
