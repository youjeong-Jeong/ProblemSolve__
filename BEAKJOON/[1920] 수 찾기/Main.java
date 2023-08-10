import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static int search(long a[], int key) {
		int low = 0;
		int high = a.length - 1;
		int mid;
		
		while(low<=high) {
			mid = (low+high)/2;
			
			if(a[mid] == key)
				return 1;
			else if(a[mid]>key)
				high = mid - 1;
			else if(a[mid]<key)
				low = mid + 1;
		}
		return 0;
	}
	
	
	public static void main (String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		long[] a = new long[n];
		int i;
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		for(i=0;i<n;i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(a);
		
		int m = Integer.parseInt(bf.readLine());
		st = new StringTokenizer(bf.readLine());
		
		int key;
		
		for(i=0;i<m;i++) {
			key = Integer.parseInt(st.nextToken());
			System.out.println(search(a, key));
		}
	}
}
