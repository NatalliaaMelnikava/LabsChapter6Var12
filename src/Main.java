public class Main {
    public static void main(String[] args) {
        VideoPlayer videoPlayer = new VideoPlayer("Iphone");
        videoPlayer.switchOn();
        videoPlayer.play();
        videoPlayer.switchOff();
        videoPlayer.play();
        AudioPlayer audioPlayer = new AudioPlayer("Ipod");
        audioPlayer.switchOn();
        audioPlayer.play();
    }
}