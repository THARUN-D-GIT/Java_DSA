package Strings;

public class PassingStringTOMethod {
    static void main(String[] args) {
        String x="Tharun";
        System.out.println(x);
        change(x);
        System.out.println(x);

    }
    public static void change(String x)
    {
        x="charan";
    }
}
