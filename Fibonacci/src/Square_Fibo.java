import java.io.*;

public class Square_Fibo {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		long square[] = {1, 1, 1, 0};
		
		for (int i = 0; i <= N; i++) {
			long result = fibo_squ(i, square);
			bw.write(i + "번째 피보나치 수 : " + result + "\n");
		}

		bw.close();
		br.close();
	}
	
	public static long fibo_squ(int N, long[] square) {
		if(N < 2) {
			return N;
		}else {
			return pow(square, N)[1];
		}
	}
	
	public static long[] pow(long[] A, long N) {
		if(N == 1) {
			return A;
		}
		if(N % 2 == 0) {
			return pow(A, N / 2);
		}
		else {
            return mul(A, pow(mul(A, A), N / 2));
		}
	}
	
	public static long[] mul(long[] A, long[] B) {
		long[]Fibo_array = new long[4];
		
		Fibo_array[0] = A[0] * B[0] + A[1] * B[2];
		Fibo_array[1] = A[0] * B[1] + A[1] * B[3];
		Fibo_array[2] = A[2] * B[0] + A[3] * B[2];
		Fibo_array[3]= A[2] * B[1] + A[3] * B[3];

		return Fibo_array;
	}
}
