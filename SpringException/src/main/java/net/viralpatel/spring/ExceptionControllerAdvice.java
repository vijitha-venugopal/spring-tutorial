package net.viralpatel.spring;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionControllerAdvice {

	@ExceptionHandler(Exception.class)
	public ModelAndView exception(Exception e) {
		
		ModelAndView model = new ModelAndView("exception");
		model.addObject("name", e.getClass().getSimpleName());
		model.addObject("message", e.getMessage());

		return model;
	}

}
