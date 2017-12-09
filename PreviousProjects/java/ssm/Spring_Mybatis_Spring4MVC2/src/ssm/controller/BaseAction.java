package ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import ssm.service.AllService;

@Controller
public class BaseAction {
	@Autowired
	private AllService   allService;
	
	public   AllService   getaAllService()
	{
		System.out.println("allService.hashCode="+((Object) allService).hashCode());
		return  allService;
	}

}
