package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer")
public class customer {
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	Long customerId;
	String customerName;
	String city;
	String membership;
	public customer() {
		super();
	}
	public customer(Long customerId, String customerName, String city, String membership) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.city = city;
		this.membership = membership;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMembership() {
		return membership;
	}
	public void setMembership(String membership) {
		this.membership = membership;
	}
	@Override
	public String toString() {
		return "customer [customerId=" + customerId + ", customerName=" + customerName + ", city=" + city
				+ ", membership=" + membership + "]";
	}
	
	
}
