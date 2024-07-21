package dao;
import org.springframework.data.jpa.repository.JpaRepository;

import model.Post;
public interface Postdao extends JpaRepository<Post,Long> {

}
