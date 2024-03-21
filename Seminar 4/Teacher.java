public class Teacher extends User{
    private Integer teacherId;

    public Teacher(Integer teacherId, String surname, String firstname, String middlename) {
        super(surname, firstname, middlename);
        this.teacherId=teacherId;
    }
    public Integer getTeacherId() {
        return teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                "surname='" + super.getSurname() + '\'' +
                ", firstname='" + super.getFirstname() + '\'' +
                ", middlename='" + super.getmiddlename() + '\'' +
                '}';
    }
}
