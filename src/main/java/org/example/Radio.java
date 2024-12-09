package org.example;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public class Conditioner {
        private int currentTemperature;

        public int getCurrentTemperature() {
            return currentTemperature;
        }

        public void setCurrentTemperature(int newCurrentTemperature) {
            if (newCurrentTemperature < 0) {
                return;
            }
            if (newCurrentTemperature > 50) {
                return;
            }
            currentTemperature = newCurrentTemperature;
        }

        public void increaseTemp50p() {
            int target = currentTemperature * 3 / 2;
            setCurrentTemperature(target);
        }

        public void setToMaxTemp() {
            currentTemperature = 30;
        }
    }

    public void setCurrentStation(int stationNumber) {
        if (stationNumber >= 0 && stationNumber <= 9) {
            currentStation = stationNumber;
        } else {
            System.out.println("Неверный номер станции.");
        }
    }

    public void nextStation() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void previousStation() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation--;
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