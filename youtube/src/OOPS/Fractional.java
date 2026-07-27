package OOPS;

public class Fractional {
    int num;
    int den;
    Fractional(int  num,int  den){
        this.num=num;
        this.den=den;
        simplify();
    }
    void add(Fractional f){
        int a=this.num;
        int b=this.den;
        int c=f.num;
        int d=f.den;
        this.num=(a*d)+(b*c);
        this.den=(b*d);
        simplify();
//        this.num=(this.num*f.den)+(this.den*f.num);
//        this.den=(this.den*f.den);
    }
    void subtract(Fractional f){
        int a=this.num;
        int b=this.den;
        int c=f.num;
        int d=f.den;
        this.num=(a*d)-(b*c);
        this.den=(b*d);
        simplify();
//        this.num=(this.num*f.den)+(this.den*f.num);
//        this.den=(this.den*f.den);
    }
    void multiply(Fractional f){
//        this.num=this.num*f.num;
//        this.den=this.den*f.den;
        int a=this.num;
        int b=this.den;
        int c=f.num;
        int d=f.den;
        this.num=(a*c);
        this.den=b*d;
        simplify();
    }
    void divide(Fractional f){
        int a=this.num;
        int b=this.den;
        int c=f.num;
        int d=f.den;
        this.num=(a*d);
        this.den=b*c;
        simplify();

    }


    int hcf(int a,int b){
        if(a==0) return b;
        return hcf(b%a,a);
    }
    void simplify()
    { // for negative value
        boolean isneg=(num*den<0) ? true : false;
        num=Math.abs(num);
        den=Math.abs(den);
        int gcd=hcf(this.num,this.den);
        this.num=this.num/gcd;
        this.den=this.den/gcd;
        if(isneg) num=-num;
    }
    void print(){
        System.out.println(num+"/"+den);
    }
    static void main(String[] args) {
        Fractional f1=new Fractional(4,3);
        Fractional f2=new Fractional(6,8);
        Fractional f3=new Fractional(7,5);
        Fractional f4=new Fractional(11,8);
        Fractional f5=new Fractional(13,-7);
        Fractional f6=new Fractional(17,8);
        Fractional f7=new Fractional(15,7);
        Fractional f8=new Fractional(19,12);


        System.out.println("Addition");
        f1.print();
        f2.print();
        f1.add(f2);
        f1.print();
        System.out.println("Subtraction");
        f7.print();
        f8.print();
        f7.subtract(f8);
        f7.print();
        System.out.println("Multiplication");
        f3.print();
        f4.print();
        f3.multiply(f4);
        f3.print();
        System.out.println("Division");
        f5.print();
        f6.print();
        f5.divide(f6);
        f5.print();

    }
}
