package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();


    @Test
    public void shouldGetAndSetCurrentStation() {
        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentStationBelowZero() {
        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentStationAboveNine() {
        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    public void shouldNotSetCurrentStationAboveTen() {
        radio.setCurrentStation(11);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGoToNextStation() {
        radio.setCurrentStation(8);

        radio.nextStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldWrapAroundWhenGoingToNextFromLastStation() {
        radio.setCurrentStation(9);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGoToPreviousStation() {
        radio.setCurrentStation(1);

        radio.previousStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldWrapAroundWhenGoingToPreviousFromFirstStation() {
        radio.setCurrentStation(0);

        radio.previousStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldWrapAroundWhenGoingToPreviousFromMaxStation() {
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldWrapAroundWhenGoingToPreviousFromS2Station() {
        radio.setCurrentStation(2);

        radio.previousStation();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetAndSetCurrentVolume() {
        radio.setVolume(70);

        int expected = 70;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentVolumeBelowZero() {
        radio.setVolume(-1);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentVolumeZero() {
        radio.setVolume(0);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentVolumeAboveHundred() {
        radio.setVolume(101);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeByOne() {
        radio.setVolume(90);

        radio.increaseVolume();

        int expected = 91;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolumeBeyondMaximum() {
        radio.setVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeByOne() {
        radio.setVolume(20);

        radio.decreaseVolume();

        int expected = 19;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolumeBelowMinimum() {
        radio.setVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testConstructorWithCountStations() {
        Radio radio = new Radio(10);
        int expected = 9;
        int actual = radio.getMaxStation();
        Assertions.assertEquals(expected, actual);
    }
}