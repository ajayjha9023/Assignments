public class Series {
    public static void main(String[] args) {
        int a=2,b=3,n=5,count=0,result=0;
        for(int i=0;i<n;i++){
            result=a;
            for(int j=0;j<=count;j++){
                result+=(int)Math.pow(2, j)*b;
            }
        count++;
        System.out.print(result+",");
        result=0;
        }
    }
}
