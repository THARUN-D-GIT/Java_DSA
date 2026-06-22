package _2D_ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {
    public  static List<List<Integer>> generate(int n) {
        List<List<Integer>> ans=new ArrayList<>();
        /*
        if we want to use first set all the elements to 1 and then use the same loop below
        */
        for(int i=0;i<n;i++){
            ans.add(new ArrayList<>());
            for(int j=0;j<=i;j++){
                if(j==0 ||j==i)
                {
                    ans.get(i).add(1);
                }
                else{
                    int elem=ans.get(i-1).get(j)+ans.get(i-1).get(j-1);
                    ans.get(i).add(elem);
                }

            }
        }
        return ans;


    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows of pascalTriangle");
        int n=sc.nextInt();
        System.out.println(generate(n));

    }
}
