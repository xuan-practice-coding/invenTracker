package com.xuan.inventory.controller;
import java.util.List;

import com.xuan.inventory.domain.Product;
import com.xuan.inventory.service.ProductService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<Product> listproduct = productService.listAll();
        model.addAttribute("listproduct", listproduct);
        System.out.print("Get / ");
        return "index";
    }

    @GetMapping("/new")
    public String add(Model model) {
        model.addAttribute("product", new Product());
        return "new";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("product") Product product) {
        productService.save(product);
        return "redirect:/";
    }

    @RequestMapping("/edit/{pid}")
    public ModelAndView showEdiProductPage(@PathVariable(name = "pid") int pid) {
        ModelAndView mav = new ModelAndView("new");
        Product std = productService.get(pid);
        mav.addObject("product", std);
        return mav;

    }
    @RequestMapping("/delete/{pid}")
    public String deleteProduct(@PathVariable(name = "pid") int pid) {
        productService.delete(pid);
        return "redirect:/";
    }
} // end class