package Bean;

import java.sql.SQLException;
import java.util.List;

public interface StudentDao {
	public List<Student>findAll() throws ClassNotFoundException, SQLException;
	public void insertStudent(Student s) throws ClassNotFoundException, SQLException;
	public void updateStudent(Student s) throws ClassNotFoundException, SQLException;
	public void deleteStudent(Student s) throws ClassNotFoundException, SQLException;


}
