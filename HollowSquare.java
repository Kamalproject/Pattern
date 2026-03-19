import java.util.Scanner;
public class HollowSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N: ");
        int n=sc.nextInt();
        System.out.print("Enter M: ");
        int m=sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(i==0|| j==0 || i==n || j==m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
