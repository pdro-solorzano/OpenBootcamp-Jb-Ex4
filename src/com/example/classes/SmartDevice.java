package com.example.classes;

public abstract class SmartDevice {
    int sensors = 0;
    float length = 0.0f;
    float width = 0.0f;
    float height = 0.0f;
    float weight = 0.0f;
    float bluetoothVersion = 5.0f;

    public SmartDevice() {

    }

    public SmartDevice(int sensors, float length, float width, float height, float weight, float bluetoothVersion) {
        this.sensors = sensors;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.bluetoothVersion = bluetoothVersion;
    }

    public int getSensors() {
        return sensors;
    }

    public void setSensors(int sensors) {
        this.sensors = sensors;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getBluetoothVersion() {
        return bluetoothVersion;
    }

    public void setBluetoothVersion(float bluetoothVersion) {
        this.bluetoothVersion = bluetoothVersion;
    }
}
