import java.util.*;
public class Gcd {
	
	private int num1;
	private int num2;
	private int ans;
	
	public Gcd(int n1,int n2){
		num1=n1;
		num2=n2;
	}
	
	public int getGcd() {
		System.out.print("The GCD of "+num1+" and "+num2+" is : ");
		while(num1%num2!=0) {
			int r = num1%num2;
			num1=num2;
			num2=r;
		}
		ans=num2;
		return ans;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		//INPUT
		
		System.out.print("NUMBER 1 : ");
		int a = s.nextInt();
		System.out.print("NUMBER 2 : ");
		int b = s.nextInt();
		Gcd obj = new Gcd(a,b);
		
		//OUTPUT
		
		int ans = obj.getGcd();
		System.out.println(ans);
		
	}

}
