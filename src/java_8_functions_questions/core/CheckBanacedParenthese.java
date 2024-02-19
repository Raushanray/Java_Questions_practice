package java_8_functions_questions.core;

import java.util.Stack;

public class CheckBanacedParenthese {
    static boolean banacedParenthese(String input) {
        //create a stack
        Stack stack = new Stack();

        //convert input in to a char arrays
        char[] charArray = input.toCharArray();

        //now iterate this char Array using for loop
        for (int i = 0; i < charArray.length; i++) {
            //get char
            char current = charArray[i];

            //check whether the current is '(', '{', '['
            if (current == '(' || current == '{' || current == '[') {
                stack.push(current);
                continue;

            }
            //check the stack is empty return false
            if (stack.isEmpty()) {
                return false;
            }

            //pop the stack element using  switch case.
            char popCharacter;
            switch (current) {
                case ')':
                    popCharacter = (char) stack.pop();
                    if (popCharacter == '{' || popCharacter == '[')
                        return false;
                    break;
                case '}':
                    popCharacter = (char) stack.pop();
                    if (popCharacter == '(' || popCharacter == '[')
                        return false;
                    break;

                case ']':
                    popCharacter = (char) stack.pop();
                    if (popCharacter == '(' || popCharacter == '{')
                        return false;
                    break;

            }
        }
        return (stack.isEmpty());
    }

    public static void main(String[] args) {
        String inputStr = "(({[]}))";
        if (banacedParenthese(inputStr)) {
            System.out.println("Input String " + inputStr + " is balanced");
        } else {
            System.out.println("Input String " + inputStr + " is not balanced");
        }
    }
}
