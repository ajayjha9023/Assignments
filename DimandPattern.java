public class DimandPattern {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=0;j<5-1-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i*2;j++){
                if(j==0||j==i*2)
                System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println("");
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=(3-i)*2;j++){
                if(j==0||j==(3-i)*2)
                System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
