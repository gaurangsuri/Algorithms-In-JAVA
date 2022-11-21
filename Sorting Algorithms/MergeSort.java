import java.util.*;
public class MergeSort {

	private int n;
	private int[] nums;
	
	public MergeSort(int n) {
		this.n=n;
	}
	
	private int[] getRandom() {
		Random rand = new Random();
		nums = new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=rand.nextInt(100);
		}
		return nums;
	}
	
	private void doMergeSort(int[] numbers) {
		int len = numbers.length;
		if(len <= 1) {
			return;
		}
		
		int mid = len/2;
		
		int[] leftHalf = new int[mid];
		int[] rightHalf = new int [len-mid];
		
		for(int i = 0;i<mid;i++) {
			leftHalf[i] = numbers[i];
		}
		
		int j=0;
		for(int i = mid;i<len;i++) {
			rightHalf[j] = numbers[i];
			j++;
		}
		
		doMergeSort(leftHalf);
		doMergeSort(rightHalf);
		
		Merge(numbers,leftHalf,rightHalf);
		
	}
	
	private void Merge(int[] main,int[] l,int[] r) {
		
		int llen = l.length;
		int rlen = r.length;
		
		int i=0;
		int j=0;
		int k=0;
		
		while(i<llen && j<rlen) {
			
			if(l[i] <= r[j]) {
				main[k] = l[i];
				i++;
			}else {
				main[k] = r[j];
				j++;
			}
			
			k++;
			
		}
		
		while(i<llen) {
			main[k] = l[i];
			i++;
			k++;
		}
		
		while(j<rlen) {
			main[k] = r[j];
			j++;
			k++;
		}
		
	}
	
	public void print(int[] main) {
		System.out.println();
		for(int i=0;i<main.length;i++) {
			System.out.print(main[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print(" N : ");
		int n =s.nextInt();
		System.out.println();
		System.out.println();
		
		MergeSort obj = new MergeSort(n);
		
		int[] arr = obj.getRandom();
		
		System.out.println("Before Merge Sort : ");
		obj.print(arr);
		
		System.out.println();
		System.out.println();
		System.out.println();
		obj.doMergeSort(arr);
		
		System.out.println("After Merge Sort : ");
		obj.print(arr);
		
	}

}
