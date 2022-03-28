import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class twoSum {
    public static int[] ts(int[] nums, int target) {
        int [] a;
        int k;
        
        for(int i=0; i<nums.length; i++){
            k = 0;
            k += nums[i];
            for(int j=0; j<nums.length; j++){
                if(i==j)
                    continue;
                else
                    k += nums[j];
                
                if(k==target){
                    return new int[] {i,j};
                }
                k -= nums[j];
            }
        }
        return new int[] {-1,-1};
    }
    
    public static int[] tS(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; map.put(numbers[i], i++)) {
        	System.out.println(map);
            if (map.containsKey(target - numbers[i])) 
                return new int[]{map.get(target - numbers[i]),i};
        }
        return new int[]{0,0};
    }
    
    public static void main(String[]args) {
    	int [] a = {3,2,4};
    	System.out.println();
    	System.out.println(Arrays.toString(tS(a,6)));
    	System.out.println(Arrays.toString(ts(a,6)));
    }
}