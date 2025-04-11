package Workers;

public class Staff {

    private String empName;
    private final String empCompany;
    private final int age;
    private final int salary;

    public Staff()
    {
        this.empName = Array.arrName();
        this.empCompany = Array.arrCompany();
        this.age = Age.getRandomAge();
        this.salary = Salary.getRandomSalary();
    }

    @Override
    public String toString()
    {
        return "\nEmployee\n--------" +
                "\nName = " + empName +
                "\nCompany = " + empCompany  +
                "\nAge = " + age +
                "\nSalary = " + salary + "$";
    }
}
