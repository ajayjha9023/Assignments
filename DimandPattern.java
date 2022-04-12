public class DimandPattern {
    public static void main(String[] args) {
        int max=2,count=0;;
        for(int i=0;i<5;i++){
            for(int j=0;j<5-i;j++){
                System.out.print(" ");
            }
            if(i==0){
                System.out.println("*");
                continue;
            }
            for(int j=0;j<5;j++){
                if(count<max)
                System.out.print("*");
                count++;
            }
            System.out.println("");
        }
        for(int i=0;i<4;i++){
            if(i==3){

                System.out.println("*");
                break;
            }
            for(int j=0;j<2;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
