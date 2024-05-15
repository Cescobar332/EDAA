package clase7;

public class cicloPara {
    public static void main(String[] args){
        //for (int num=1; num<=5; num++){
           // System.out.println(num);
        //}
        int num[] = new int [11];
        int multiplo = 3;
        for (int i=1; i< num.length;i++){
            num[i]=i*multiplo;
            System.out.println(num[i]);
        }
    }
}
