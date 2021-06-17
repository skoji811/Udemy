package com.example.demo.app.survey;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.app.inquiry.InquiryForm;

@Controller
@RequestMapping("/survey")
public class SurveyController {
	
	@GetMapping("/form")
	public String form(SurveyForm surveyForm,Model model,
			@ModelAttribute("complete")String complete) {
		model.addAttribute("title","Survey form");
		return "survey/form";
	}
	@PostMapping("/form")
	public String GoBack( SurveyForm surveyForm , Model model) {
		model.addAttribute("title","survey form");
		return "survey/form";
	}
	@PostMapping("/confirm")
	public String confirm(@Validated InquiryForm inquiryForm, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("title","InquiryForm");
			return "survey/form";
	}
	model.addAttribute("title","confirm page");
		return "inquiry/confirm";
}
	@PostMapping("/complete")
	public String complete(@Validated InquiryForm inquiryForm,
			BindingResult result,Model model,RedirectAttributes redirectAttributes) {
		if(result.hasErrors()) {
			model.addAttribute("title","Inquiry Form");
		return "inquiry/form";
	}
	redirectAttributes.addFlashAttribute("complete" , "Registerd!");
	return "redirect:/inquiry/form";
}
}
