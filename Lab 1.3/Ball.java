import java.lang.*;

public class Ball
{
  private String sport;
  private int number;
  public Ball (String n, int a)
  {
    sport = n;
    number = a;
  }

  public Ball (String n)
  {
    sport = n;
    number = 0;
  }

  public Ball ()
  {
    sport = "ball";
    number = 0;
  }

  public void setNumber (int number)
  {
    this.number = number;
  }

  public void setSport (String sport)
  {
    this.sport = sport;
  }

  public String getSport (String sport)
  {
    return sport;
  }

  public int getNumber ()
  {
    return number;
  }

  public String toString ()
  {
    return this.sport + ", number " + this.number;
  }
}
