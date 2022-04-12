package ru.netology;

public class Radio {
    private int currentFm;
    private int currentVolume;


    public int getFirstFm() {
        return 0;
    }

    public int getLastFm() {
        return 9;
    }

    public int getCurrentFm() {
        return currentFm;
    }

    public void setCurrentFm(int CurrentFm) {
        if (CurrentFm < 0) {
            return;
        }
        if (CurrentFm > getLastFm()) {
            return;
        }
        this.currentFm = CurrentFm;
    }

    public void stepForward() {
        int newFm = currentFm + 1;
        setCurrentFm(newFm);
        if (newFm > 9) {
            newFm = getFirstFm();
        }
        this.currentFm = newFm;
    }

    public void stepBackward() {
        int newFm = currentFm - 1;
        setCurrentFm(newFm);
        if (newFm < 0) {
            newFm = getLastFm();
        }
        this.currentFm = newFm;
    }





    public int getMinVolume() {
        return 0;
    }

    public int getMaxVolume() {
        return 10;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int CurrentVolume) {
        if (CurrentVolume < 0) {
            return;
        }
        if (CurrentVolume > getMaxVolume()) {
            return;
        }
        this.currentVolume = CurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }

    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = getMinVolume();
        }

    }


}
