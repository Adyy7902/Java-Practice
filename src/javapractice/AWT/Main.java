package AWT;

// Aditya Kumar Yadav
// Date : 7-03-2022
// Write a program using try catch throw throws 
// and two built in exception and one custom exception
// use catch statement 
// print stack trace 
// print custom exception and print itsa stack trace 

class exp
{
  float div (float a, float b) throws ArithmeticException
  {
    if (b == 0.0)
      {
  throw new ArithmeticException ("div by 0");
      }
    return (a / b);
  }
}

class ProbWaterSpill extends Exception
{
  public ProbWaterSpill (String error)
  {
    super (error);
  }
}

public class Main
{
  public static void main (String args[])
  {
    int a = 8;
    int[] b = new int[5];
    for (int i = 0; i < 5; i++)
      {
  b[i] = i + 1;
      }
    int var1 = 100;

// 1
    try
    {
      var1 = var1 / 0;
    } catch (ArithmeticException e)
    {
      System.out.println (e);
    }

// 2
    try
    {
      if (a == 8)
  {
    throw new ArithmeticException ("value is 8");
  }
    }
    catch (ArithmeticException e)
    {
      System.out.println (e);
    }

// 3
    try
    {
      b[6] = 8;
    }
    catch (IndexOutOfBoundsException e)
    {
      System.out.println (e);
    }

// 4
    try
    {
      float c = new exp ().div (1, 2);
      System.out.println (c);
      float d = new exp ().div (1, 0);
      System.out.println(d);
    }
    catch (ArithmeticException e)
    {
      System.out.println (e);
    }

// 5
    try
    {
      float p = 0.8f;
      if (p > 0.7)
  {
    throw new ProbWaterSpill ("prob too high");
  }
    }
    catch (ProbWaterSpill e)
    {
      System.out.println (e);
    }
  }
}

