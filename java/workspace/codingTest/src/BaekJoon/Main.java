package BaekJoon;

// 1212번 풀기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		BigInteger money = new BigInteger(st.nextToken());
		BigInteger count = new BigInteger(st.nextToken());		
		
		System.out.println(money.divide(count));
		System.out.println(money.remainder(count));
	}

}
