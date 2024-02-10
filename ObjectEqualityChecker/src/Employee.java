class Employee extends Person {
    private int salary;



    public Employee(int age, String name, int salary) {
        super(age, name);
        this.salary = salary;
    }

    public Employee(int age, String name) {
        super(age, name);
    }

}