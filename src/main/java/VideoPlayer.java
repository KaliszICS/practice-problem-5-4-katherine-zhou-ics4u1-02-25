class VideoPlayer implements Player{

    private boolean onOff;
    private String video;
    private int currentTime;
    private int volume;

    public VideoPlayer(String video){
        this.video = video;
        this.volume = 0;
        this.onOff = false;
        this.currentTime = 0;
    }

    public void start(){
        if (!onOff){
            onOff = true;
        }
    }

    public void stop(){
        if (onOff){
            onOff = false;
        }
    }

    public boolean getOnOff(){
        return onOff;
    }

    public void volumeUp(){
        volume += 5;
    }

    public void volumeDown(){
        volume -= 5;
    }

    public int getVolume(){
        return volume;
    }

    public void fastForward(){
        currentTime += 5;
    }

    public void rewind(){
        currentTime -= 5;
        if (currentTime < 0){
            currentTime = 0;
        }
    }

    public int getCurrentTime(){
        return currentTime;
    }

    public String getVideo(){
        return video;
    }

    public void setVideo(String video){
        this.video = video;
        currentTime = 0;
    }
}
