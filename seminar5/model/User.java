package model;
public abstract class User {
    private String name;
    private String secondName;
    private Integer age;
private String patronymic;
    public User(String name, String secondName, String patronymic, Integer age) {
        this.name = name;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }
    public String getpatronymic() {
            return patronymic;
        }

    public Integer getAge() {
        return age;
    }



    @Override
    public String toString() {
        return "Фамилия " + secondName + '\n' +"Имя " + name + '\n' + "Отчество " + patronymic +'\n' + "Возраст " + age;
    }
}
