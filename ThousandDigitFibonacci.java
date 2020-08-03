import java.math.BigInteger;
/** @author Rachel
 *	https://projecteuler.net/problem=25
 *	Project Euler Problem 25
 *	The Fibonacci sequence is defined by the recurrence relation:
Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
Hence the first 12 terms will be:
F1 = 1
F2 = 1
F3 = 2
F4 = 3
F5 = 5
F6 = 8
F7 = 13
F8 = 21
F9 = 34
F10 = 55
F11 = 89
F12 = 144
The 12th term, F12, is the first term to contain three digits.
What is the index of the first term in the Fibonacci sequence to contain 1000 digits?*/
public class ThousandDigitFibonacci {
	public static void main(String[] args) {
		long sTime = System.currentTimeMillis();
		int i = 2;
		while(fib(i).length() < 1000) {
			fib(i);
			i++;
			if(fib(i).length() == 1000) {
				//i is used for indexing purposes. index of i = index of 1000 digit fib number.
				System.out.println(i);
				long eTime = System.currentTimeMillis();
				System.out.print("Solution took " + (eTime - sTime)/ 1000 +  " seconds");
			}
		}
	}
	public static String fib(int s) {
		/**dynamic programming of fibonacci sequence. Creates array, stores results, and calculates next number
		 * by using fn-1 + fn-2. @returns fn to string. */
		BigInteger[] fib = new BigInteger[s+1];
		//s+1; adding a new space.
		fib[0] = BigInteger.ZERO;
		fib[1] = BigInteger.ONE;
		for(int i = 2; i <= s; i++) {
			fib[i] = fib[i-1].add(fib[i-2]);
		}
		return fib[s].toString();
	}
}
