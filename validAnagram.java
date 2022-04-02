import java.util.Arrays;

public class validAnagram {
	public static boolean isAnagram(String s, String t) {
		if(s.length() != t.length())
			return false;
		
		char c1 [] = s.toCharArray();
		char c2 [] = t.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		return Arrays.equals(c1, c2);
	}
	
	public static boolean On(String s, String t) {
	    if (s.length() != t.length()) {
	        return false;
	    }
	    
	    int[] str = new int[26];
	    for (int i = 0; i < s.length(); i++) {
	    	str[s.charAt(i) - 'a']++;
	    	str[t.charAt(i) - 'a']--;
	    }
	    
	    for (int k : str) 
	    	if (str[k] != 0) 
	    		return false;
	    
	    return true;
	}
	
	public static void main(String[]args) {
		System.out.println(isAnagram("anagram", "nagaram"));
		System.out.println(On("anagram", "nagaram"));
		System.out.println(On("car", "rat"));
	}
}

//https://leetcode.com/problems/valid-anagram/