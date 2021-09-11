public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
    public void add(double a,double b){
        this.real+=a;
        this.imaginary+=b;
    }
    public void add(ComplexNumber obj){
        this.real+=obj.real;
        this.imaginary+=obj.imaginary;
    }
    public void subtract(double a,double b){
        this.real-=a;
        this.imaginary-=b;
    }
    public void subtract(ComplexNumber obj){
        this.real-=obj.real;
        this.imaginary-=obj.imaginary;
    }



}
