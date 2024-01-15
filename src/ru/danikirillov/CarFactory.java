package ru.danikirillov;

public class CarFactory
{
  private CarFactory()
  {
  }

  static Car createGoodCar(int radius)
  {
    return new Car(createWheels(4, radius));
  }

  static Car createCarWithNoWheels()
  {
    return new Car(null);
  }

  static Wheel[] createWheels(int amount, int radius)
  {
    Utils.checkIfPositive(amount);
    Utils.checkIfPositive(radius);

    final var wheels = new Wheel[amount];

    for (int i = 0; i < wheels.length; ++i)
    {
      wheels[i] = new Wheel(false, radius);
    }
    return wheels;

  }
}
