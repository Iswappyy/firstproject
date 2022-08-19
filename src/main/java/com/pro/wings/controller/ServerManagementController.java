package com.pro.wings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pro.wings.entity.ServerManagement;
import com.pro.wings.service.ServerManagementService;

@Controller
public class ServerManagementController {
	
	@Autowired
	ServerManagementService serverManagement;
	
	@RequestMapping(value ="/addServer", method = RequestMethod.POST)
	public ModelAndView addServer(@RequestParam("name") String serverName, @RequestParam("ip") String serverIp, @RequestParam("capacity") String serverCapacity) {
		ModelAndView mv = new ModelAndView();
        mv.setViewName("welcome");
        
        ServerManagement serverObj = new ServerManagement();
        serverObj.setServerName(serverName);
        serverObj.setServerIp(serverIp);
        serverObj.setServerCapacity(serverCapacity);
        
        boolean storedServer = serverManagement.addServer(serverObj);
        String result = null;
        if(storedServer) {
        	result = "Server saved to database successfully";
        	mv.addObject("result", result);
        }
        else {
        	result = "Server Not save to database..";
        	mv.addObject("result", result);
        }
        return mv;

}
}
