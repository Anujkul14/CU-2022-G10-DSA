package Lec6;

import java.util.ArrayList;

public class GenerateBinaryString {
    static ArrayList <String> ans;
    //recursive function to generate all possible binary strings
    public static void helper(int n,String binString)
    {
        if(n == binString.length())
        {
            ans.add(binString);
            return;
        }
        helper(n,binString + "0");
        helper(n,binString + "1");
    }

    public static ArrayList<String> generateBinary(int n)
    {
        ans = new ArrayList<>();
        helper(n,"");
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(generateBinary(3));
    }
}
