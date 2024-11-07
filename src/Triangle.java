public class Triangle {

    int a ;
    int b ;
    int c ;

    public void area (){
        double p = (a+b+ c)/2;
        double res = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.printf("result : %.1f ",res);

    }


}
