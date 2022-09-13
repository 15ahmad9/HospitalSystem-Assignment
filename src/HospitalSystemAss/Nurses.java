package HospitalSystemAss;

public class Nurses extends Staff {

    public Nurses(int id, double salary, double dediction, String name, int age, char gender, double weight, double height) {
        super(id, salary, dediction, name, age, gender, weight, height);

    }

    public void withdrawBlood() {
    }

    public void giveInjection() {

    }

    public String toString() {
        return "Nurse{ ID= " + getId() + "\n"
                + ", Salary= " + getSalary() + "\n"
                + ", Dedications= " + getDediction() + "\n"
                + ", calculates= " + calcPayment() + "\n"
                + ", toString =" + super.toString() + "\n"
                + ", getName= " + getName() + "\n"
                + ", getAge= " + getAge() + "\n"
                + ", getGender= " + getGender()
                + ", getWeight= " + getWeight() + "\n"
                + ", getHeight= " + getHeight();
    }
}
