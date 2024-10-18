package primenumbers;
import java.util.*;
public class Solution {
	public static boolean isPrime(int num) {
     	for(int i=2;i<num;i++){
          if(num%i==0){
            return false;
          }
	}
          return true;
	}

	public static void main(String[] args) {
		Solution solution=new Solution();
	    Scanner scanner=new Scanner(System.in);
	    int num= scanner.nextInt();
	    Boolean output = solution.isPrime(num);
	    System.out.println(output);

	}

}
