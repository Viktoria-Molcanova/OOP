import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student arg0, Student arg1) {
        String name0 = arg0.getSurname() + arg0.getFirstname() + arg0.getAge();
        String name1 = arg1.getSurname() + arg1.getFirstname() + arg1.getAge();
        return name0.compareToIgnoreCase(name1);        
    }
    
}
