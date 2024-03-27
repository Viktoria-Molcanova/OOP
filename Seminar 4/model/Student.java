package model;
public class Student extends User{
    private Integer id;
     public Student(String name, String secondName, String patronymic,Integer age, Integer id) {
        super(name, secondName,patronymic, age);
        this.id = id;
    }

    public Integer getId() {
        return id;
    }


    @Override
    public String toString() {
        return '\n' +"ID  " + id + '\n' +"Фамилия " + getSecondName() + '\n' + "Имя " + getName() + '\n' +"Отчество " + getpatronymic() + '\n' + "Возраст " + getAge()+'\n';
    }
}
