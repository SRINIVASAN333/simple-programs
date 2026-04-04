import java.util.Scanner;
class Tcs01{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String stops[]={"TH","GA","IC","HA","TE","LU","NI","CA"};
        int path[]={800,600,750,900,1400,1200,1100,1500};
        String source=in.next().toUpperCase();
        String dest=in.next().toUpperCase();
        if(source.equals(dest)){
            System.out.print("Invalid input");
            return;
        }
        int s=-1,d=-1;
        for(int i=0;i<stops.length;i++){
            if(stops[i].equals(source))
                s=i;
            if(stops[i].equals(dest))
                d=i;
        }
        int dist=0;
        int i=s;
        while(i!=d){
            dist+=path[i];
            i=(i+1)%stops.length;
        }
        double fare=Math.ceil((dist*5.0)/1000);
        System.out.print(fare+"INR");
    }
} 