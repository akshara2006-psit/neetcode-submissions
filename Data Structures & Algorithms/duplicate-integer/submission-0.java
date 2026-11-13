class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int num:nums){
            mp.put(num,mp.getOrDefault(num,0)+1);

        }
        for(int num:mp.values()){
            if(num!=1){
                return true;
            }
        }
        return false;
    }
}