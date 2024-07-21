package unidao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.unisubject;


@Repository
public interface unisubjectdao extends JpaRepository<unisubject,Long>{

}
