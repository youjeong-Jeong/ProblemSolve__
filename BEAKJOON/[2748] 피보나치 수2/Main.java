import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		
		long a = 0;
		long b = 1;
		
		long c = a+b;
		
		for(int i=1;i<n;i++) {
			c = a+b;
			
			a = b;
			b = c;
		}
		
		System.out.println(c);
		
		//dp로 다시
	}

}
