package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldSetFmInBound() {
        Radio rad = new Radio();
        rad.setCurrentFm(8);

        int actual = rad.getCurrentFm();
        int expected = 8;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldStepForward() {
        Radio rad = new Radio();
        rad.setCurrentFm(5);

        rad.stepForward();

        int actual = rad.getCurrentFm();
        int expected = 6;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldStepForwardOutOfBound() {
        Radio rad = new Radio();
        rad.setCurrentFm(9);

        rad.stepForward();

        int actual = rad.getCurrentFm();
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldStepBackward() {
        Radio rad = new Radio();
        rad.setCurrentFm(5);

        rad.stepBackward();

        int actual = rad.getCurrentFm();
        int expected = 4;

        assertEquals(expected, actual);

    }
    @Test
    public void shouldStepBackwardOutOfBound() {
        Radio rad = new Radio();
        rad.setCurrentFm(0);

        rad.stepBackward();

        int actual = rad.getCurrentFm();
        int expected = 9;

        assertEquals(expected, actual);

    }




    // Volume Tests
    @Test
    public void shouldSetVolumeInBound() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);

        int actual = rad.getCurrentVolume();
        int expected = 5;

        assertEquals(expected, actual);

    }
    @Test
    public void shouldSetVolumeOutOfBoundPositive() {
        Radio rad = new Radio();
        rad.setCurrentVolume(15);

        int actual = rad.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolumeOutOfBoundNegative() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-5);

        int actual = rad.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);

    }


    @Test
    public void shouldIncreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);

        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 6;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolumeOutOfBound() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);

        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);

    }


    @Test
    public void shouldDecreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(8);

        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 7;

        assertEquals(expected, actual);

    }
    @Test
    public void shouldDecreaseVolumeNegative() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);

        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);

    }

}