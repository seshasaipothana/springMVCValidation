package com.springDemo.mvc.controller;

import com.springDemo.mvc.model.Customer;
import jakarta.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class,stringTrimmerEditor);
    }
    @GetMapping("/show")
    public String showForm(Model model){
        model.addAttribute("customer",new Customer());
        return "customer-form";
    }
    @PostMapping("/processForm")
    public String process(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult){
        System.out.println(customer.getAge());
        System.out.println("Binding result : " + bindingResult.toString());
        System.out.println("|" + customer.getFirstName() + "|");
        System.out.println("|" + customer.getLastName() + "|");

        if (bindingResult.hasErrors()){
            return "customer-form";
        }
        else{
            return "customer-confirmation";
        }

    }
}
