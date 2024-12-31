package com.realone.realonemodel.model.cart;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.realone.realonemodel.model.products.Product;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="cart")
public class Cart {

	@Id
	@GeneratedValue
	private Long id;
	private Date creationDate;
	
	@OneToMany(mappedBy = "cart", cascade = CascadeType.ALL)
	private List<CartItem> items = new ArrayList<>();

	public Cart() {
		super();
	}

	public Cart(Long id, Date creationDate, List<CartItem> items) {
		super();
		this.id = id;
		this.creationDate = creationDate;
		this.items = items;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", creationDate=" + creationDate + ", items=" + items + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public List<CartItem> getItems() {
		return items;
	}

	public void setItems(List<CartItem> items) {
		this.items = items;
	}
	
	public void addItem(Product product, int quantity) {
		for(CartItem item: items) {
			if(item.getProduct().getId().equals(product.getId())) {
				item.setQuantity(item.getQuantity() + quantity);
				return;
			}
		}
		CartItem newItem = new CartItem();
		newItem.setProduct(product);
		newItem.setQuantity(quantity);
		newItem.setCart(this);
	}
	
	public void removeItem(Product product) {
		items.removeIf(item -> item.getProduct().getId().equals(product.getId()));
	}
}
