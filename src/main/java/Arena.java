import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.screen.Screen;

import javax.swing.*;

public class Arena {
    private int width, height;
    private Hero hero;

    public Arena(int width, int height, Hero hero) { this.width = width; this.height = height; this.hero = hero; }

    public void draw(Screen screen) {
        screen.setCharacter(hero.getPosition().getX(), hero.getPosition().getY(), TextCharacter.fromCharacter('X') [0]);
    }

    public void processKey(KeyStroke key) {
        if (key.getKeyType() == KeyType.ArrowUp) moveHero(hero.moveUp());
        if (key.getKeyType() == KeyType.ArrowDown) moveHero(hero.moveDown());
        if (key.getKeyType() == KeyType.ArrowLeft) moveHero(hero.moveLeft());
        if (key.getKeyType() == KeyType.ArrowRight) moveHero(hero.moveRight());
    }

    private void moveHero(Position position) {
        if (canHeroMove(position))
            hero.setPosition(position);
    }

    public boolean canHeroMove(Position position) {
        return position.getX() >= 0 && position.getX() < width && position.getY() >= 0 && position.getY() < height;
    }
}
