package Methods;

public class Return {
    public static int return_type(){
        System.out.println("hello this is  a method to demo for return type");
        return 9;
        //System.out.println("unreachble");
        // Anyhting written after the return statement is unreachable and give an error
    }
    public static  int return_t2(int a){
        System.out.println("vaani");
        if(a>0) return 5;
        else return 7;
    }
    static void main(String[] args) {
        //System.out.println(return_type());
int x=return_t2(8);
        System.out.println(x+3);

    }
}
