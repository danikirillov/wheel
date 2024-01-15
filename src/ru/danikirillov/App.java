package ru.danikirillov;

public class App
{
  public static void main(String[] args)
  {
    changeWheelNoErrorsTest();
  }

  //Unit test prototype
  //Usually test method contains 3 parts:
  private static void changeWheelNoErrorsTest()
  {
    //First, init test data
    final var radius = 17;
    final var car = CarFactory.createGoodCar(radius);
    car.getFlatTire();
    final var wheel = new Wheel(false, radius);

    //Second, run method, you want to test
    car.replaceFlatWheel(wheel);

    //Third, check results
    if (car.isAnyWheelFlat()) {
      System.out.println("changeWheelNoErrorsTest - ERROR!!!!!!!!!!! - wheel hasn't been changed");
    } else {
      System.out.println("changeWheelNoErrorsTest - SUCCESS");
    }
  }

}