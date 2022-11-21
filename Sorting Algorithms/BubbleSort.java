import java.util.*;
public class BubbleSort {
	
	private int n;
	private int[] nums;
	
	public BubbleSort(int n) {
		this.n=n;
	}
	
	public int[] getRandom() {
		Random rand = new Random();
		nums = new int[n];
		for(int i=0;i<n;i++) {
			nums[i] = rand.nextInt(100);
		}
		return nums;
	}
	
	private void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public void DoBubbleSort(int[] arr) {
		int l = arr.length;
		for(int i=0;i<l-1;i++) {
			for(int j = l-1;j>i;j--) {
				if(arr[j] < arr[j-1]) {
					swap(arr,j,j-1);
				}
			}
		}
	}
	
	public void view(int[] arr) {
		int l = arr.length;
		for(int i=0;i<l;i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("N : ");
		int n=s.nextInt();
		System.out.println();
		System.out.println();
		BubbleSort obj = new BubbleSort(n);
		int[] nums = obj.getRandom();
		
		System.out.println("Before Bubble Sort : ");
		System.out.println();
		System.out.println();
		obj.view(nums);
		System.out.println();
		System.out.println();
		System.out.println();
		obj.DoBubbleSort(nums);
		System.out.println("After Bubble Sort");
		System.out.println();
		System.out.println();
		obj.view(nums);
		
	}

}
