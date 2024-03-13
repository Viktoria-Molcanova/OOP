import java.util.Collections;
import java.util.Iterator;

public class StudentGroupService {
    private StudentGroup studentsGroup;

    public StudentGroupService(StudentGroup students) {
        this.studentsGroup = students;
    }

    public boolean removeStudent(String surname, String firstname, Integer Age) {
        Iterator<Student> interatorStudents = studentsGroup.iterator();
        while (interatorStudents.hasNext()) {
            Student student = interatorStudents.next();
            if (student.getSurname().equals(surname) && student.getFirstname().equals(firstname)
                    && student.getAge().equals(Age)) {
                interatorStudents.remove();
                return true;
            }
        }
        return false;
    }

    public void sortStudentsById(){
        Collections.sort(studentsGroup.getStudentGroup());
    }

    public void sortStudentsByName(){
        studentsGroup.getStudentGroup().sort(new StudentComparator());
        
    }

    public StudentGroup getStudentsGroup() {
        return studentsGroup;
    }

    public void setStudentsGroup(StudentGroup students) {
        this.studentsGroup = students;
    }
}
