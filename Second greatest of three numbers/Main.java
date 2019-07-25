import java.util.Scanner;
import java.util.Arrays;
class Main
{ 
 public static void main(String args[] ){
   Scanner sc=new Scanner(System.in);
   String a=sc.nextLine();
  int [] l={Integer.parseInt(a.split(" ")[0]),Integer.parseInt(a.split(" ")[1]),Integer.parseInt(a.split(" ")[2])};
 	Arrays.sort(l);
   System.out.println(l[1]);
}
}