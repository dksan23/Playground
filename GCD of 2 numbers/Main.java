import java.util.Scanner;
public class Main{
  static int gcd(int a ,int b){
    while(b!=0){
      int t=a;
      a=b;
      b=t%b;
    }
    return a;
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println(gcd(a,b));
  }
}