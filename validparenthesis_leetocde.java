/*
Valid Parenthesis
*/

class Solution {
    public boolean isValid(String s) { 
        if(s.length()==1) return false;
        Stack<Character> stack = new Stack<>();
        int i=0;
        while(i<s.length())
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='[' ||s.charAt(i)=='{' )  
                stack.push(s.charAt(i));                                 
            else
            {
                if(stack.empty()) return false;
                char c=stack.peek();           
                if((c=='(' && s.charAt(i)==')')||(c=='{' && s.charAt(i)=='}')||(c=='[' && s.charAt(i)==']'))         
                    stack.pop();
                else
                    return false;
            }
            i++;
        }
        
        if(!stack.empty()) return false;
        return true;
    }
}