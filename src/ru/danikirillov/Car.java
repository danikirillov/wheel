package ru.danikirillov;

import java.util.concurrent.ThreadLocalRandom;

public class Car
{
  Wheel[] wheels;

  Car(Wheel[] wheels)
  {
    this.wheels = wheels;
  }

  public void replaceFlatWheel(Wheel wheelForReplacement)
  {
    if (!isAnyWheelFlat())
    {
      System.out.println("All wheels are fine, no need in replacing.");
      return;
    }

    if (isRadiusCorrect(wheelForReplacement))
    {
      changeWheel(wheelForReplacement);
    }
    else
    {
      System.out.println("Radius of provided wheel is incompatible.");
    }
  }

  boolean isAnyWheelFlat()
  {
    // ?????? ??? ??? return true; ????? ???????
    return true;
  }

  private boolean isRadiusCorrect(Wheel wheelForReplacement)
  {
    //?????? ??? ??? return false; ????? ???????
    return false;
  }

  private void changeWheel(Wheel wheelForReplacement)
  {
    //?????? ??? ???

  }

  public void getFlatTire()
  {
    getRandomWheel().setFlat(true);
  }

  private Wheel getRandomWheel()
  {
    final var randomIndex = ThreadLocalRandom.current().nextInt(0, wheels.length);
    return wheels[randomIndex];
  }
}
