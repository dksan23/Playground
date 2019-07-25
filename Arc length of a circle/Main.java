import java.util.Scanner;
class Main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
float f=sc.nextFloat();
float e=sc.nextFloat();
double length=(e/360)*2*3.14*f;
System.out.printf("%.2f",length);
}
}

