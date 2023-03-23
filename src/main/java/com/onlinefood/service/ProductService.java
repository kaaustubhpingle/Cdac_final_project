package com.onlinefood.service;

import org.springframework.web.multipart.MultipartFile;

import com.onlinefood.model.Product;

public interface ProductService {
	
	void addProduct(Product product, MultipartFile productImmage);

}
