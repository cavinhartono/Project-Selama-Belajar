package DataStructure.Notation;

import java.util.Stack;

class Notation {
  public int precedence(char ch) {
    switch (ch) {
      case '+':
      case '-':
        return 1;
      case '*':
      case '/':
        return 2;
      case '^':
        return 3;
    }
    return -1; // jika operator tidak jelas
  }

  public String infixToPostfix(String infix) {
    StringBuilder postfix = new StringBuilder();
    Stack<Character> stack = new Stack<>();

    for(char c : infix.toCharArray()) {
      if(Character.isLetterOrDigit(c)) {
        postfix.append(c);
      } else if (c == '(') {
        stack.push(c);
      } else if (c == ')') {
        while(!stack.isEmpty() && stack.peek() != '(') {
          postfix.append(stack.pop());
        }
        stack.pop();
      } else {
        while(!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
          postfix.append(stack.pop());
        }
        stack.push(c);
      }
    }

    while(!stack.isEmpty()) {
      if (stack.peek() == '(') {
        return "Invalid expression";
      }
      postfix.append(stack.pop());
    }

    return postfix.toString();
  }

  public String infixToPrefix(String infix) {
    StringBuilder prefix = new StringBuilder();
    StringBuilder reversedInfix = new StringBuilder(infix).reverse();

    for (int i = 0; i < reversedInfix.length(); i++) { 
      if (reversedInfix.charAt(i) == '(') {
        reversedInfix.setCharAt(i, ')');
      } else if (reversedInfix.charAt(i) == ')') {
        reversedInfix.setCharAt(i, '(');
      }
    }

    prefix.append(new StringBuilder(
                    infixToPostfix(reversedInfix.toString())
                  ).reverse());

    return prefix.toString();
  }
}

public class App {
  public static void main(String[] args) {
    Notation obj = new Notation();
    System.out.println(obj.infixToPostfix("a+b*c-(d/e+f*g)"));
  }
}