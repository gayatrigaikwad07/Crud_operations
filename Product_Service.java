package com.flipcart.Service;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.flipcart.Product;
public interface Product_Service {
	


	public Product createProduct(@RequestBody Product product);
	
	public Product getProductById(@PathVariable("id") Long productId);
        
        
    public List<Product> getAllProducts();
    
    public Product updateProduct(@PathVariable("id") Long productId,@RequestBody Product product);
    	
    
    public void deleteProducts(@PathVariable("id") Long productId);

}
	