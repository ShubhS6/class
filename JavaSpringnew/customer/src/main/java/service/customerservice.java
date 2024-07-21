package service;
import java.util.List;

import model.customer;
import model.orderdto;
public interface customerservice {
	public customer addcustomer(customer customer);
	public customer deletecustomer(Long customerId);
	public List<orderdto> viewcustomerorders(Long customerId);
	public List<customer> viewallcustomers();
}
