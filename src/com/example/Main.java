package com.example;

import com.example.classes.SmartPhone;
import com.example.classes.SmartWatch;

public class Main {
    public static void main(String[] args) {
        // int sensors, float length, float width, float height, float weight, float bluetoothVersion, int numCameras, boolean frontCamera, int simSpaces
        SmartPhone phone = new SmartPhone(5, 25.3f, 1.5f, 30.5f, 300.50f, 5.2f, 4, true, 2);
        SmartWatch watch = new SmartWatch(4, 10, 1, 10, 20.5f, 5.1f, true, true, true);

        printPhoneInfo(phone);
        printWatchInfo(watch);
    }

    public static void printPhoneInfo (SmartPhone phone) {
        System.out.println("***** SMARTPHONE *****");
        System.out.println("Number of sensors: " + phone.getSensors());
        System.out.println("Length: " + phone.getLength());
        System.out.println("Width: " + phone.getWidth());
        System.out.println("Height: " + phone.getHeight());
        System.out.println("Weight: " + phone.getWeight());
        System.out.println("Bluetooth version: " + phone.getBluetoothVersion());
        System.out.println("Number of cameras: " + phone.getNumCameras());
        System.out.println("Has front camera: " + phone.isFrontCamera());
        System.out.println("SIM slots: " + phone.getSimSpaces());
    }

    public static void printWatchInfo (SmartWatch watch) {
        System.out.println("***** SMARTWATCH *****");
        System.out.println("Number of sensors: " + watch.getSensors());
        System.out.println("Length: " + watch.getLength());
        System.out.println("Width: " + watch.getWidth());
        System.out.println("Height: " + watch.getHeight());
        System.out.println("Weight: " + watch.getWeight());
        System.out.println("Bluetooth version: " + watch.getBluetoothVersion());
        System.out.println("Has heart sensor: " + watch.isHeartSensor());
        System.out.println("Has oximeter sensor: " + watch.isOximeterSensor());
        System.out.println("Has stress sensor: " + watch.isStressSensor());
    }
}
