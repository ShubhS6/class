package exp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class DemoMain {
	public static void main(String []args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(config.class);
		student std=context.getBean("firststudent",student.class);
		std.study();
	}
}
