

public class StudentListProgram {
	public static void main(String[] args) {

		StudentDAO studentDao = new StudentDAOImplementing();

		// print all students
		System.out.println("=== Print students (DAO version) ===");
		for (Student student : studentDao.getAllStudents()) {
			System.out.println(student.getId() + ": " + student.getName() + " " + student.getSurname() + ", "
					+ student.getStreetname() + ", " + student.getPostcode() + " " + student.getCity());
		}
		Student student = studentDao.getAllStudents().get(2);
		System.out.println("=== Find student by id (DAO version) ===");
		// get the student
		System.out.println("Enter student id: 20");
		studentDao.getStudentByID(2);
		System.out.println(student.getId() + ": " + student.getName() + " " + student.getSurname() + ", "
				+ student.getStreetname() + ", " + student.getPostcode() + " " + student.getCity());

	}
}
