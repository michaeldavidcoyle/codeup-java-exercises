package practice;

public class Duck {
    private int age;
    private String name;

    public Duck(int age, String name) {
        if (name == null) {
            throw new IllegalArgumentException("name should not be null");
        }
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
