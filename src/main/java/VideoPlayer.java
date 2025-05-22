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
        return this.onOff;
    }

    public void volumeUp(){
        this.volume += 5;
    }

    public void volumeDown(){
        this.volume -= 5;
    }

    public int getVolume(){
        return this.volume;
    }

    public void fastForward(){
        this.currentTime += 5;
    }

    public void rewind(){
        this.currentTime -= 5;
        if (this.currentTime < 0){
            this.currentTime = 0;
        }
    }

    public int getCurrentTime(){
        return this.currentTime;
    }

    public String getVideo(){
        return this.video;
    }

    public void setVideo(String video){
        this.video = video;
        this.currentTime = 0;
    }
}
