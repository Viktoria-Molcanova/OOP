
public class Student implements Comparable<Student>{
    private Integer studentId;
    private String surname;
    private String firstname;
    private Integer Age;

    public Student(Integer studentId, String surname, String firstname, Integer Age) {
        this.studentId = studentId;
        this.surname = surname;
        this.firstname = firstname;
        this.Age = Age;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer Age) {
        this.Age = Age;
    }

    @Override
    public String toString() {
        return "Id студента: " + studentId + ", Фамилия : " + surname + ", Имя: " + firstname + ", Возраст:  "
                + Age  ;
    }

    @Override
    public int compareTo(Student o) {
        if (this.studentId > o.studentId){
            return 1;
        } else if (this.studentId < o.studentId){
            return -1;
        } else{ 
            return 0;
        }
    }

    

}