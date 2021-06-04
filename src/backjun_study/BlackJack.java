package backjun_study;

import java.util.*;

//블랙잭 : 백준 브루트 포스 알고리즘

public class BlackJack {

    public static void main(String args[]) {

        // n개의 숫자는 Math.Random으로 구현 가능하지만, 대다수가 스캐너를 사용
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int[] N = new int[A];

        for (int i = 0; i < A; i++) {
            N[i] = sc.nextInt();
        }
        System.out.println(cksum(N, A, B));
    }


    public static int cksum(int[] arr, int A, int B) {
        //단순 비교
        int result = 0;
        for (int i = 0; i < A - 2; i++) {
            for (int j = i + 1; j < A - 1; j++) {
                for (int k = j + 1; k < A; k++) {
                    int ck = arr[i] + arr[j] + arr[k];
                    if (ck == B) {
                        return ck;
                    }
                    if (ck > result && ck < B) {
                        result = ck;
                    }
                }
            }
        }

        return result;
    }
}