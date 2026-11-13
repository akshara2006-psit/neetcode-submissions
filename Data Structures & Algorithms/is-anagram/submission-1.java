class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> mp1=new HashMap<>();
        HashMap<Character,Integer> mp2=new HashMap<>();
        for(char c:s.toCharArray()){
            mp1.put(c,mp1.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            mp2.put(c,mp2.getOrDefault(c,0)+1);
        }
        for(char c:mp1.keySet()){
            int v1=mp1.get(c);
            int v2=mp2.getOrDefault(c,0);
            if(v1!=v2){
                return false;
            }
        }
        for(char c:mp2.keySet()){
            int v1=mp2.get(c);
            int v2=mp1.getOrDefault(c,0);
            if(v1!=v2){
                return false;
            }
        }
        return true;
    }
}
