package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
public class orderdto {
	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	Long orderId;
	
	String details;
	
	Long customerId;

	public orderdto() {
		super();
	}

	public orderdto(Long orderId, String details, Long customerId) {
		super();
		this.orderId = orderId;
		this.details = details;
		this.customerId = customerId;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	@Override
	public String toString() {
		return "order [orderId=" + orderId + ", details=" + details + ", customerId=" + customerId + "]";
	}
	
}
