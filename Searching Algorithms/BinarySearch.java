import java.util.*;
public class BinarySearch {
	
	private int n;
	public Scanner s = new Scanner(System.in);
	private int[] nums;
	
	public BinarySearch() {
		System.out.print("N : ");
		n = s.nextInt();
		System.out.println();
		nums = new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Element no "+(i+1)+" : ");
			nums[i]=s.nextInt();
		}
	}
	
	public void DoBinarySearch() {
		int key;
		System.out.print("please enter the element to be searched : ");
		key = s.nextInt();
		
		int first =0;
		int last = n-1;
		int mid = (first+last)/2;
		
		while(first <= last) {
			if(nums[mid] < key) {
				first = mid+1;
			}else if(nums[mid] == key) {
				System.out.println("Element found at index "+mid);
				break;
			}else {
				last=mid-1;
			}
			mid=(first+last)/2;
		}
		if(first>last) {
			System.out.println("Element not found");
		}
	}

	public static void main(String[] args) {
		
		BinarySearch obj = new BinarySearch();
		obj.DoBinarySearch();
		
	}

}
