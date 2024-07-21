package ordercontroller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.order;
import service.orderservice;



@RestController
@RequestMapping("/order")
public class ordercontroller {
	
	@Autowired
	orderservice service;
	
	@GetMapping
	public List<order> viewAllOrders() {
		return service.viewAllOrders();
	}
	
	@GetMapping("/customer/{customerId}")
	public List<order> viewCustomerOrders(@PathVariable Long customerId) {
		System.out.println("order contoller is called order service");
		return service.viewCustomerOrders(customerId);
	}
	
	@PostMapping
	public order addOrder(@RequestBody order order) {
		return service.addOrder(order);
	}
	
	@DeleteMapping("/{orderId}")
	public order deleteOrder(@PathVariable Long orderId) {
		return service.deleteOrder(orderId);
	}
	

}