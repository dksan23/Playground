import java.util.Scanner;
class Main
{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    float f=sc.nextFloat();
    float e=sc.nextFloat();
    double h=Math.hypot(f,e);
  //Type your code here
    System.out.printf("%.2f",h);

}
}