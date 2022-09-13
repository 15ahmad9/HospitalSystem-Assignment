package HospitalSystemAss;

import java.util.ArrayList;

public class Doctors extends Staff {

    private String speciallization;
    private Nurses assistantNurse;
    private ArrayList<Patients> patients;
    private Office office;

    public Doctors(String speciallization, Nurses assistantNurse, ArrayList<Patients> patients, Office office, int id, double salary, double dediction, String name, int age, char gender, double weight, double height) {
        super(id, salary, dediction, name, age, gender, weight, height);
        this.speciallization = speciallization;
        this.assistantNurse = assistantNurse;
        this.patients = patients;
        this.office = office;
    }

    public String getSpeciallization() {
        return speciallization;
    }

    public void setSpeciallization(String speciallization) {
        this.speciallization = speciallization;
    }

    public Nurses getAssistantNurse() {
        return assistantNurse;
    }

    public void setAssistantNurse(Nurses assistantNurse) {
        this.assistantNurse = assistantNurse;
    }

    public ArrayList<Patients> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patients> patients) {
        this.patients = patients;
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

    @Override
    public String toString() {
        return "Doctors{ " + "speciallization=" + speciallization + "\n"
                + ", assistantNurse=" + assistantNurse + '}'; //", office=" + office +
    }

}
