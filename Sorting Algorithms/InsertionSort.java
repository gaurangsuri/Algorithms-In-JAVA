import java.util.*;
public class InsertionSort {
	
	private int n;
	private int[] nums;
	
	public InsertionSort(int n) {
		this.n=n;
	}
	
	public int[] getRandom() {
		Random rand = new Random();
		nums = new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=rand.nextInt(100);
		}
		return nums;
	}
	
	public void doInsertionSort(int[]arr) {
		for(int i=1;i<n;i++) {
			int temp =i;
			for(int j=i-1;j>=0;j--) {
				if(arr[j]>arr[temp]) {
					swap(arr,j,temp);
					temp=j;
				}
			}
		}
	}
	
	private void swap(int[]arr,int i,int j) {
		int t = arr[i];
		arr[i]=arr[j];
		arr[j]=t;
	}
	
	public void view(int[] arr) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		//INPUT
		
		System.out.print("N : ");
		int n=s.nextInt();
		System.out.println();
		System.out.println();
		InsertionSort obj = new InsertionSort(n);
		
		//OUTPUT
		
		System.out.println("Before Insertion Sort : ");
		int[] nums = obj.getRandom();
		System.out.println();
		System.out.println();
		obj.view(nums);
		obj.doInsertionSort(nums);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("After Insertion Sort : ");
		System.out.println();
		System.out.println();
		obj.view(nums);
		

	}

}
