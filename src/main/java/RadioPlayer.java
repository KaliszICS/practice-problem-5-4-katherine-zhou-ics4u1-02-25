class RadioPlayer implements Player{

    private boolean onOff;
    private double[] stationList;
    private int volume;
    private double station;
    private int currentIndex;

    public RadioPlayer(double[] stationList){
        this.stationList = stationList;
        this.volume = 0;
        this.onOff = false;
        this.station = 0;
        this.currentIndex = 0;
    }

    public void start(){
        if (!onOff && stationList.length > 0){
            onOff = true;
            currentIndex = 0;
            station = stationList[currentIndex];
        }
    }

    public void stop(){
        if (onOff) {
            onOff = false;
            station = 0;
        }
    }

    public boolean getOnOff(){
        return onOff;
    }

    public void volumeUp(){
        volume += 2;
    }

    public void volumeDown(){
        volume -= 2;
    }

    public int getVolume(){
        return volume;
    }

    public void next(){
        if (currentIndex < stationList.length - 1){
            currentIndex++;
            station = stationList[currentIndex];
        }
    }

    public void previous(){
        if (currentIndex > 0){
            currentIndex--;
            station = stationList[currentIndex];
        }
    }

    public double getStation(){
        return station;
    }
}
