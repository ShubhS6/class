package students;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class StudentDaoImpl implements StudentDao {
	Statement st = null;
	PreparedStatement pst = null;
	ResultSet rs= null;
	Connection con= null;
	List<Student> students = null;
	int k=0;
	
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		students = new ArrayList<>();
		con = DbConnection.getDatabaseConnection();
			try {
				st = con.createStatement();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		String query = "select * from students";
			try {
				rs = st.executeQuery(query);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				while(rs.next()) {
					students.add(new Student(rs.getInt(1),rs.getString(2),rs.getInt(3)));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		return students;
	}
}
