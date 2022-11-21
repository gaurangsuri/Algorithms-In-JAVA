import java.util.*;
public class Primefactorization {
	
	private int num;
	
	public Primefactorization(int x) {
		num = x;
	}
	
	public void getResult() {
		for(int i=2;i<=num;i++) {
			while(num%i==0) {
				num=num/i;
				if(num!=1) {
					System.out.print(i+" X ");
				}else {
					System.out.print(i);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		//INPUT
		
		System.out.print("Number : ");
		int a = s.nextInt();
		Primefactorization obj = new Primefactorization(a);
		
		//output
		
		obj.getResult();
		
	}
}