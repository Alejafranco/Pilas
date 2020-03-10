
package pilas;

public class Validate {

    public boolean checkParanthesisBalanced(String exp) {
        LinkedStack validateStack = new LinkedStack();
        char[] arrayString = exp.toCharArray();
        for (int i = 0; i < arrayString.length; i++) {
            switch (arrayString[i]) {
                case '{':
                    validateStack.push('{');
                    if (validateStack.getTop().getNextNode() != null && (char) validateStack.getTop().getNextNode().getData() == '[') {
                        return false;
                    } else if (validateStack.getTop().getNextNode() != null && (char) validateStack.getTop().getNextNode().getData() == '(') {
                        return false;
                    }   break;
                case '}':
                    if (validateStack.empty()) {
                        return false;
                    } else if ((char) validateStack.pop() != '{') {
                        return false;
                    }   break;
                case '[':
                    validateStack.push('[');
                    if (validateStack.getTop().getNextNode() != null && (char) validateStack.getTop().getNextNode().getData() == '(') {
                        return false;
                    }   break;
                case ']':
                    if (validateStack.empty()) {
                        return false;
                    } else {
                        if ((char) validateStack.pop() != '[') {
                            return false;
                        }
                    }   break;
                case '(':
                    validateStack.push('(');
                    break;
                case ')':
                    if (validateStack.empty()) {
                        return false;
                    } else {
                        if ((char) validateStack.pop() != '(') {
                            return false;
                        }
                    }   break;
                default:
                    break;
            }
        }
        return validateStack.empty();
    }
}