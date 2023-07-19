import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final int N = 10;
		final int S = 100;
		Scanner scr = new Scanner(System.in);

		int[] mushScore = new int[N];
		int[] scoreSum = new int[N];
		scoreSum[0] = 0;
		int[] absArray = new int[N];

		for (int i = 0; i < N; i++) {
			mushScore[i] = scr.nextInt();
			
			//누적합 배열
			if (i == 0) {
				scoreSum[i] = mushScore[i];
			}
			else {
				scoreSum[i] = scoreSum[i-1] + mushScore[i];
			}
			
			//100과 절대 값 구하기
			if(scoreSum[i] >= S) {
				absArray[i] = scoreSum[i] - 100;				
			}
			else if(scoreSum[i] < S) {
				absArray[i] = 100 - scoreSum[i];
			}
			
		}

		int abs = absArray[0];
		int res = 0;
		
		for(int i=1;i<N;i++) {
			if(abs > absArray[i]) {
				abs = absArray[i];
				res = i;
			}
			
			//만약 100에 가까운 수가 2개라면 큰 값 선택 위해서
			else if(abs == absArray[i]) {
				if(scoreSum[i] >= scoreSum[res])
					res = i;
			}
		}
		
		System.out.println(scoreSum[res]);

	}

}
