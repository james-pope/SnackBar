public class Complex {

    private double aVal;
    private double bVal;
    //private double ComplexNum;

    public Complex(double a){
        aVal = a;
        bVal = 0.0;
    }
    public Complex(double a, double b){
        aVal = a;
        bVal = b;
    }
    public double abs(){
        double x = Math.sqrt((aVal * aVal) + (bVal * bVal));
        return x;
    }
    
    public static void main(String [] args){
        Complex c1 = new Complex(16.1, 23.5);
        double x = c1.abs();
        System.out.println(x);
    }
}
