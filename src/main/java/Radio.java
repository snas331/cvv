public class Radio {
    private int currentStation;
    private int currentVolume;
    private int stationAmount = 10;

    public Radio(int stationAmount) {
        this.stationAmount = stationAmount;
    }

    public Radio() {
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newStation) {
        if (newStation <= stationAmount -1) {
            if (newStation >= 0) {
                currentStation = newStation;
            }
        }
    }


    public void next() {
        if(currentStation == stationAmount - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prev() {
        if(currentStation == 0) {
            currentStation = stationAmount - 1;
        } else {
            currentStation--;
        }
    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume >= 0) {
            if (newVolume <= 100) {
                currentVolume = newVolume;
            }
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaceVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}
