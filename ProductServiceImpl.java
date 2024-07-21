package com.flipcart.ServiceImpl;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.flipcart.Product;
import com.flipcart.Service.Product_Service;
import com.flipcart.repository.ProductRepository;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class ProductServiceImpl implements Product_Service {
	private ProductRepository productRepository;

	@Override
	public Product createProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product getProductById(Long productId) {
		 Optional<Product> product = productRepository.findById(productId);
	        return product.get();
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public Product updateProduct(Long productId, Product product) {
		Product existingProduct = productRepository.findById(product.getProductID()).get();
		existingProduct.setCategory(product.getCategory());
		existingProduct.setGroupName(product.getGroupName());
		existingProduct.setPrice(product.getPrice());
		existingProduct.setProductName(product.getProductName());
        Product updatedProduct = productRepository.save(existingProduct);
        return updatedProduct;
	}

	@Override
	public void deleteProducts(Long productId) {
		// TODO Auto-generated method stub
		productRepository.deleteById(productId);
	}

	


	

}
