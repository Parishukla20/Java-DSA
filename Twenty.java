//Pattern Questions 3
public class Twenty {
    public static void main(String args[]){
        for(int i=1;i<=4;i++){
         for(int j=1;j<=4;j++){
            if(i==1 && j==2){
                System.out.print(" ");
            }
            else if(i==1 && j==3){
                System.out.print(" ");
            }
            else if(i==1 && j==4){
                System.out.print(" ");
            }
            else if(i==2 && j==3){
                System.out.print(" ");
            }
            else if(i==2 && j==4){
                System.out.print(" ");
            }
            else if(i==3 && j==4){
                System.out.print(" ");
            }
            else{
                System.out.print("*");
            }
        }
        System.out.println("");
       }
    }
}

//for(int j=1;j<=i;j++){"*"}