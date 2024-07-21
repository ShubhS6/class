package unicontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import unidao.unisubjectdao;
import unidao.uniteacherdao;
import model.unisubject;
import model.uniteacher;


@SpringBootApplication
public class uniApp implements CommandLineRunner{
	@Autowired
	uniteacherdao uniteacherdao;
	
	@Autowired
	unisubjectdao unsubjectdao;
	
	
	public static void main(String[] args) {
		SpringApplication.run(uniApp.class, args);
	}
	
	
	public void run(String... args) throws Exception {
		unisubject unisubject1 = new unisubject(100,"DBMS");
		uniteacher uniteacher1 = new uniteacher(100,"praveen",100);
		
		uniteacherdao.save(uniteacher1);
	}
	
}
