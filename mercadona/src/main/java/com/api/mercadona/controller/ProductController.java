package com.api.mercadona.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.api.mercadona.dao.ProductDAO;
import com.api.mercadona.model.Product;

@Controller
public class ProductController {
	@Autowired
	 private ProductDAO productDAO;
	 
	 @RequestMapping("/")
	 public String index (Model model) {
		 model.addAttribute("list", productDAO.findAll());
		 return "index";
	 }
	 
	 @GetMapping("/save/{id}")
	 public String showSave(@PathVariable("id") Long id, Model model) {
	  if (id != null && id != 0) {
	   model.addAttribute("product", productDAO.getReferenceById(id));
	  } else {
	   model.addAttribute("product", new Product());
	  }
	  return "save";
	 }
	 
	 @PostMapping("/save")
	 public String save(Product producto, Model model) {
		 productDAO.save(producto);
	  return "redirect:/";
	 }
	 
	 @GetMapping("/delete/{id}")
	 public String delete(@PathVariable Long id, Model model) {
		 productDAO.deleteById(id);
	 
	  return "redirect:/";
	 }
}
