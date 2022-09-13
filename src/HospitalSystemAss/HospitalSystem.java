package HospitalSystemAss;

import java.util.ArrayList;

public class HospitalSystem  {
    
      private ArrayList<Doctors> Doctor  ;
      private ArrayList<Nurses> Nurse  ;
      private ArrayList<Patients> Patient  ;
      private ArrayList<Rooms> Room ;

    public HospitalSystem(ArrayList<Doctors> Doctor, ArrayList<Nurses> Nurse, ArrayList<Patients> Patient, ArrayList<Rooms> Room) {
        this.Doctor = Doctor;
        this.Nurse = Nurse;
        this.Patient = Patient;
        this.Room = Room;
    }

    public ArrayList<Doctors> getDoctor() {
        return Doctor;
    }

    public void setDoctor(ArrayList<Doctors> Doctor) {
        this.Doctor = Doctor;
    }

    public ArrayList<Nurses> getNurse() {
        return Nurse;
    }

    public void setNurse(ArrayList<Nurses> Nurse) {
        this.Nurse = Nurse;
    }

    public ArrayList<Patients> getPatient() {
        return Patient;
    }

    public void setPatient(ArrayList<Patients> Patient) {
        this.Patient = Patient;
    }

    public ArrayList<Rooms> getRoom() {
        return Room;
    }

    public void setRoom(ArrayList<Rooms> Room) {
        this.Room = Room;
    }

    @Override
    public String toString() {
        return "HospitalSystem{ " 
                + "Doctor=" + Doctor +"\n"
                + ", Nurse=" + Nurse +"\n"
                + ", Patient=" + Patient +"\n"
                + ", Room=" + Room + '}';
    }


}