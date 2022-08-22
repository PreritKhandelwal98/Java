class findMaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxofcount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                if(maxofcount<count){
                    maxofcount = count;
                }
            }else{
                count = 0 ;
            }
        }
        return maxofcount;
    }
    
    public static void main(String args[]){
        int arr[] = {1,0,1,1,0,1};
        int res = findMaxConsecutiveOnes(arr);
        System.out.print(res);
    }
}
