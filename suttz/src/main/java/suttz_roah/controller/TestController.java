package suttz_roah.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * Created by asrh0 on 2017/6/29.
 */
@EnableAutoConfiguration
@Controller
public class TestController {
    @RequestMapping("test")
    public ModelAndView test(){
        ModelAndView m=new ModelAndView();
        String demo="demo";
        m.addObject("demo",demo);
        m.setViewName("index");
        return m;
    }
    @RequestMapping(value="login",method= RequestMethod.POST)
    public ModelAndView Submit(HttpSession session){
        ModelAndView m=new ModelAndView();

        return m;
    }

}
