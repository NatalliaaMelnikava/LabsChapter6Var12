public class AudioPlayer extends Player {
    public AudioPlayer(String name){
        super(name);
    }
    @Override
    public void play() {
        if (this.isPlaying) {
            System.out.println("Playing audio");
        } else {
            System.out.println("Player is turned off");
        }
    }
}
