import java.util.*;
public class InsertionSort {
	
	private int n;
	private int[] nums;
	
	public InsertionSort(int n) {
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
	
	public void doInsertionSort(int[] arr) {
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
		InsertionSort obj = new InsertionSort(n);
		int[] nums=obj.getRandom();
		System.out.println();
		System.out.println();
		System.out.println();
		
		//OUTPUT
		
		System.out.println("Before Insertion Sort : ");
		System.out.println();
		System.out.println();
		obj.view(nums);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("After Insertion Sort : ");
		obj.doInsertionSort(nums);
		System.out.println();
		System.out.println();
		obj.view(nums);
		
	}

}
