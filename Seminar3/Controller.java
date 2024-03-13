public class Controller {
    private StudentGroupService studentGroupService;
    private StreamService streamService;

    public Controller(StudentGroupService studentGroupService, StreamService streamService) {
        this.studentGroupService = studentGroupService;
        this.streamService = streamService;
    }

    public boolean delStudent(String Ser, String Fir, Integer Age) {
        return studentGroupService.removeStudent(Ser, Fir, Age);
    }

    public void sortByStudentIdOfStudentGroup(){
        studentGroupService.sortStudentsById();
    }

    public void sortByNameOfStudentGroup(){
        studentGroupService.sortStudentsByName();
    }

    public void sortBySizeListStream(){
        streamService.sortStudentsStreamBySize();
    }
}