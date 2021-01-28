import java.util.*;
class Main{
  static Scanner kbd = new Scanner(System.in);
  public static void main(String[] args){
    int n = kbd.nextInt();
    if(n >= 1 && n <= 20){
      int a[] = new int[n];
      for(int i = 0;i < n;i++){
        a[i] = kbd.nextInt();
      }
      for(int i = 0;i < n;i++){
        if(a[i]%2 == 0)
           System.out.println(a[i] + " is even");
        else
           System.out.println(a[i] + " is odd");
      }
    }
  }
}