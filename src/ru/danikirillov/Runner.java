package ru.danikirillov;

public class Runner {
  public static void main(String[] args) {
    Wheel[] wheels = new Wheel[4];
    wheels[0]= new Wheel(false,17);
    wheels[1]= new Wheel(false,17);
    wheels[2]= new Wheel(false,17);
    wheels[3]= new Wheel(false,17);

    Car car = new Car(wheels);
    car.isAnyWheelFlat();

  }
}
