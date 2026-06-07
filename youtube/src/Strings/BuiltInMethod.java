package Strings;

public class BuiltInMethod {
    static void main(String[] args) {
        String s="Arpith Bansal";
        // checking the indvisual index of particular character

        //if a character is repeated many times then its first occurance is returned
        // the syntax :Str.lastIndexOf l:lower case and I&O :upper case
        System.out.println(s.indexOf('p'));
        //last index of a repeated multiple time
        System.out.println(s.lastIndexOf('a'));

        //to all the letters to uppercase or lowercase
        //String str="DDWKwnklch2blk2c@WK";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());


        //contains is a function used to check the sub string
        //And it returns true or false
        String s1="harshitha";
        System.out.println(s1.contains("harsh"));

        //start with and endswith
        System.out.println(s1.startsWith("a"));

    }
}
