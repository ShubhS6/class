package service;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import dao.customerdao;
import model.customer;
import model.orderdto;

@Service
public class customerserviceimpl implements customerservice {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	private customerdao customerdao;
	
	@Override
	public customer addcustomer(customer customer) {
		// TODO Auto-generated method stub
		return customerdao.save(customer);
	}

	@Override
	public customer deletecustomer(Long customerId) {
		// TODO Auto-generated method stub
		customerdao.deleteById(customerId);
		
		return customerdao.findById(customerId).get();
	}

	@Override
	public List<orderdto> viewcustomerorders(Long customerId) {
		// TODO Auto-generated method stub
		String url= "http://localhost:8082/order/customer/"+customerId;
		return restTemplate.getForObject("http://localhost:8082/order/customer/"+customerId, List.class);
		//return restTemplate.getForObject("http://ORDER-SERVICE/orders/customer/"+customerId, List.class);
	}

	@Override
	public List<customer> viewallcustomers() {
		// TODO Auto-generated method stub
		return customerdao.findAll();
	}
}
