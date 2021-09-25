import java.lang.*;

 
public class Gym
{
  
public static void main (String[]args)
  {
    
Ball d1 = new Ball ("Tennis ball ", 2);
    
Ball d2 = new Ball ("Volleyball", 7);
    
Ball d3 = new Ball ("Basketball");
    
Ball d4 = new Ball ("Golf ball", 8);
    
Ball d5 = new Ball ("Football", 1);
    
d3.setNumber (1);
    
System.out.println (d1, d2, d3, d4, d5);

  } 
}
