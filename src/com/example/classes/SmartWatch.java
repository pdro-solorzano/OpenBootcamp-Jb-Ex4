package com.example.classes;

public class SmartWatch extends SmartDevice {
    boolean heartSensor = true;
    boolean oximeterSensor = true;
    boolean stressSensor = true;

    public SmartWatch() {

    }

    public SmartWatch(int sensors, float length, float width, float height, float weight, float bluetoothVersion, boolean heartSensor, boolean oximeterSensor, boolean stressSensor) {
        super(sensors, length, width, height, weight, bluetoothVersion);
        this.heartSensor = heartSensor;
        this.oximeterSensor = oximeterSensor;
        this.stressSensor = stressSensor;
    }

    public boolean isHeartSensor() {
        return heartSensor;
    }

    public void setHeartSensor(boolean heartSensor) {
        this.heartSensor = heartSensor;
    }

    public boolean isOximeterSensor() {
        return oximeterSensor;
    }

    public void setOximeterSensor(boolean oximeterSensor) {
        this.oximeterSensor = oximeterSensor;
    }

    public boolean isStressSensor() {
        return stressSensor;
    }

    public void setStressSensor(boolean stressSensor) {
        this.stressSensor = stressSensor;
    }
}
