package backjun_study;
import java.util.*;

public class sort2 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		
		for(int i=0; i<num; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
	}

}
