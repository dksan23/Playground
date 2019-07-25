import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    long l=s.nextLong();
    long k=s.nextLong();
    if(k<0) System.out.println("Wrong input");
    else System.out.println(Math.pow(l,k));
  }
}
