package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.customer;

@Repository
public interface customerdao extends JpaRepository<customer,Long>{

}
