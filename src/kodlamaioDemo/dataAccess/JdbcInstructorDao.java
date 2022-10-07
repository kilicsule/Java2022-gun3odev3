package kodlamaioDemo.dataAccess;

import kodlamaioDemo.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Jdbc ile veritabanına eklendi: " + instructor.getFirstName()+ " " + instructor.getLastName());
		
	}

}
