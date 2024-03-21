import java.util.List;

public class TeacherController implements UserController<Teacher>{

    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();
    @Override
    public void create(String surname, String firstname, String middlename) {
        teacherService.create(surname,firstname,middlename);
    }
    public void editTeacher(Integer teacherId, String surname,String firstname, String middlename){
        teacherService.editTeacher(teacherId,surname,firstname,middlename);
    }
    public void initTeacherList(List<Teacher> list){
        teacherService.initData(list);
    }
    public void printTeachers(){
        teacherView.sendOnConsole(teacherService.getAll());
    }
}
