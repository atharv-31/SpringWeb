package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.Student;

@Controller
public class StudentController {
	
	@GetMapping("/")
	public String openForm() {
		return "welcome";
	}

	@RequestMapping(value="/new" , method=RequestMethod.GET)
	public String studentRegistrationForm(Model model) {
		model.addAttribute("stud", new Student());

		return "studform";
	}
	
	//@RequestMapping(value="/save" , method=RequestMethod.POST)
	@PostMapping("/save")
	public String saveRecord(@ModelAttribute("stud") Student student) {
		System.out.println("--->"+student);
		
		return "redirect:/student/read";
		}
}
