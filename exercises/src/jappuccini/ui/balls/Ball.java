package jappuccini.ui.balls;

import java.awt.Color;

public class Ball {

  private Color Color;
  private int r;
  private int speedX;
  private int speedY;
  private int x;
  private int y;

  public Ball(int r, int x, int y, Color color, int speedX, int speedY) {
    this.r = r;
    this.x = x;
    this.y = y;
    Color = color;
    this.speedX = speedX;
    this.speedY = speedY;
  }

  public Color getColor() {
    return Color;
  }

  public int getR() {
    return r;
  }

  public int getSpeedX() {
    return speedX;
  }

  public int getSpeedY() {
    return speedY;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public void move(int minX, int minY, int maxX, int maxY) {
    x += speedX;
    y += speedY;
    if (x < minX) {
      x = r;
      speedX = -speedX;
    }
    if (x + r >= maxX) {
      x = maxX - r;
      speedX = -speedX;
    }
    if (y < minY) {
      y = r;
      speedY = -speedY;
    }
    if (y + r >= maxY) {
      y = maxY - r;
      speedY = -speedY;
    }
  }

}
