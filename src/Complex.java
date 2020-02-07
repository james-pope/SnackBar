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
    public Complex add(Complex other){
        double a = aVal + other.aVal;
        double b = bVal + other.bVal;
        Complex sum = new Complex(a, b);
        return sum;
    }
    public String toString(){
        double a = Math.round(aVal*100.0)/100.0;    //rounds decimal to hundreds place
        double b = Math.round(bVal*100.0)/100.0;
        String s = "(" + a + " + " + b + "i" + ")";
        return s;
    }
    public Complex multiply(Complex other){
        double a = (aVal*other.aVal) - (bVal*other.bVal);
        double b = (aVal*other.bVal) + (bVal * other.aVal);
        Complex product = new Complex(a, b);
        return product;
    }
    public static void main(String [] args){

        Complex c1 = new Complex(16.1, 23.5);
        Complex c2 = new Complex(14.1, 17.9);

        System.out.println(c2 + " + " + c1 + " = " + c2.add(c1));
        System.out.println(c1 + " * " + c2 + " = " + c1.multiply(c2));
    }
}
