import model.Student;
import model.StudentGroup;
import model.Teacher;

public class Main {
    public static void main(String[] args) {
        Controller controller =  new Controller();
        Teacher teacher_gr1 = controller.createTeacher(new Teacher("Алексей", "Иванов","Иванович" ,33, null ));
        Student student1_gr1 = controller.createStudent(new Student("Иван", "Иванов","Егорович" , 22, null));
        Student student2_gr1 = controller.createStudent(new Student("Пётр", "Петров","Петрович" , 32, null));


        
        Teacher teacher_gr2 = controller.createTeacher(new Teacher("Иван", "Молчанов","Алексеевич" , 40, null));
        StudentGroup gr1 = controller.createGroup(1, teacher_gr1, student1_gr1, student2_gr1);

        Student student1_gr2 = controller.createStudent(new Student("Ольга", "Моторина","Олеговна" , 22, null));
        Student student2_gr2 = controller.createStudent(new Student("Павел", "Рябошапко","Юрьевич" , 33, null));

        

        StudentGroup gr2 = controller.createGroup(2, teacher_gr2, student1_gr2, student2_gr2);
        System.out.println(gr1.toString());
        System.out.println(gr2.toString());

    }
}