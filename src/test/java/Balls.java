import processing.core.PApplet;

public class Balls  {

    public static final int diameter = 10;
    private  int speed;
    private final int height;

    public Balls(int speed,int height){
        this.speed=speed;
        this.height=height;
    }
    public void drawBall(int level, PApplet draw){
        draw.ellipse(this.speed++*level,height*level, diameter,diameter);

    }
}
