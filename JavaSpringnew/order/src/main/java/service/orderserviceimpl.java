package service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import  dao.orderdao;
import model.order;



@Service
public class orderserviceimpl implements orderservice {
	
	@Autowired
	orderdao orderdao;

	@Override
	public order addOrder(order order) {
		// TODO Auto-generated method stub
		
		return orderdao.save(order);

	}

	@Override
	public order deleteOrder(Long orderId) {
		// TODO Auto-generated method stub
		orderdao.deleteById(orderId);
		return orderdao.findById(orderId).get();

	}

	@Override
	public List<order> viewAllOrders() {
		// TODO Auto-generated method stub
		return orderdao.findAll();

	}

	@Override
	public List<order> viewCustomerOrders(Long customerId) {
		// TODO Auto-generated method stub
		
		return orderdao.findAllByCustomerId(customerId);

	}

}