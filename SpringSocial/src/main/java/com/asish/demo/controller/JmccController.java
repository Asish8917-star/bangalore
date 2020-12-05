package com.asish.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.asish.demo.entity.Jmcc_Patrapur;
import com.asish.demo.service.JmccServiceImpl;

@Controller
public class JmccController {
	@Autowired
	private JavaMailSender sender;
	@Autowired
	private JmccServiceImpl service;
	@GetMapping("/")
	public String getAll(ModelMap m){
		Jmcc_Patrapur jm=new Jmcc_Patrapur();
		  m.put("jmccnew", jm);
		m.put("jmcc", service.getAll());
		return "home";	
	}
	
	/*
	 * @GetMapping("/new") public String register(ModelMap m) { Jmcc_Patrapur jm=new
	 * Jmcc_Patrapur(); m.put("jmccnew", jm); return "create"; }
	 */
	 
	
	@PostMapping("/create")
	public String create(@ModelAttribute("jmccnew")Jmcc_Patrapur jm, BindingResult result) {
		if(result.hasErrors()&&jm.getId()==0) {
			service.update(jm);
		}
		service.create(jm);
		return "redirect:/";
	}
	@GetMapping("/update")
	public String update(@RequestParam("id")int id,ModelMap m) {
		Optional<Jmcc_Patrapur>result=service.getById(id);
		m.put("jmccnew", result);
		return "home";
	}
	@GetMapping("/delete")
	public String delete(@RequestParam("id") int id) {
		service.delete(id);
		return "redirect:/";
	}
	
	@PostMapping("/send")
	public @ResponseBody String mailSender(HttpServletRequest req,String a,String b,String c) {
		 a=req.getParameter("abc");
		 b=req.getParameter("sub");
		 c=req.getParameter("text");
		SimpleMailMessage message=new SimpleMailMessage();
		message.setTo(a);
		message.setSubject(b);
		message.setText(c);
		sender.send(message);
		
		return "Message Sent Successfully...!!";
	}
	/*
	 * @ResponseBody
	 * 
	 * @GetMapping("/success") public String success() { return
	 * "Message Sent Successfully...!!"; }
	 */
	

}
