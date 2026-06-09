package Strings;

public class SubStringOfString {
    static void main(String[] args) {
        //we cannot change individual character to a string (Immutability)
        String str="RamanandVerma";
        //SubString:Continuous part of a String
        /*
        str.substring(i) ->prints all the character of a string from i to  end
        str.substring(i,j) ->prints ALL THE CHARACTER FROM I TO J-1

        PRINT ALL SUBSTRINGS:
                    s=gopi
              substring are -> g,go,gop,gopi,o,op,opi,p,pi,i
         */
        String str2="tarun";
        //System.out.println(str.substring(0,8)+" "+(str.substring(8)));
        //printing all the substrings
        System.out.println("substring of {str} are");
        for(int i=0;i<str2.length();i++){
            for(int j=i;j<str2.length();j++){

                System.out.print(str2.substring(i,j+1)+" ");
            }
            System.out.println();
        }
    }
}
