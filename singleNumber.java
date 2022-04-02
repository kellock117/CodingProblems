import java.util.HashSet;

public class singleNumber {
	static int singleNumber(int[] nums) {
		HashSet<Integer> set = new HashSet<Integer>();
		
		int n = 0;
		
		for(int i : nums) {
			n += i;
			if(set.contains(i)) 
				n -= i * 2;
			
			set.add(i);
		}
		
		return n;
	}
	
	static int singleNumberXOR(int[] nums) {
		int answer = 0;
		
		for(int i : nums) 
			answer ^= i;
		
		return answer;
	}
	
	public static void main(String[]args) {
		int[] num = {4,1,2,1,2};
		System.out.println(singleNumber(num));
		System.out.println(singleNumberXOR(num));
	}
}

//https://leetcode.com/problems/single-number/