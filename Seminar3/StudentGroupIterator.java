import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {

    private List<Student> studentsGroup;

    private int Index;
    

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentsGroup = studentGroup.getStudentGroup();
        this.Index = -1;
    }

    @Override
    public boolean hasNext() {
        return Index < studentsGroup.size()-1 ;
    }

    @Override
    public Student next() {
        if (!hasNext()) {
            return null;
        }
        return studentsGroup.get(++Index);
    }

    @Override
    public void remove() {
        if (Index>= 0 && Index < studentsGroup.size()) {
            studentsGroup.remove(Index);
        }
    }

}
