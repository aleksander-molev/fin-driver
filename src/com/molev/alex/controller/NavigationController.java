package com.molev.alex.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.molev.alex.form.Contact;
import com.molev.alex.html.ProductHTML;
import com.molev.alex.service.ContactService;


@Controller
public class NavigationController 
{

    @Autowired
    private ContactService contactService;
       
    
    @RequestMapping("/startPage")
    public String getStartPage(Map<String, Object> map)
    {
    	String redirectTo = "startPage"; 
        System.out.println("\n\n=============\n" + "Navigation controller ["+ redirectTo +"]" + "\n=============\n\n");
        return redirectTo;
    }
    
    
    @RequestMapping("/index")
    public String listContacts(Map<String, Object> map) 
    {
        map.put("contact", new Contact());
        map.put("contactList", contactService.listContact());
        System.out.println("\n\n=============\n" + "Index hit!!!" + "\n=============\n\n\n");
        return "contact";        
    }
    
    @RequestMapping("/welcome")
    public String welcomeMethod(Map<String, Object> map) 
    {

        System.out.println("\n\n=============\n" + "Index hit!!!" + "\n=============\n\n\n");
        return "welcome";        
    }
}
