package backjun_study;
import java.util.*;


/*//Welcome. In this kata, you are asked to square every digit of a number and concatenate them.

For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.

Note: The function accepts an integer and returns an integer
*/

public class SquareDigit {

  public int squareDigits(int n) {
    ArrayList<Integer> num = new ArrayList<Integer>();
    int input = n;
    int temp = 0;
    String temp2 ="0";
    
    while(input>0) {
      num.add(input%10);
      input = input/10;
    }
    
   for(int i=num.size()-1; i>=0; i--) {
	   temp = num.get(i);
	   temp = temp*temp;
	   temp2 += Integer.toString(temp);
   }
    int result = Integer.parseInt(temp2);
    return result;
  }

  public static void main(String args[]) {

	  SquareDigit O = new SquareDigit();
	  System.out.println(O.squareDigits(9119));
	  
  }

}
/*
 * public int squareDigits(int n) { String result = "";
 * 
 * while (n != 0) { int digit = n % 10 ; result = digit*digit + result ; n /= 10
 * ; }
 * 
 * return Integer.parseInt(result) ; }
 */

