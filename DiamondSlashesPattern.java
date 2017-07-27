import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner o=new Scanner(System.in);
    int rows=o.nextInt();
    int sp=rows*2;
    int c=rows+1;
    int d=rows;
    for(int i=1;i<=rows;i++)
    {
      for(int j=1;j<sp+1;j++)
      {
        if(j==d)
        {
          System.out.print("/"+"");
        }
        else if(j==c)
        {
          System.out.print("\\");
          System.out.print("");
        }
        else
        {
          System.out.print("*");
        }
      }
      c=c+1;
      d=d-1;
      System.out.println();
  }
  d=1;
  c=rows*2;
    for(int p=rows;p>0;p--)
    {
      for(int q=1;q<=sp;q++)
      {
        if(q==d)
        {
          System.out.print("\\");
          System.out.print("");
        }
        else if(q==c)
        {
          System.out.print("/"+"");
        }
        else
        {
          System.out.print("*");
        }
      }
      d=d+1;
      c=c-1;
      System.out.println();
    }
  }
}