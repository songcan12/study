package backjun_study;
import java.util.*;

public class sort1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = input.nextInt();
		}
		
		
		for(int i=0; i<N-1; i++) {
			for(int j=i+1; j<N; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	
		for(int i=0; i<N; i++) {
			System.out.println(arr[i]);
		}
	}

}
