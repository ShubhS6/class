package dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.order;

@Repository
public interface orderdao extends JpaRepository<order,Long>{
	public List<order> findAllByCustomerId(Long customerId);
}
