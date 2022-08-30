package fr.m2i.javaspring.controllers;

import fr.m2i.javaspring.entities.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
    @GetMapping("/student")
    public ModelAndView showStudent(){
        return new ModelAndView("student","command", new Student());
    }
    @RequestMapping(value = "/addStudent",method = RequestMethod.POST)
    public String addStudent(@ModelAttribute Student student, ModelMap model){
        model.addAttribute("name",student.getName());
        model.addAttribute("age",student.getAge());
        model.addAttribute("id",student.getId());
        return "result";
    }
}
