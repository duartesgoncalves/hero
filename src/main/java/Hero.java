import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.screen.Screen;

public class Hero {
    private int x_;
    private int y_;

    public Hero (int x, int y) { x_ = x; y_ = y; }

    public void set_x(int x) { x_ = x; }
    public void set_y(int y) { y_ = y; }

    public int get_x() { return x_; }
    public int get_y() { return y_; }

    public void moveUp() { y_--; }
    public void moveDown() { y_++; }
    public void moveLeft() { x_--; }
    public void moveRight() { x_++; }

    public void draw(Screen screen) {
        screen.setCharacter(x_, y_, TextCharacter.fromCharacter('X') [0]);
    }
}
