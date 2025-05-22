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
        if (!onOff && musicList.length > 0){
            onOff = true;
            currentIndex = 0;
            currentSong = musicList[currentIndex];
        }
    }


    public void stop(){
        if (onOff) {
            onOff = false;
            currentSong = "";
        }
    }

    public boolean getOnOff(){
        return onOff;
    }


    public void volumeUp(){
        volume++;
    }


    public void volumeDown(){
        volume--;
    }


    public int getVolume(){
        return volume;
    }

    public void next(){
        if (currentIndex < musicList.length - 1){
            currentIndex++;
            currentSong = musicList[currentIndex];
        }
    }

    public void previous(){
        if (currentIndex > 0){
            currentIndex--;
            currentSong = musicList[currentIndex];
        }
    }

    public String getCurrentSong(){
        return currentSong;
    }
}
