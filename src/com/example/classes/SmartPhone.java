package com.example.classes;

public class SmartPhone extends SmartDevice {
    int numCameras = 1;
    boolean frontCamera = true;
    int simSpaces = 1;

    public SmartPhone() {

    }

    public SmartPhone(int sensors, float length, float width, float height, float weight, float bluetoothVersion, int numCameras, boolean frontCamera, int simSpaces) {
        super(sensors, length, width, height, weight, bluetoothVersion);
        this.numCameras = numCameras;
        this.frontCamera = frontCamera;
        this.simSpaces = simSpaces;
    }

    public int getNumCameras() {
        return numCameras;
    }

    public void setNumCameras(int numCameras) {
        this.numCameras = numCameras;
    }

    public boolean isFrontCamera() {
        return frontCamera;
    }

    public void setFrontCamera(boolean frontCamera) {
        this.frontCamera = frontCamera;
    }

    public int getSimSpaces() {
        return simSpaces;
    }

    public void setSimSpaces(int simSpaces) {
        this.simSpaces = simSpaces;
    }
}
