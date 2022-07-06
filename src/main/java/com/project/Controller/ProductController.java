package com.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.DTO.ProductDto;
import com.project.Entity.Product;
import com.project.Service.ProductService;

@Controller
public class ProductController {
	
	
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("/Product/New") 
	public ResponseEntity<Product> save(@RequestBody Product product) {
	  
	  
	  return new ResponseEntity<Product>(productService.saveProduct(product),HttpStatus.CREATED);
	  
	  }
	
	@GetMapping("{id}")
	@ResponseBody
	public ResponseEntity<ProductDto> getProductById(@PathVariable("id")long pId){ 
		

		return new ResponseEntity<ProductDto>(productService.GetProductById(pId),HttpStatus.OK);}
		

}
