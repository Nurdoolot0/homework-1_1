public class Grandfather {
    private String name;
    private int age;
    private Age status;

    public Grandfather(String name, int age, Age status) {
        this.name = name;
        this.age = age;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Age getStatus() {
        return status;
    }
}
