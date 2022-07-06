package com.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.project.Entity.Product;



public interface ProductRepository extends JpaRepository<Product, Long> {


	
	

}
