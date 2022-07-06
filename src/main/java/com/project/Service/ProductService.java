package com.project.Service;

import com.project.DTO.ProductDto;
import com.project.Entity.Product;


public interface ProductService {
	Product saveProduct(Product product);
	
	ProductDto GetProductById(long pId);

}
