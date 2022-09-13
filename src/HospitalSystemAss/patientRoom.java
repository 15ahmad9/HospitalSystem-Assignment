package HospitalSystemAss;

public class patientRoom extends Rooms {

    private Patients patient;
    private String bedSize;

    public patientRoom(Patients patient, String bedSize, int id, String size, double location) {
        super(id, size, location);
        this.patient = patient;
        this.bedSize = bedSize;
    }

    public Patients getpatient() {
        return patient;
    }

    public void setPatient(Patients patient) {
        this.patient = patient;
    }

    public String getbedSize() {
        return bedSize;
    }

    public void setbedSize(String bedSize) {
        this.bedSize = bedSize;
    }

    @Override
    public String toString() {
        return "patientRoom{ " + "patient=" + patient + "\n"
                + ", bedSize=" + bedSize + '}';
    }

}
