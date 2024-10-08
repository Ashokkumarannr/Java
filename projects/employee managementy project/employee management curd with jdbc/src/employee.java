public class employee {
    private int id;
    private String name;
    private int age;
    private String designation;
    private String department;
    private double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", designation='" + designation + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    public employee(int id, String designation, int age, String name, String department, double salary) {
        this.id = id;
        this.designation = designation;
        this.age = age;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

