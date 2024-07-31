public final class Son extends Father {
    private String description;

    public Son(String name, int age, Age status, String description) {
        super(name, age, status);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Description: " + description);
    }

    @Override
    public void printInfo(String prefix) {
        super.printInfo(prefix);
        System.out.println("Description: " + description);
    }
}
