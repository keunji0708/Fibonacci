import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayFibonacci {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		long n = Long.parseLong(br.readLine());
		long result = fibo_arr(n);
		
		System.out.println("N번째 피보나치 수:" + result);
	}
	
	public static long fibo_arr(long n) {
		long[] arr = new long[100];
		arr[0] = 0;
		arr[1] = 1;
		
		for(int i = 2; i <= n; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		for(int i = 0; i <= n; i++) {
			System.out.println(arr[i]);
		}
		
		return arr[(int) n];
	}
}
