package com.excelr.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.excelr.model.Player;

@Controller
public class HelloController {

	@RequestMapping("/greet")
	public String greet(Model model)
	{
		String name="Dhoni";
		System.out.println("Welcome "+name);
		model.addAttribute("player",name);
		return "virat";
	}
	
	@RequestMapping("/csk")
	public String csk(Model model)
	{
		Player p1=new Player(7,"Dhoni",100,10000);
		model.addAttribute("player",p1);
		return "ipl";
	}
	
	@RequestMapping("/mi")
	public String mi(ModelMap modelmap)
	{
		Player p1=new Player(45,"Rohit",50,5000);
		modelmap.addAttribute("player",p1);
		return "mi";
	}
	
	@RequestMapping("/rcb")
	public ModelAndView rcb()
	{
		Player p1=new Player(18,"Virat",70,7000);
		ModelAndView mav=new ModelAndView();
		mav.setViewName("virat");
		mav.addObject("player",p1);
		return mav;
	}
	
	
	@RequestMapping("/ict")
	public ModelAndView ict()
	{
		Player p1=new Player(33,"Shubman",10,1000);
		Player p2=new Player(69,"Surya",20,2000);
		ModelAndView mav=new ModelAndView();
		
		System.out.println("1. Test");
		System.out.println("2. T20");
		
		int choice=3;
		switch(choice)
		{
		case 1 : 
			mav.setViewName("test");
			mav.addObject("captain",p1);
			break;
			
		case 2 : 
			mav.setViewName("t20i");
			mav.addObject("captain",p2);
			break;
			
		default :
			mav.setViewName("error-page");
			mav.addObject("message","No Data Found");
			
		}
	
		
		return mav;
	}
	
	@RequestMapping("/playerList")
	public ModelAndView playerList()
	{
		Player p1=new Player(7,"Dhoni",100,10000);
		Player p2=new Player(33,"Shubman",10,1000);
		Player p3=new Player(69,"Surya",20,2000);
		Player p4=new Player(18,"Virat",70,7000);
		Player p5=new Player(45,"Rohit",50,5000);
		
		List<Player> team=new ArrayList(Arrays.asList(p1,p2,p3,p4,p5));
		ModelAndView mav=new ModelAndView();
		mav.setViewName("india");
		mav.addObject("players",team);
		return mav;
	}
	
	@RequestMapping("/addNewPlayerForm")
	public ModelAndView addNewPlayerForm()
	{
		Player p1=new Player();		//jno=0, pname=null mp=0 rs=0
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("add-player-form");
		mav.addObject("player",p1);
		return mav;
	}
	
	@PostMapping("/addPlayer")
	public ModelAndView addPlayer(@ModelAttribute Player player)
	{
		System.out.println(player);
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("confirm");
		mav.addObject("player",player);
		return mav;
	}
}
