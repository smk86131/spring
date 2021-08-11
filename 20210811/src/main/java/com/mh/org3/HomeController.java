package com.mh.org3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		/*logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );*/
		
		return "home";
		}
	
		@RequestMapping(value = "/insert", method = RequestMethod.GET)
		public String insert(Model model) {
			
			return "insert";
			
		}
		
		@RequestMapping(value = "/bb", method = RequestMethod.GET)
		public String bb(Model model) {
			
			return "bb";
			
		}
		
		@RequestMapping(value = "/cc", method = RequestMethod.GET)
		@ResponseBody
		public String cc(Model model) {
			
			return "{a:'aa', b:'bb'}";
			
		}
	}
	
