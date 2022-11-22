import java.util.*;
public class LinearSearch {
	
	private int n;
	private int[] nums;
	public Scanner s = new Scanner(System.in);
	
	public LinearSearch(int n) {
		this.n=n;
	}
	
	public int[] getInput() {
		nums = new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Element no "+(i+1)+" : ");
			nums[i]=s.nextInt();
		}
		return nums;
	}
	
	public int doLinearSearch(int[] arr) {
		int result=-1;
		System.out.print("Please enter the value to be Searched : ");
		int key = s.nextInt();
		for(int i=0;i<n;i++) {
			if(arr[i]==key) {
				result = i;
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		
		//INPUT
		
		System.out.print("N : ");
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		LinearSearch obj = new LinearSearch(n);
		
		int[] arr = obj.getInput();
		
		//OUTPUT
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		int val = obj.doLinearSearch(arr);
		
		System.out.println("Element is at Index : "+val+" (-1 if not found)");
		
		
	}

}
