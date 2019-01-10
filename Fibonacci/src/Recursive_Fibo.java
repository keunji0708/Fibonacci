import java.io.*;

public class Recursive_Fibo {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i <= N; i++) {
			long result = fibo_recur(i);
			bw.write(i + "번째 피보나치 수 : " + result + "\n");
		}
		
		bw.close();
		br.close();
	}
	public static long fibo_recur(int N) {
		if(N <= 1) {
			return N;
		}
		else {
			return fibo_recur(N-1) + fibo_recur(N-2);
		}
	}
}
