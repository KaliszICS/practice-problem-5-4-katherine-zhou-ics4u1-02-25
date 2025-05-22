class MusicPlayer implements Player{

    private boolean onOff;
    private String[] musicList;
    private String currentSong;
    private int volume;
    private int currentIndex;

    public MusicPlayer(String[] musicList){
        this.musicList = musicList;
        this.volume = 0;
        this.onOff = false;
        this.currentSong = "";
        this.currentIndex = 0;
    }


    public void start(){
        if (!this.onOff && this.musicList.length > 0){
            this.onOff = true;
            this.currentIndex = 0;
            this.currentSong = musicList[this.currentIndex];
        }
    }


    public void stop(){
        if (this.onOff) {
            this.onOff = false;
            this.currentSong = "";
        }
    }

    public boolean getOnOff(){
        return this.onOff;
    }


    public void volumeUp(){
        this.volume++;
    }


    public void volumeDown(){
        this.volume--;
    }


    public int getVolume(){
        return this.volume;
    }

    public void next(){
        if (this.currentIndex < this.musicList.length - 1){
            this.currentIndex++;
            this.currentSong = musicList[this.currentIndex];
        }
    }

    public void previous(){
        if (this.currentIndex > 0){
            this.currentIndex--;
            this.currentSong = musicList[currentIndex];
        }
    }

    public String getCurrentSong(){
        return this.currentSong;
    }
}
