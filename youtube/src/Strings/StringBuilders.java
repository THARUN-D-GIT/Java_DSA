package Strings;

public class StringBuilders {
    static void main(String[] args) {
        /*
        STRING BUILDERS:
                    used to overcome string limitation
                    it is like a arraylist for string
              S.capacity:
              default value is 16
             or we can initialize the capacity while declaring the stringbuilder
             StringBuilder sb=new StringBuilder(10);
             initializes a sb with a capacity of 10
            Append:
                adds character to the end of a string or any data structure
            setcharAt:
                        sets or change particular character at any index
                        it does it O(1) time complexity

                    Syntax:
                   str. setCharAt(idx,'char');


         */
        StringBuilder sb=new StringBuilder("Ramesh");
        System.out.println(sb);
        System.out.println(sb.length()+" "+sb.capacity());
        sb.append("arvind");
        System.out.println(sb);
        StringBuilder s=new StringBuilder(10);
        System.out.println(s.capacity());
        s.append("ramesh arvindh");
        System.out.println(s+" "+s.capacity());
        sb.setCharAt(2,'j');
        System.out.println(sb);
        //sb.deleteCharAt(6);

    }
}
