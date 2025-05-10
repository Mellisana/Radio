package org.example;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation;

    public Radio () {
        this.maxStation = 9;
    }

    public Radio (int countStations) {
        this.maxStation = countStations -1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int stationNumber) {
        if (stationNumber >= 0 && stationNumber <= maxStation) {
            currentStation = stationNumber;
        } else {
            System.out.println("Неверный номер станции.");
        }
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void nextStation() {
        if (currentStation != maxStation) {
            currentStation++;
            return;
        }
            currentStation = 0;
    }

    public void previousStation() {
        if (currentStation != 0) {
            currentStation --;
        } else {
            currentStation = maxStation;
        }
    }

    public int getVolume() {
        return currentVolume;
    }

    public void setVolume(int newcurrentVolume) {
        if (newcurrentVolume >= 0 && newcurrentVolume <= 100) {
            currentVolume = newcurrentVolume;
        } else {
            System.out.println("Уровень громкости вне допустимого диапазона.");
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}