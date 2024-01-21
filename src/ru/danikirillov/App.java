package ru.danikirillov;

public class App {
  public static void main(String[] args) {
//    changeWheelNoErrorsTest();
//    changeGoodWheelsNoErrorTest();
    changeWheelWithAnotherRadiusTest();
//    checkWheelForGoodCondition(new Wheel(false,17));
  }

  //Unit test prototype
  //Usually test method contains 3 parts:
  private static void changeWheelNoErrorsTest() {
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
    }
    else {
      System.out.println("changeWheelNoErrorsTest - SUCCESS");
    }
  }

  public static void changeGoodWheelsNoErrorTest() {
    final var radius = 17;
    final var car = CarFactory.createGoodCar(radius);
    final var wheel = new Wheel(false, radius);

    car.replaceFlatWheel(wheel);

    if (car.isAnyWheelFlat()) {
      System.out.println("changeGoodWheelsNoErrorTest - ERROR!!!!!!!!!!! - wheel hasn't been changed");
    }
    else {
      System.out.println("changeGoodWheelsNoErrorTest - SUCCESS! ");
    }
  }

  public static void changeWheelWithAnotherRadiusTest() {
    final var radius = 17;
    final var car = CarFactory.createGoodCar(radius);
    final var wheel = new Wheel(false, 12);

    car.getFlatTire();
    car.replaceFlatWheel(wheel);

  }


  public static boolean checkWheelForGoodCondition(Wheel wheelForReplacement) {//todo: no todo

    if (wheelForReplacement.isFlat()){
      System.out.println("WheelForReplacement is flat!");
      return false;
    }
    System.out.println("WheelForReplacement is not flat!");
      return true;
  }


}
