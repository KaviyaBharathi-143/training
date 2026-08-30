import java.util.HashSet;
class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> hs=new HashSet<> ();
       
        int len= nums.length;
        for(int i=0;i<len;i++){
            if (hs.contains(nums[i])){
                  return nums[i];
            }else{
                 hs.add(nums[i]);
            }
        }
        return -1;
    }
}