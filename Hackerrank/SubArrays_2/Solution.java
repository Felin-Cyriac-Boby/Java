import java.util.*;

public class Solution {
    
        static List<List<Integer>> list_of_lists = new ArrayList<>();
	static void combination_get(int[] arr,Integer[] data,int start,int end,int index,int r)     {
		if (index == r) {
			List<Integer> subs = new ArrayList<>(Arrays.asList(data));
            		Collections.sort(subs);
			list_of_lists.add(subs);
			return;
		}
		// second condition checks to make sure there is sufficient space left in the array to keep adding on
		for (int i = start; i <= end && end - i >= r - 1 - index; i++) {
			data[index] = arr[i];
			combination_get(arr,data,i+1 ,end,index+1,r);
		}
	}	

	static void combination_print(int[] arr, int end,int r) {
		Integer[] data = new Integer[r];
		combination_get(arr,data,0,end,0,r);
	}		
		
	static List<List<Integer>> subsetsWithDup(int[] arr) {
		int n = arr.length;
		//combination_print(arr,n-1,r);
		for (int i = 0; i <= n; i++) {
			combination_print(arr,n-1,i);
		}
		Set<List<Integer>>out = new HashSet<>();
		out.addAll(list_of_lists);
		List<List<Integer>> output = new ArrayList<>();
        	//for (List<Integer> j : out) {
        	//	output.add(j);
        	//}
		output.addAll(out);
        	//list_of_lists = new ArrayList<>();
        	return output;
	}
	public static void main(String[] args) {
		int[] arr = {4,1,0};
		System.out.print(subsetsWithDup(arr));
		
	}
}