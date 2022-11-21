import java.util.*;
public class Power {
	
	public int num;
	public int pow;
	
	public Power(int num,int pow ) {
		this.num = num;
		this.pow = pow;
	}
	
	public int raise() {
		int x =1;
		for(int i=0;i<pow;i++) {
			x *= num;
		}
		return x;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		// INPUT

		System.out.print("Integer : ");
		int a = s.nextInt();
		System.out.print("Power : ");
		int b = s.nextInt();
		Power obj = new Power(a,b);
		
		// GETTING RESULT
		
		int result = obj.raise();
		System.out.print(" Given integer raised to the given power is : ");
		System.out.print(result);
	}
}