package service;



import java.util.List;

import model.order;



public interface orderservice {
	
	public order addOrder(order order);
	public order deleteOrder(Long orderId);
	public List<order> viewAllOrders();
	public List<order> viewCustomerOrders(Long customerId);

}