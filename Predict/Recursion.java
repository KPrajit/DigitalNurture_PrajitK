public class Recursion{
    public static double predict(double amt,double rate, int yrs){
        if(yrs == 0) return amt;
        return predict(amt,rate,yrs-1)*(1+rate);
    }
    public static void main(String[] args){
        double res = predict(10000,0.20,4);
        System.out.println(res);
    }
}