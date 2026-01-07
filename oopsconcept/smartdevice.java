package oopsconcept;

import java.util.Scanner;

public class smartdevice {

    interface SmartDevice {
        void turnOn();
        void turnOff();
    }

    static class SmartLight implements SmartDevice {
        public void turnOn() { System.out.println("Light ON"); }
        public void turnOff() { System.out.println("Light OFF"); }
    }

    static class SmartFan implements SmartDevice {
        public void turnOn() { System.out.println("Fan ON"); }
        public void turnOff() { System.out.println("Fan OFF"); }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Device (light/fan): ");
        String d = sc.next();

        SmartDevice device = d.equalsIgnoreCase("light")
                ? new SmartLight()
                : new SmartFan();

        device.turnOn();
        device.turnOff();

        sc.close();
    }
}
