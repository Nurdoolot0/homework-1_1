public class Main {
    public static void main(String[] args) {

        Father objectA = new Father("Дедушка", 80, Age.OLD);
        Son objectB = new Son("Папа", 55, Age.MEDIUM,"Description B");
        Son objectC = new Son("Сын", 22, Age.YOUNG,"Description C");

        System.out.println("Дедушка: ");
        System.out.println("Name: " + objectA.getName());
        System.out.println("Age: " + objectA.getAge());
        System.out.println("Status: " + objectA.getStatus());
        objectA.printInfo();
        objectA.printInfo("Prefix: ");

        objectA.printInfo(55);
        objectA.printInfo("Prefix", "Suffix");
        objectA.printInfo("Prefix", 55);

        System.out.println("\nПапа: ");
        System.out.println("Name: " + objectB.getName());
        System.out.println("Age: " + objectB.getAge());
        System.out.println("Status: " + objectB.getStatus());
        objectB.printInfo();
        objectB.printInfo("Prefix: ");


        System.out.println("\nСын: ");
        System.out.println("Name: " + objectC.getName());
        System.out.println("Age: " + objectC.getAge());
        System.out.println("Status: " + objectC.getStatus());
        System.out.println("Description: " + objectC.getDescription());
        objectC.printInfo();
        objectC.printInfo("Prefix: ");

    }
}