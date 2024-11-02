import java.util.*;
public class HW34 {
    int real;
    int imag;
    public Complex(int r, int i){
        real = r;
        imag = i;
    }
    public static Complex add(Complex a, Complex b){
        return new Complex ((a.real+b.real),(a.img+b.imag));
    }
}
