package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSetFmByDefault() {
        Radio rad = new Radio();

        rad.getFmAmount();


        int actual = rad.getFmAmount();
        int expected = 9;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetFmByAnyAmount() {
        Radio rad = new Radio(36);


        int actual = rad.getFmAmount();
        int expected = 35;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetFirstFmByDefault() {
        Radio rad = new Radio();

        rad.setCurrentFm(11);
        rad.stepForward();


        int actual = rad.getCurrentFm();
        int expected = 1;

        assertEquals(expected, actual);

    }


    @Test
    public void shouldSetFmInRemote() {
        Radio rad = new Radio(56);

        rad.setCurrentFm(35);


        int actual = rad.getCurrentFm();
        int expected = 35;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldStepForwardWithSetup() {
        Radio rad = new Radio(20);

        rad.setCurrentFm(15);
        rad.stepForward();


        int actual = rad.getCurrentFm();
        int expected = 16;

        assertEquals(expected, actual);

    }


    @Test
    public void shouldStepForwardDefault() {
        Radio rad = new Radio();

        rad.setCurrentFm(8);
        rad.stepForward();


        int actual = rad.getCurrentFm();
        int expected = 9;

        assertEquals(expected, actual);

    }


    @Test
    public void shouldStepForwardOverBound() {
        Radio rad = new Radio(20);


        rad.setCurrentFm(20);
        rad.stepForward();

        int actual = rad.getCurrentFm();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldStepBackward() {
        Radio rad = new Radio();

        rad.setCurrentFm(9);
        rad.stepBackward();

        int actual = rad.getCurrentFm();
        int expected = 8;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldStepBackwardUnderBound() {
        Radio rad = new Radio();


        rad.setCurrentFm(0);
        rad.stepBackward();

        int actual = rad.getCurrentFm();
        int expected = 0;

        assertEquals(expected, actual);
    }


    //    Volume Tests
//     =========================================================
    @Test
    public void shouldSetVolumeInBound() {
        Radio rad = new Radio();

        rad.setCurrentVolume(33);

        int actual = rad.getCurrentVolume();
        int expected = 33;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolumeOutOfBound() {
        Radio rad = new Radio();

        rad.setCurrentVolume(150);

        int actual = rad.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(33);
        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 34;

        assertEquals(expected, actual);

    }

    @Test
    public void DoNothingWhileUpMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(100);
        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 100;

        assertEquals(expected, actual);

    }


    @Test
    public void shouldDecreaseVolume() {
        Radio rad = new Radio();


        rad.setCurrentVolume(33);
        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 32;

        assertEquals(expected, actual);

    }

    @Test
    public void DoNothingWhileMinOver() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseNegative() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);
        rad.decreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);

    }

}