package com.example;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Initiator 
{
	@Autowired
	Publisher publisher;
	
	@RequestMapping("test")
	public void fireEvent() 
	{
		Map<String,Object> data = new HashMap<>();
		data.put(DATA_TYPE.hello.name(), "Hello World!");
		NotificationData nData = new NotificationData();
		nData.setEvent(com.example.Event.test);
		nData.setData(data);
		publisher.fireEvent(nData);
	}
}
