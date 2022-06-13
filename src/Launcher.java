import java.util.Arrays;

public class Launcher {

	public static void main(String[] args) {
		double deRivedmedian;
		
		
		int[] nums1 = {1,2};
		int[] nums2 = {3,4};
		int m = nums1.length; 
		int n = nums2.length;
		 // for speed purposes block functions won't waste any memory
		 int[] combinedNums = Arrays.copyOf(nums1, m + n);
		 System.arraycopy(nums2, 0, combinedNums, m, n);
		 Arrays.sort(combinedNums);
		 
		 //even vs odd -- this will work for any arrays introduced as nums1 x nums2
		 if(combinedNums.length % 2 == 0) {
			deRivedmedian = ((double) combinedNums[combinedNums.length/2] + (double) combinedNums[combinedNums.length/2-1])/2;
		 }
		 else {
			 deRivedmedian = combinedNums[(combinedNums.length/2)];
		 }
		 
		 //output of solution
	System.out.println("The Derived median from the combined arrays Is:" + deRivedmedian);
		 }

	}


