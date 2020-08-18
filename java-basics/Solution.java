import java.io.*;
import java.util.*;
import java.lang.StringBuilder;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        // System.out.println(Solution.removeOuterParentheses(s));
        // System.out.println(Solution.removeDuplicates(s));
        String S[] = {"akshay", "bagde"};
        Solution.tp(S);
        System.out.println(Arrays.toString(S));


        // String regex = "[!,._?'@\\s]+";
        // String[] str = s.trim().split(regex);
        // int l = str.length;
        // for(int i = 0;i<l;i++){
        //     System.out.println(str[i]);
        //     // if(str[i].length() != 0){System.out.println(str[i]);}
        // }

        // String reg2 = "(?i)^(a)([a-zA-Z])+(y)$";
        // if(s.matches(reg2)){System.out.println(s);}
                
    }
    public static void tp(String[] s){
        s[0] = "AkshAY";
        s[1] = "prabhakant";
    }
    public static String removeOuterParentheses(String S) {
        int l = S.length();
        if(l == 0){return S;}
        Stack<Character> stack = new Stack<>();
        ArrayList<Integer> indices = new ArrayList<>();
        indices.add(-1);
        for(int i = 0;i<l;i++){
            if(S.charAt(i) == '('){stack.push(S.charAt(i));}
            else{
                if(!stack.empty()){stack.pop();}
                if(stack.empty()){indices.add(i);}
            }
        }
        int num_indices = indices.size();
        String ans = "";
        for(int i = 0;i<num_indices-1;i++){
            int start = indices.get(i) + 2;
            int end = indices.get(i+1);
            ans += S.substring(start, end);
        }
        return ans;
    }

    public static String removeDuplicates(String S) {
        int l = S.length();
        if(l < 2){return S;}
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<l;i++){
            if(stack.empty()){stack.push(S.charAt(i));}
            else{
                Character top = stack.pop();
                if(top != S.charAt(i)){
                    stack.push(top);
                    stack.push(S.charAt(i));
                }
            }
        }
        StringBuilder ans = new StringBuilder();
        while(!stack.empty()){
            ans.append(stack.pop());
        }
        return ans.reverse().toString();

    }
}

