package Lesson7_1;

public class Students {
    public String name;
    String secondName;
    public int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Students students = (Students) o;

        if (age != students.age) return false;
        if (!name.equals(students.name)) return false;
        return secondName.equals(students.secondName);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + secondName.hashCode();
        result = 31 * result + age;
        return result;
    }

    public Students(String name, String secondName, int age) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
    }

}
