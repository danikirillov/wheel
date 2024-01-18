package ru.danikirillov;

import java.util.concurrent.ThreadLocalRandom;

public class Car {
  Wheel[] wheels;

  Car(Wheel[] wheels) {
    this.wheels = wheels;
  }

  public void replaceFlatWheel(Wheel wheelForReplacement) {
    if (!isAnyWheelFlat()) {
      System.out.println("All wheels are fine, no need in replacing.");
      return;
    }
    if (isRadiusCorrect(wheelForReplacement)) {
      changeWheel(wheelForReplacement);
    }
    else {
      System.out.println("Radius of provided wheel is incompatible.");
    }
  }

  public boolean isAnyWheelFlat() {
    for (int i = 0; i < wheels.length; i++) {
      if (wheels[i].isFlat()) {
        System.out.println("Some wheel is flat!");
        return true;
      }
    }
    System.out.println("All wheels are fine.");
    return false;
  }

  public boolean isRadiusCorrect(Wheel wheelForReplacement) {
    if (wheelForReplacement.getRadius() == wheels[0].getRadius()) {
      System.out.println("Radius is correct.");
      return true;
    }
    {
      return false;
    }
  }

  public boolean changeWheel(Wheel wheelForReplacement) {
    for (int i = 0; i < wheels.length; i++) {
      if (wheels[i].isFlat()) {
        wheels[i] = wheelForReplacement;
        System.out.println("Wheel changed");
        return true;
      }
    }
    return false;
  }

  public void getFlatTire() {
    getRandomWheel().setFlat(true);
  }

  private Wheel getRandomWheel() {
    final var randomIndex = ThreadLocalRandom.current().nextInt(0, wheels.length);
    return wheels[randomIndex];
  }
}
