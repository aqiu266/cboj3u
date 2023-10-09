import java.util.Scanner;

public class Main {
  public static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
    //DO NOT ALTER - this will get your numbers into an Array
    int n = input.nextInt();
    double [] myArray = getArray(n);

    //call max
    System.out.println(max(myArray));
  }

  //do not alter the method getArray
public static double[] getArray(int n){
   double [] temp = new double[n];
   for(int x=0; x<n; x++){
     temp[x] = input.nextDouble();
   }
   return temp;
 }

  public static double max(double[] arr) {
    double m = arr[0];
    
    for (int i = 1; i < arr.length; i++) {
      if (m < arr[i]) {
        m = arr[i];
      }
    }
    
    return m;
  }
}