package HospitalSystemAss;

public class Staff extends Human implements payable {

    private int id;
    private double salary;
    private double dediction;

    public Staff(int id, double salary, double dediction, String name, int age, char gender, double weight, double height) {
        super(name, age, gender, weight, height);
        this.id = id;
        this.salary = salary;
        this.dediction = dediction;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getDediction() {
        return dediction;
    }

    public void setDediction(double dediction) {
        this.dediction = dediction;
    }

    public double calcPayment() {

        double pay = salary - dediction;
        return pay;

    }

    @Override
    public String toString() {
        return "Staff{ " + "id=" + id + "\n"
                + ", salary=" + salary + "\n"
                + ", dediction=" + dediction + '}';
    }

}
