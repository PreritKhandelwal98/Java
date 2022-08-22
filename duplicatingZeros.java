public class Main{
    public static void main(String args[]){
        int arr[] = {1,0,2,3,0,4,5,0};
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                int next = arr[i+1],temp=0;
                arr[i+1] = 0;
                int j = i+1;
                
                while(j<arr.length-1){
                    temp = arr[j+1];
                    arr[j+1] = next;
                    next = temp;
                    j++;
                }
                i++;
            }
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
