public class Father extends Grandfather {


    public Father(String name, int age, Age status ){
        super(name, age, status);
    }


    public void printInfo() {
        System.out.println("Name: " + getName() + ", Age: " + getAge() + ", Status: " + getStatus());
    }

    public void printInfo(String prefix) {
        System.out.println(prefix + " Name: " + getName() + ", Age: " + getAge() + ", Status: " + getStatus());
    }



    public void printInfo(int age) {
        System.out.println("Name: " + getName() + ", Age: " + age + ", Status: " + getStatus());
    }

    public void printInfo(String prefix, String suffix) {
        System.out.println(prefix + " Name: " + getName() + ", Age: " + getAge() + ", Status: " + getStatus() + " " + suffix);
    }

    public final void printInfo(String prefix, int age) {
        System.out.println(prefix + " Name: " + getName() + ", Age: " + age + ", Status: " + getStatus());
    }
}
