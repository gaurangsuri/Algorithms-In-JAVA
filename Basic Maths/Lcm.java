import java.util.*;
public class Lcm {

	private int n1;
	private int n2;
	private int ans;
	
	public Lcm(int n1,int n2) {
		this.n1=n1;
		this.n2=n2;
	}
	
	public int getGcd() {
		System.out.print("The LCM of "+n1+" and "+n2+" is : ");
		while(n1%n2!=0) {
			int rem=n1%n2;
			n1=n2;
			n2=rem;
		}
		int gcd=n2;
		return gcd;
	}
	
	public int getLcm() {
		ans = (n1*n2) / getGcd();
		return ans;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		//INPUT
		
		System.out.print("A : ");
		int a=s.nextInt();
		System.out.print("B : ");
		int b=s.nextInt();
		Lcm obj = new Lcm(a,b);
		
		//GET OUTPUT
		
		System.out.println(obj.getLcm());
	}
}