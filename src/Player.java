import java.util.Objects;
public abstract class Player implements Device {
    private String name;
    protected boolean isPlaying;

    public Player(){
        this.isPlaying = false;
    }
    public Player(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public abstract void play();

    @Override
    public void switchOn(){
        System.out.println(name + " is switch on");
        this.isPlaying = true;
    }
    @Override
    public void switchOff(){
        System.out.println(name + " is switch off");
        this.isPlaying = false;
    }
}
