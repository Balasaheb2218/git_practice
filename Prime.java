// check and print if number is prime

public class Prime {
	public static void main(String[] args          ) {
		int n=5;
		int count=0;
		if(n==0||n==1) {
			System.out.println("Invalid");
			}
		else {
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					count++;
				}
			}
		}
		if(count>0) {
			System.out.println(n+" is not a prime number");
		}
		else
			System.out.println(n+" is prime number");
			
	}
	}
	