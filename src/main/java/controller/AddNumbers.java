package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.AddNumberService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class AddNumbers {

    @RequestMapping("/add")
    public ModelAndView addNumbers(@RequestParam("fnum") Integer fnum, @RequestParam("snum") Integer snum,
                                   HttpServletRequest request, HttpServletResponse response){
        AddNumberService addNumberService = new AddNumberService(fnum,snum);

        ModelAndView modelAndViewObject = new ModelAndView();

        modelAndViewObject.setViewName("views/result");
        modelAndViewObject.addObject("sum",addNumberService.getGetSum());

        return modelAndViewObject;
    }
}
