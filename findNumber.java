class findNumber {
   public static int findNumbers(int[] nums) {
		int count = 0;
		for(int i : nums)
			if(String.valueOf(i).length() % 2 == 0) count++;
		return count;
	}
    
    public static void main(String args[]){
        int arr[] = {555,901,482,1771};
        int res = findNumbers(arr);
        System.out.print(res);
    }
}
