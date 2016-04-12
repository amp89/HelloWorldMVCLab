package hw;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldMVC {

	@RequestMapping("sayHi.do")
	public ModelAndView printSomeThings(@RequestParam("name") String name){
		
		String greeting = "Hello " + name + "!";
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.jsp");
		mv.addObject("greeting",greeting);
		
		return mv;
			
	}
	
}
