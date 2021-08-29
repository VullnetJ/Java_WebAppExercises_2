
import java.util.ArrayList;
import java.util.List;
public class StudentDAOImplementing implements StudentDAO {
	List<Student> students;

	public StudentDAOImplementing() {

		students = new ArrayList<Student>();
		Student student1 = new Student("Ginger", "Baker", 40, "Rumputie 10", 54120, "PULP");
		Student student2 = new Student("Jack", "Bruce", 10, "Asematori 3", 00520, "HELSINKI");
		Student student3 = new Student("Eric", "Clapp", 20, "Luuttutie 4", 54120, "PULP");
		Student student4 = new Student("Diana", "Doe", 30, "Kuusikuja 6", 01200, "VANTAA");
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);

	}
	// Retrieve list of students from the database
	@Override
	public List<Student> getAllStudents() {
		return students;
	}

	@Override
	public Student getStudentByID(int id) {
		return students.get(id);
	}

}
