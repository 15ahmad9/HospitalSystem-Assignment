package HospitalSystemAss;

import java.util.ArrayList;

/**
 *
 * @author AhmadGhanem
 */
public class HospitalMain {

    public static void main(String[] args) {
        ArrayList<Nurses> ar = new ArrayList<>();
        ArrayList<Doctors> ar2 = new ArrayList<>();
        ArrayList<Rooms> ar4 = new ArrayList<>();
        ArrayList<Patients> ar3 = new ArrayList<>();

        HospitalSystem h1 = new HospitalSystem(ar2, ar, ar3, ar4);

        Nurses n1 = new Nurses(4545, 500, 50, "Ahmad", 29, 'M', 55, 170);
        ar.add(n1);
        System.out.println(n1);
        Doctors d1 = new Doctors("surgeon", n1, null, null, 1245, 700, 60, "Abd", 34, 'M', 60, 172);
        ar2.add(d1);
        Patients p1 = new Patients(98898, "allergy", 5, d1, n1, 15, "Sara", 20, 'F', 50, 160);
        ar3.add(p1);
        d1.setPatients(ar3);
        patientRoom pr1 = new patientRoom(p1, "Medium", 2150, "Large", 215);
        ar4.add(pr1);
        Office o1 = new Office(70, d1, 6545, "l", 9);
        ar4.add(o1);

        Rooms r1 = new Rooms(3030, "Small", 303);

        System.out.println("   ");
        System.out.println(h1);
        System.out.println("   ");
        System.out.println(r1);
        System.out.println("   ");
        System.out.println(ar.get(0));
        System.out.println("   ");
        System.out.println(n1.getSalary());
        System.out.println("   ");
        System.out.println(ar3.get(0));
        System.out.println("   ");
        System.out.println(pr1.toString());
        System.out.println("   ");
        System.out.println(o1.getDoctor());
        System.out.println("   ");
        System.out.println(d1.getDediction());
        System.out.println("   ");
        System.out.println(d1.getSalary());
    }

}
