package HospitalSystemAss;

public class Rooms {

    private int id;
    private String size;
    private double location;

    public Rooms(int id, String size, double location) {
        this.id = id;
        this.size = size;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getLocation() {
        return location;
    }

    public void setLocation(double location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Rooms{ " + "id=" + "\n"
                + id + "\n"
                + ", size=" + size + "\n"
                + ", location=" + location + '}';
    }

}
