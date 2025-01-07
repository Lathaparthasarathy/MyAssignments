package javaday2;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=13; int x=0;
		for (int i=2; i<=n-1; i++) {
			if (n%i==0) {
				x=1;
				System.out.println("The Number is Not Prime");	
				break;
			}
		}
		if (x==0) {
			System.out.println("The Number is Prime");
		}

	}

}
