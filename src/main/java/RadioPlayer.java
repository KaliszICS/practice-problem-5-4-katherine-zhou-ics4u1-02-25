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
        if (!this.onOff && this.stationList.length > 0){
            this.onOff = true;
            this.currentIndex = 0;
            this.station = stationList[currentIndex];
        }
    }

    public void stop(){
        if (this.onOff) {
            this.onOff = false;
            this.station = 0;
        }
    }

    public boolean getOnOff(){
        return this.onOff;
    }

    public void volumeUp(){
        this.volume += 2;
    }

    public void volumeDown(){
        this.volume -= 2;
    }

    public int getVolume(){
        return this.volume;
    }

    public void next(){
        if (this.currentIndex < this.stationList.length - 1){
            this.currentIndex++;
            station = stationList[this.currentIndex];
        }
    }

    public void previous(){
        if (this.currentIndex > 0){
            this.currentIndex--;
            station = stationList[this.currentIndex];
        }
    }

    public double getStation(){
        return this.station;
    }
}
