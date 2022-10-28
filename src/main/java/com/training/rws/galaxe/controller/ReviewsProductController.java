package com.training.rws.galaxe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.rws.galaxe.client.ProductClient;
import com.training.rws.galaxe.model.Product;

@RestController
@RequestMapping("reviewsproduct")
public class ReviewsProductController {

	@Autowired
	ProductClient productClient;
	
	@GetMapping("/getProduct/{productId}")				// http://localhost:9091/reviewsproduct/getProduct/125
	public Product getProduct(@PathVariable("productId")int productId) {
			return productClient.getProductFromProductService(productId);
	}

}
