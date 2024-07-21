package com.flipcart.ProductController;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flipcart.Product;
import com.flipcart.Service.Product_Service;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("api/products")
public class ProductController {
	 private Product_Service productService;
	 
	 @PostMapping
	 public ResponseEntity<Product> createUser(@RequestBody Product product){
	        Product saveProduct = productService.createProduct(product);
	        return new ResponseEntity<>(saveProduct, HttpStatus.CREATED);
	 }
	 
	 @GetMapping("{id}")
	 public ResponseEntity<Product> getUserById(@PathVariable("id") Long productId){
	       Product product = productService.getProductById(productId);
	        return new ResponseEntity<>(product, HttpStatus.OK);
	    }
	 
	 @GetMapping
	 public ResponseEntity<List<Product>> getAllUsers(){
	        List<Product> products = productService.getAllProducts();
	        return new ResponseEntity<>(products, HttpStatus.OK);
	    }
	 
	 @PutMapping("{id}")
	 public ResponseEntity<Product> updateUser(@PathVariable("id") Long productId,
             @RequestBody Product product){
		 
         Product updateProduct = productService.updateProduct(productId, product);
         return new ResponseEntity<>(updateProduct, HttpStatus.OK);
      }
	 
	 @DeleteMapping("{id}")
	 public ResponseEntity<String> deleteUser(@PathVariable("id") Long productId){
	        productService.deleteProducts(productId);
	        return new ResponseEntity<>("User successfully deleted!", HttpStatus.OK);
	    }

}
