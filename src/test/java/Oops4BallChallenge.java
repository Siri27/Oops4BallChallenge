import processing.core.PApplet;

public class Oops4BallChallenge extends PApplet  {

    public static final int WIDTH = 720;
    public static final int HEIGHT = 600;
    int x=0;
    int y =HEIGHT/5;
    private Balls[] balls=new Balls[4];

    public static void main(String args[])
    {
        PApplet.main("Oops4BallChallenge",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        for(int i=0;i<4;i++){
        balls[i]=new Balls(x, y);
        }
    }

    @Override
    public void draw() {
        for(int i=0;i<4;i++){

            balls[i].drawBall(i+1,this);
        }
    }
}

