package Constructors.Parameterized;

public class Test {
    int roll;
    String name;

    public Test(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    void display() {
        System.out.println("Roll: " + this.roll
                + " Name: " + this.name);
    }

    public static void main(String[] args) {
        Test obj = new Test(21, "Rishabh");
        obj.display();
    }
}
