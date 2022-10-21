public class pattern005{  
    public static void main(String[] args){
        for(int i=1; i<=5; i++){
            for(int k=1; k<=(i*2)-i; k++){
                System.out.print(" ");
           }
            for(int j=i; j<=5; j++){
                System.out.print("*"+" ");
            }
           
            System.out.println();
        } 
        for(int i=4; i>=1; i--){
            for(int k=1; k<=(i*2)-i; k++){
                System.out.print(" ");
           }
            for(int j=i; j<=5; j++){
                System.out.print("*"+" ");
            }
           
            System.out.println();
        }
    }
}
        