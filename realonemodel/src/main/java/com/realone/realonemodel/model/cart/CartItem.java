package com.realone.realonemodel.model.cart;

import com.realone.realonemodel.model.products.Product;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="cart_item")
public class CartItem {

	@Id
	@GeneratedValue
	private Long id;
	private Product product;
	private int quantity;
	@ManyToOne
	@JoinColumn(name="cart_id")
	private Cart cart;
	public CartItem() {
		super();
	}
	public CartItem(Long id, Product product, int quantity, Cart cart) {
		super();
		this.id = id;
		this.product = product;
		this.quantity = quantity;
		this.cart = cart;
	}
	@Override
	public String toString() {
		return "CartItem [id=" + id + ", product=" + product + ", quantity=" + quantity + ", cart=" + cart + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
}
