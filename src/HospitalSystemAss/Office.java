package HospitalSystemAss;

public class Office extends Rooms {

    private int numOfFile;
    private Doctors doctor;

    public Office(int numOfFile, Doctors doctor, int id, String size, double location) {
        super(id, size, location);
        this.numOfFile = numOfFile;
        this.doctor = doctor;
    }

    public int getNumOfFile() {
        return numOfFile;
    }

    public void setNumOfFile(int numOfFile) {
        this.numOfFile = numOfFile;
    }

    public Doctors getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctors doctor) {
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "Office{ " + "numOfFile=" + numOfFile + "\n"
                + ", doctor=" + doctor + '}';
    }

}
