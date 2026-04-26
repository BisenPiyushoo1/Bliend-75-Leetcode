class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,lenmax=0;
        int n=s.length();
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(map.containsKey(c)){
                left=Math.max(left,map.get(c)+1);
            }
            map.put(c,i);
            lenmax=Math.max(lenmax,i-left+1);
        }
        return lenmax;
    }
}
