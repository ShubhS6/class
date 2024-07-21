package signup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class userservice {
	@Autowired
    private userRepository userRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void signup(String username, String password) {
        // Check if the username already exists
       // if (userRepository.findByUsername(username) != null) {
         //   throw new RuntimeException("Username already exists");
        //}

        // Create a new user entity
        user newUser = new user();
        newUser.setUsername(username);
        newUser.setPassword(password);

        // Save the user to the 'users' table
        userRepository.save(newUser);

        // Create a table named after the username if needed
        createTable(username);
    }

    private void createTable(String tableName) {
        // Example of creating a table dynamically (not recommended for user data)
        String sql = "CREATE TABLE " + tableName + " (id INT AUTO_INCREMENT PRIMARY KEY, dish Name VARCHAR(255),Price VARCHAR(255))";
        entityManager.createNativeQuery(sql).executeUpdate();
    }
}
