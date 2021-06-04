package backjun_study;

import java.util.*;

public class sort3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[][] arr = new String[n][2];
		
		
		for(int i=0; i<n; i++) {
			arr[i][0] = sc.next();
			arr[i][1] = sc.next();
		}
		Arrays.sort(arr, new Comparator<String[]>() {
			@Override
			public int compare(String[] arg0, String[] arg1) {
				return Integer.parseInt(arg0[0]) - Integer.parseInt(arg1[0]);
				//기본적인 콤페어 함수
				//오름차순 정렬 (0,1,-1) 반환
			}
		});
		for(int i=0; i<n; i++) {
			System.out.println(arr[i][0]+" "+arr[i][1]);
		}
	}
}
