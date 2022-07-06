package com.project.Service.Impl;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.DTO.ProductDto;
import com.project.Entity.Product;
import com.project.Exception.ResourceNotFoundException;
import com.project.Repository.ProductRepository;
import com.project.Service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private  ProductRepository productRepository;
	
	@Override
	public Product saveProduct(Product product) {
		
		return productRepository.save(product);
	}
	@Override
	public ProductDto GetProductById(long pId) {
		
		Optional<Product> product=productRepository.findById(pId);
		
		if(product.isPresent()) {
			 Product product2 = product.get();	
				  ProductDto productDto1=new ProductDto();
				  productDto1.setpId(product2.getpId());
				  productDto1.setpName(product2.getpName());
				  productDto1.setpCategory(product2.getpCategory());
				  productDto1.setpPrice(product2.getpPrice());
				  productDto1.setpQuantity(product2.getpQuantity());
		    long pPrice=product2.getpPrice();
			long Gst=10;
	         
			long totalPrice=Gst+pPrice ;
		
			productDto1.setTotalPrice(totalPrice);
			
			long discount_price=5;
			
			long salePrice= ((100-discount_price)*pPrice)/100;
			
			productDto1.setSalePrice(salePrice);
		return productDto1;
	
		}
		else {
			throw new ResourceNotFoundException("Product","pId","pid");
			
			
		}
	}
	
}