import java.util.*;
public class QuickSort {

	private int n;
	private int[] nums;
	public QuickSort(int n) {
		this.n=n;
	}
	
	private int[] getRandom() {
		Random rand = new Random();
		nums = new int[n];
		for(int i=0;i<nums.length;i++) {
			nums[i] = rand.nextInt(100);
		}
		return nums;
	}
	
	private void swap(int[] nums,int i,int j) {
		int temp = nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
	}
	
	private void QSort(int[] nums) {
		QSort(nums,0,nums.length-1);
	}
	
	public void QSort(int[] nums,int low,int high) {
		
		if(low >= high) {
			return;
		}
		
		int pivot = nums[high];
		int lp = low;
		int rp = high;
		
		while(lp < rp) {
			
			while(nums[lp] <= pivot && lp<rp ) {
				lp++;
			}
			
			while(nums[rp] >= pivot && rp>lp) {
				rp--;
			}
			
			swap(nums,lp,rp);
			
		}
		
		swap(nums,lp,high);
		
		QSort(nums,low,lp-1);
		QSort(nums,lp+1,high);
		
	}
	
	public void view(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("N : ");
		int n = s.nextInt();
		QuickSort obj = new QuickSort(n);
		
		int[] nums = obj.getRandom();
		
		obj.view(nums);
		obj.QSort(nums);
		System.out.println();
		System.out.println();
		obj.view(nums);
		
	}

}
