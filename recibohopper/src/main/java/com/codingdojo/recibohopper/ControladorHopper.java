package com.codingdojo.recibohopper;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControladorHopper {
	
    @RequestMapping("/")
    public String index(Model model) {
        
        String name = "Alexander G";
        String itemName = "Alambre de plata";
        double price = 5.25;
        String description = "Tiras de metal, otra ilustración de nanosegundos.";
        String vendor = "Tienda de la esquina Pequeñas Cosas";
    
    	model.addAttribute("first",name);
    	model.addAttribute("item",itemName);
    	model.addAttribute("price",price);
    	model.addAttribute("description",description);
    	model.addAttribute("vendor",vendor);
    
        return "index.jsp";
    }
   
    

}
