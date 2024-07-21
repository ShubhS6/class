package unidao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import model.uniteacher;


@Repository

public interface uniteacherdao extends JpaRepository<uniteacher,Long>{

}
