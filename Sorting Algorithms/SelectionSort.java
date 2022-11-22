import java.util.*;
public class SelectionSort {
	
	private int n;
	private int[] nums;
	
	public SelectionSort(int n) {
		this.n=n;
	}
	
	public int[] getRandom(){
		Random rand = new Random();
		nums = new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=rand.nextInt(100);
		}
		return nums;
	}
	
	public void doSelectionSort(int[] arr) {
		int l = arr.length;
		for(int i=0;i<l-1;i++) {
			int least = i;
			for(int j=i+1;j<l;j++) {
				if(arr[j]<arr[least]) {
					least=j;
				}
			}
			if(least!=i) {
				swap(arr,i,least);
			}
		}
	}
	
	private void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public void view(int[]a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		//INPUT
		
		System.out.print("N : ");
		int n=s.nextInt();
		SelectionSort obj = new SelectionSort(n);
		int[] nums=obj.getRandom();
		System.out.println();
		System.out.println();
		System.out.println();
		
		//OUTPUT
		
		System.out.println("Before Selection Sort : ");
		System.out.println();
		System.out.println();
		obj.view(nums);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("After Selection Sort : ");
		obj.doSelectionSort(nums);
		System.out.println();
		System.out.println();
		obj.view(nums);
		
	}

}
