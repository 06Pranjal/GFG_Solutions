class Solution {
    public String sortString(String s) {
        // code here
        int freq[]=new int[26];
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'a']++;
        }
        
        StringBuilder ans=new StringBuilder();
        
        for(int i=0;i<26;i++){
            while(freq[i]>0){
                ans.append((char)(i+'a'));
                freq[i]--;
            }
        }
        return ans.toString();
    }
}