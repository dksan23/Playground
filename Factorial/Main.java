import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    long n=sc.nextLong();
    long fact=1;
    for(int i=1;i<=n;i++) fact*=i;
    System.out.println(fact);
  }
}