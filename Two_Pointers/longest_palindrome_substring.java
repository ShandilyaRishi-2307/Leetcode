package Two_Pointers;

public class longest_palindrome_substring {
    public String longestPalindrome(String s){
        int lpi[] = {0,0};
        for(int i = 0;i<s.length();i++){
            int currIndex[] = expandAroundCenter(s, i, i);
            if(lpi[1]-lpi[0] < currIndex[1]-currIndex[0]){
                lpi = currIndex;
            }
            //check for even length palindrome
            if(i+1<s.length() && s.charAt(i)==s.charAt(i+1)){
                int evenIndex[] = expandAroundCenter(s, i, i+1);
                if(lpi[1]-lpi[0] < evenIndex[1]-evenIndex[0]){
                    lpi = evenIndex;
                }
            }
        }
        return s.substring(lpi[0],lpi[1]+1);
    }
    private int[] expandAroundCenter(String s,int i, int j){
        while(i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)){
            i--;
            j++;
        }
        return new int[]{i + 1, j - 1};
    }
}
