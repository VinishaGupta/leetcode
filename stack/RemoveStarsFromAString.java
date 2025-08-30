package leetcode.stack;

//Input: s = "leet**cod*e"
//Output: "lecoe"


import java.util.Stack;

public class RemoveStarsFromAString {

    public static void main(String[] args) {
        String str="leet**cod*e";
        System.out.println(removeStars(str));
    }


    public static String removeStars(String s) {

        if(s==null){
            return "";
        }


        Stack<Character> st=new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                if(!st.isEmpty()){
                    st.pop();
                }
            } else{
                st.push(s.charAt(i));
            }
        }

        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }
}
