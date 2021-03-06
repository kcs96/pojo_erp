package com.erp;

import org.apache.log4j.Logger;

public class ControllerMapper {
	
	public static Controller getController(String command) {
		Logger logger = Logger.getLogger(ControllerMapper.class);
		Controller controller = null;
		String commands[] = command.split("/"); 
			
			if(commands.length==2) { 
				String work = commands[0];
				String requestName = commands[1];
				logger.info("work ==>"+work   );
				logger.info("requestName ==>"+requestName);
				if("emp".equals(work)) {
					//로그인 컨트롤러
					controller = new EmpController(requestName);
				}else if("myService".equals(work)) {
					//myService메뉴 
					controller = new MyServiceController(requestName);
				}else if("work".equals(work)) {
					//work메뉴
					controller = new WorkController(requestName);
				}else if("conference".equals(work)) {
					//conference메뉴
					controller = new ConferenceController(requestName);
				}else if("chat".equals(work)) {
					//chat메뉴
					controller = new ChatController(requestName);
				}
			}
		return controller;
	}//////end of getController
}
