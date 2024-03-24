class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> map= new HashMap<>();
        int ans=0;
        for( int x: nums){
            if(map.containsKey(x)){
                ans=x;
                break;
            }
            map.put(x,1);
        }
        return ans;
    }
}
