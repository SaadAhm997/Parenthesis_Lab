import java.util.Stack;

public class ParenthesesChecker {

    public static void main(String[] args) {

        ParenthesesChecker checker;
    }

    public Boolean checkParentheses(String testString) {
        Stack<Character> checker = new Stack<>();


        // return true if stack is empty because string is empty:

        if (checker.isEmpty()) {
            return true;
        }

        // 1 (Doesn't work) return false if one '(' but no ')';

        if (checker.contains('(') && !checker.contains(')')) {
            return false;
        }
        if (checker.contains(')') && !checker.contains('(')) {
            return false;
        }

        // 2 Loop through stack, calculate number of '(' , if odd, then return false.

        int leftBracketNum = 0;
        for (int i = 0; i < checker.size(); i++) {
            if (checker.contains('(')) {
                leftBracketNum += 1;
            }
            if ((leftBracketNum % 2) != 0) {
                return false;
            }
        }

        // Loop through stack, calculate number of ')' , if odd, then return false.

        int rightBracketNum = 0;
        for (int i = 0; i < checker.size(); i++) {
            if (checker.contains(')')) {
                rightBracketNum += 1;
            }
        }
        if ((rightBracketNum & 2) != 0) {
            return false;
        }
        return null;
    }
}


