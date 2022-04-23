package ru.netology;

public class Radio {
    private int fmAmount = 10;
    private int lastFm = getFmAmount();
    private int firstFm;
    private int currentFm;
    private int minVolume;
    private int maxVolume = 100;
    private int currentVolume;


    public Radio() {
    }

    public Radio(int fmAmount) {

        this.fmAmount = fmAmount;
    }

    public void setCurrentFm(int currentFm) {
        if (currentFm < 0) {
            return;
        }
        if (currentFm > getLastFm()) {
            return;
        }
        this.currentFm = currentFm;
    }

    public void stepForward() {
        int newFm = currentFm + 1;
        setCurrentFm(newFm);
        this.currentFm = newFm;
    }

    public void stepBackward() {
        int newFm = currentFm - 1;
        setCurrentFm(newFm);
        if (newFm < getFirstFm()) {
            newFm = getFirstFm();
        }
        this.currentFm = newFm;

    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < getMinVolume()) {
            return;
        }
        if (currentVolume > getMaxVolume()) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
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

    public int getFmAmount() {
        return fmAmount - 1;
    }



    public int getFirstFm() {
        return firstFm;
    }

    public int getLastFm() {
        return getFmAmount();
    }

    public int getCurrentFm() {
        return currentFm;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}
