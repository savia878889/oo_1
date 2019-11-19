abstract class CShape
{
  protected String color;  
  public void setColor(String str)
  {
  coloe=str;
  }
  public abstranct void show;
}

class CTriangle extends CShape
{
  protected double A,B,C;
  public CTriangle(double a,b,c)
   {
      A=a;
      B=b;
      C=c;
   }
   public void show()
    {
    System.out.print("color="+color+", ");
    System.out.print("area="+0.5*A*B);
    }
}



public class hw1
{
  public static void main (String arg[])
  {
    CTriangle triangle=new  CTriangle(3,4,5);
    triangle.setColor("red");
    triangle.show();
   }
}
    
