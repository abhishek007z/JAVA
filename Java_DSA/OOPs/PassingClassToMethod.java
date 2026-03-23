package OOPs;

public class PassingClassToMethod {
    public static class Car{
        int seat;
        String name;
        double length;
        String type;
        int torque;
    }

    public static void change(Car c){
        c.seat = 4;
    }

    public static void main(String[] args){
        Car c = new Car();
        c.length = 3.99;
        c.name = "crata";
        c.seat = 9;
        c.torque = 178;
        c.type = "suv";
        change(c);
        System.out.println(c.seat);
    }
}