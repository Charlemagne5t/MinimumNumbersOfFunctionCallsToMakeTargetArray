public class Solution {
    public int minOperations(int[] nums) {
        int countDecr = 0;
        int countMaxProd = 0;
        for(int i = 0; i < nums.length; i++){
            int x = nums[i];
            int curDecCount = 0;
            int curProdCount = 0;
            while(x != 0){
                if(x % 2 == 1){
                    x--;
                    curDecCount++;
                }else{
                    x /= 2;
                    curProdCount++;
                }
            }
            countDecr += curDecCount;
            countMaxProd = Math.max(countMaxProd,curProdCount);
        }
        return  countDecr + countMaxProd;
    }

}
