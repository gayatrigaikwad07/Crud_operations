package com.flipcart;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Product")
public class Product {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ProductId")	
	private Long productID;
    
	@Column(name = "GroupName")
	private String groupName;
    
	@Column(name = "Category")
	private String category;
	
	@Column(name = "ProductName")
    private String productName;
    
	@Column(name = "Price")
    private Long price;

	public Long getProductID() {
		return productID;
	}

	public void setProductID(Long productID) {
		this.productID = productID;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	
	
    
}
