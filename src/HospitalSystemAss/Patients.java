package HospitalSystemAss;

public class Patients extends Human implements payable {

    private int id;
    private String illness;
    private int numOfDay;
    private Doctors doctor;
    private Nurses nurses;
    private double costOfDay;

    public Patients(int id, String illness, int numOfDay, Doctors doctor, Nurses nurses, double costOfDay, String name, int age, char gender, double weight, double height) {
        super(name, age, gender, weight, height);
        this.id = id;
        this.illness = illness;
        this.numOfDay = numOfDay;
        this.doctor = doctor;
        this.nurses = nurses;
        this.costOfDay = costOfDay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public int getNumOfDay() {
        return numOfDay;
    }

    public void setNumOfDay(int numOfDay) {
        this.numOfDay = numOfDay;
    }

    public Doctors getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctors doctor) {
        this.doctor = doctor;
    }

    public Nurses getNurses() {
        return nurses;
    }

    public void setNurses(Nurses nurses) {
        this.nurses = nurses;
    }

    public double getCostOfDay() {
        return costOfDay;
    }

    public void setCostOfDay(double costOfDay) {
        this.costOfDay = costOfDay;
    }

    @Override
    public double calcPayment() {

        double pay = numOfDay * costOfDay;
        return pay;

    }

    @Override
    public String toString() {
        return "Patients{ " + "id=" + id + "\n"
                + ", illness=" + illness + "\n"
                + ", numOfDay=" + numOfDay + "\n"
                + ", doctor=" + doctor + "\n"
                + ", nurses=" + nurses + "\n"
                + ", costOfDay=" + costOfDay + '}';
    }

}
