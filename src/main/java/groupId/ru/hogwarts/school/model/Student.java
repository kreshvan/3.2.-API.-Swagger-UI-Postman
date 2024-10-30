package groupId.ru.hogwarts.school.model;

import java.util.Objects;

public class Student {
    private Long id;
    private  String name;
    private int age;

    public Student() {

    }

public Student(Long id, String name, int age) {
    this.id = id;
    this.name = name;
    this.age = age;
}



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

@Override
    public String toString() {
    return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }
    @Override
    public boolean equals(Object obj) {
    return Objects.equals(id, ((Student) obj).id);
    }
}
