//1 1 1 0 0 0
//0 1 0 0 0 0
//1 1 1 0 0 0
//0 0 0 0 0 0
//0 0 0 0 0 0
//0 0 0 0 0 0

// HighestSum of the hour glass so formed

//1 1 1 0 0 0
//0 1 0 0 0 0
//1 1 1 0 0 0
//0 0 2 4 4 0
//0 0 0 2 0 0
//0 0 1 2 4 0
import java.util.Scanner;

public class hourGlassSum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for row: ");
        int row = sc.nextInt();
        System.out.print("Enter the value for column: ");
        int col = sc.nextInt();
        int hg[][]=new int[6][6];
        int maxSum = Integer.MIN_VALUE;
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("Enter the value for ["+(i+1)+"]["+(j+1)+"]");
                hg[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(hg[i][j]+" ");
            }
            System.out.println();
        }

        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i>1 && j>1){
                    int sum = hg[i][j] + hg[i][j-1]+ hg[i][j-2]+ hg[i-1][j-1]+ hg[i-2][j]+ hg[i-2][j-1]+ hg[i-2][j-2];
                    if(sum > maxSum){
                        maxSum = sum;
                    } 
                    
                }
            }
        }
        System.out.println();
        System.out.println("The sum of the largeest hour glass combination is "+maxSum);
        sc.close();
    }
}