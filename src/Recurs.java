public class Recurs {


    public static void main(String[] args) {


        System.out.println(sqrt(5,2));
    }


    public static double sqrt(double numb, int exp){
        if (numb ==0 && exp == 0) {
            throw new ArithmeticException("Пустое множество!");}


        if (exp<0) {
            if (exp == -1){return 1/numb;}
            return 1/numb * sqrt(numb,++exp);
        } else if (exp == 0) {
            return 1;
        } else if (exp == 1) {
            return numb;
        } else
            return numb * sqrt(numb,--exp);
    }

}
