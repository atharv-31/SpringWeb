package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.Student;

@Controller
public class StudentController {

	@RequestMapping(value="/")
	public String welcomeForm() {
		
		return "welcome";
	}
	
	@RequestMapping(value="/open")
	public String openRegistrationForm(Model model) {
		model.addAttribute("stud",new Student());
		return"studform";
	}
	
	@RequestMapping(value="/save" ,method=RequestMethod.POST)
	public String saveSatudentForm(@ModelAttribute ("stud") Student student) {
		System.out.println(student);
		return "display";
	}
}
