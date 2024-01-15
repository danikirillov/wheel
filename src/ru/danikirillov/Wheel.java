package ru.danikirillov;

public final class Wheel
{
  private boolean isFlat;
  private int radius;

  public Wheel(boolean isFlat, int radius)
  {
    this.isFlat = isFlat;
    this.radius = radius;
  }

  @Override
  public String toString()
  {
    return "Wheel[" +
        "isFlat=" + isFlat + ", " +
        "radius=" + radius + ']';
  }

  public boolean isFlat()
  {
    return isFlat;
  }

  public void setFlat(boolean flat)
  {
    isFlat = flat;
  }

  public int getRadius()
  {
    return radius;
  }

  public void setRadius(int radius)
  {
    this.radius = radius;
  }
}
