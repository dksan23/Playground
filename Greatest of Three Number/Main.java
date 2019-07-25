import java.util.Scanner;

class Main
{ 
 public static void main(String args[] ){
   Scanner sc=new Scanner(System.in);
   String a=sc.nextLine();
  int [] l={Integer.parseInt(a.split(",")[0]),Integer.parseInt(a.split(",")[1]),Integer.parseInt(a.split(",")[2])};
  int d=Math.max(l[0],l[1]);
   d=Math.max(d,l[2]); 
   System.out.println(d);
}
}