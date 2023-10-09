import java.util.*;
class Program2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input");
        int n=sc.nextInt();
            int count=0;
            int count1=3;
        for(int i=1;i<=n;i++){
            if(i==1 || i==2 && count==0 ){
                System.out.print(i+" ");
                count++;
            }else {
                if(i<=5){
                System.out.print(count1+" ");
                count1+=2;
                }
               
               
            }
             
               
            }
        }
       
    }
