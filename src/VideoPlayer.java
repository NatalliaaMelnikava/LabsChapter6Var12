public class VideoPlayer extends Player{
    public VideoPlayer(String name){
        super(name);
    }
    @Override
    public void play(){
        if(this.isPlaying){
            System.out.println("Playing video");
        }else{
            System.out.println("Player is turned off");
        }
    }
}
