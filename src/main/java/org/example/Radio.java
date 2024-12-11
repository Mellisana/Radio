package org.example;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private final int totalStations;

    public Radio(int totalStations) {
        this.totalStations = totalStations;
        currentStation = 0;
        currentVolume = 0;
    }

    public Radio() {
        this(10);
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0 || newCurrentStation >= totalStations) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        int target = currentStation + 1;
        if (target >= totalStations) {
            target = 0;
        }
        currentStation = target;
    }

    public void previousStation() {
        int target = currentStation - 1;
        if (target < 0) {
            target = totalStations - 1;
        }
        currentStation = target;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0 || newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        int target = currentVolume + 1;
        if (target > 100) {
            return;
        }
        currentVolume = target;
    }

    public void decreaseVolume() {
        int target = currentVolume - 1;
        if (target < 0) {
            return;
        }
        currentVolume = target;
    }

}