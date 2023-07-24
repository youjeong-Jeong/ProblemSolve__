import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(bf.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] array = new int[N];
		array[0] = 0;
				
		st = new StringTokenizer(bf.readLine());
		for(int i=0;i<N;i++) {
			if(i!=0) {
				array[i] = array[i-1] + Integer.parseInt(st.nextToken());
			}
			else
				array[i] += Integer.parseInt(st.nextToken());
		}
		
		int max = array[K-1];
		for(int i=0;i<N-K;i++) {
			if(max < (array[K+i] - array[i])) {
				max = array[K+i] - array[i];
			}
		}
		
		System.out.println(max);
		
	}

}
