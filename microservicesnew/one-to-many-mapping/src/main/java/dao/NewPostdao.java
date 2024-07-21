package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import model.NewPost;
import model.Post;
public interface NewPostdao extends JpaRepository<NewPost,Long> {

	void save(Post post);

}

