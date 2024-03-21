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
        return "Учитель : " +"Id учителя " + teacherId +"Фамилия " + super.getSurname() + '\'' +"Имя '" + super.getFirstname() + '\'' +"Отчество '" + super.getmiddlename() + '\'' ;
    }
}
