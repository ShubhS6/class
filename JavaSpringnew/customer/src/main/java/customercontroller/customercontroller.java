package customercontroller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.customer;
import service.customerservice;
@RestController
@RequestMapping("/customer")
public class customercontroller {
	@Autowired
	customerservice service;
	
	@GetMapping
	public List<customer> viewAllCustomers() {
		return service.viewallcustomers();
	}
	
	@PostMapping
	public customer addCustomer(@RequestBody customer customer) {
		return service.addcustomer(customer);
	}
	
	@DeleteMapping("/{customerId}")
	public customer deleteCustomer(@PathVariable Long customerId) {
		return service.deletecustomer(customerId);
	}
	
	@GetMapping("/orders/{customerId}")
	public void viewcustomerorders(@PathVariable Long customerId) {
		service.viewcustomerorders(customerId);
	}
}
