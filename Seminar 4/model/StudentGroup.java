package model;
import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    private Teacher teacher;
    private Integer numberGroup;
    private List<Student> students;

    public StudentGroup(Integer numberGroup, Teacher teacher, ArrayList<Student> students) {
        this.teacher = teacher;
        this.numberGroup = numberGroup;
        this.students = students;
    }

    @Override
    public String toString() {
        return "Номер студенческой группы " + numberGroup + '\n'+
                "Учитель  "+'\n' + teacher +'\n'+
                "Студенты "+'\n' + students +'\n';
    }

}
