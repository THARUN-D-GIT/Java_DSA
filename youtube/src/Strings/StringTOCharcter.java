package Strings;

public class StringTOCharcter {
    static void main(String[] args) {
        /*
        converting a given String to character array
         */
        String str="Tharun";
        System.out.println(str);
        char [] ch=new char[str.length()];
        for(int i=0;i<str.length();i++){
            ch[i]=str.charAt(i);
        }
        for(char c:ch){
            System.out.print(c+" ");
        }
        //inbuilt method
        /*
        isTareekeKoHumCamelCaseKehtheHai
        where the first letter of a method is lower case and every other
        words first letter is capital(upper case)
        THIS IS CALLED Pascal
        BUILT IN METHOD FOR THIS:str.toCharArray
         */
        System.out.println();
        char [] c=str.toCharArray();
        for (char elem:c){
            System.out.print(elem+" ");
        }
    }
}
