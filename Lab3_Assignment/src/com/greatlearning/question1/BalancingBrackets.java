package com.greatlearning.question1;

import java.util.Stack;

public class BalancingBrackets {
	
	// function to check if brackets are balanced
    static boolean checkingBracketsBalanced(String bracketExpression)
    {
        
        Stack<Character> stack = new Stack<Character>();
 
        for (int i = 0; i < bracketExpression.length(); i++)
        {
            char character = bracketExpression.charAt(i);
 
            if (character == '(' || character == '[' || character == '{')
            {
               
                stack.push(character);
                continue;
            }
 
          
            if (stack.isEmpty())
                return false;
            
            char c;
            
            switch (character) {
            
            case '}':
            	
            	c = stack.pop();
                if (c == '(' || c == '[')
                    return false;
                break;
                
            case ')':
            	
                c = stack.pop();
                if (c == '{' || c == '[')
                    return false;
                break;
 
            case ']':
                c = stack.pop();
                if (c == '(' || c == '{')
                    return false;
                break;
            }
        }	       
        return (stack.isEmpty());
    }
 
    // Driver code
    public static void main(String[] args)
    {
        String bracketExpression1 = "([[{}]])";
        String bracketExpression2 = "([[{}]]))";
         
        Boolean result;
        
        result = checkingBracketsBalanced(bracketExpression1);
        
        if (result)
            System.out.println("The entered String " + bracketExpression1 + " has Balanced Brackets");
        else
            System.out.println("The entered String " + bracketExpression1 + " do not contain Balanced Brackets ");
    
        result = checkingBracketsBalanced(bracketExpression2);
        
        if (result)
            System.out.println("The entered String " + bracketExpression2 + " has Balanced Brackets");
        else
            System.out.println("The entered String " + bracketExpression2 + " do not contain Balanced Brackets ");
    }

}
