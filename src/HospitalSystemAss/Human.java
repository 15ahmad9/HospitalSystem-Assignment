package HospitalSystemAss;

public abstract class Human {

    private String name;
    private int age;
    private char gender;
    private double weight;
    private double height;

    public Human(String name, int age, char gender, double weight, double height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Human{ " + "name=" + name + "\n"
                + ", age=" + age + "\n"
                + ", gender=" + gender + "\n"
                + ", weight=" + weight + "\n"
                + ", height=" + height + '}';
    }

}
