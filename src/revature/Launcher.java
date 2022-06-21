package revature;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import revature.ListNode;

public class Launcher {

	public static void main(String[] args) {
		System.out.println("Elementary, my Dear Watson! There are: " + Squares(3,9) +" Square Ints!");
		System.out.println("Elementary, my Dear Watson! There are: " + Squares(17,24) +" Square Ints!");
		System.out.println("Elementary, my Dear Watson! There are: " + Squares(1,1000000000) +" Square Ints!");
	}
	
	public static int Squares(int min, int max) {
		
		return (int) (Math.floor(Math.sqrt(max)) - Math.ceil(Math.sqrt(min)) +1);
	}
}

		
		
		
		
		
		
		
		
		
		//	double deRivedmedian;

		//int[] nums1 = { 1, 2 };
	//	int[] nums2 = { 3, 4 };
		//int m = nums1.length;
		//int n = nums2.length;
		// for speed purposes block functions won't waste any memory
	//	int[] combinedNums = Arrays.copyOf(nums1, m + n);
	//	System.arraycopy(nums2, 0, combinedNums, m, n);
	//	Arrays.sort(combinedNums);

		// even vs odd -- this will work for any arrays introduced as nums1 x nums2
		/*if (combinedNums.length % 2 == 0) {
			deRivedmedian = ((double) combinedNums[combinedNums.length / 2]
					+ (double) combinedNums[combinedNums.length / 2 - 1]) / 2;
		} else {
			deRivedmedian = combinedNums[(combinedNums.length / 2)];
		}

		// output of solutions
		System.out.println("The Derived median from the combined arrays for problem 1 Is:" + deRivedmedian);
	}

	public ListNode mergeListsfromArray(ListNode[] lists) {
		int min_var = 0;
		ListNode first = new ListNode(0);
		ListNode h = first;
		while (true) {
			//bubble sort style speedup bool to break case instead of traversing array trivially 
			boolean speedupBreak = true;
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < lists.length; i++) {
				if (lists[i] != null) {
					if (lists[i].val < min) {
						min_var = i;
						min = lists[i].val;
					}
					speedupBreak = false;
				}

			}
			if (speedupBreak) {
				break;
			}
			//traverse entirety here
			ListNode a = new ListNode(lists[min_var].val);
			h.next = a;
			h = h.next;
			lists[min_var] = lists[min_var].next;
		}
		h.next = null;
		return first.next;
	}

*/	
	

	


