package ru.danikirillov;

public final class Utils
{
  private Utils()
  {
  }

  static void checkIfPositive(int value)
  {
    if (value < 0)
    {
      //here is better to have checked exception, but as we don't have any user interface i throw an unchecked
      throw new RuntimeException("NO NEGATIVE NUMBERS PLEASE");
    }
  }
}
