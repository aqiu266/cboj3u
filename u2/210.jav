import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    
    while (true) {
      String input = inp.nextLine();
      String[] exp = input.split(" ");
      
      if (exp.length == 1) {
        if (input.equals("0")) {
          break;
        } else {
          System.out.println(input);
        }
      } else {
        String translate = "";
        Stack<String[]> stack = new Stack<>();
        boolean flag = false;
        int i = 0;
        
        while (i < exp.length) {
          if (flag) {
            String[] temp0 = stack.pop();

            if (temp0[1].equals("2")) {
              translate += " " + temp0[0];

              if (stack.size() == 0) {
                flag = false;
                i += 1;
              } else {
                String[] temp3 = stack.pop();
                temp3[1] = Integer.toString(Integer.parseInt(temp3[1]) + 1);
                stack.push(temp3);
              }
              
              continue;
            } else {
              stack.push(temp0);
              flag = false;
              i += 1;
            }
          } else {
            if (exp[i].equals("+") || exp[i].equals("-")) {
              String[] pair = {exp[i], "0"};
              stack.push(pair);
              i += 1;
            } else {
              String[] temp = stack.pop();
              temp[1] = Integer.toString(Integer.parseInt(temp[1]) + 1);
              translate += " " + exp[i];

              if (temp[1].equals("2")) {
                translate += " " + temp[0];

                if (stack.size() > 0) {
                  String[] temp2 = stack.pop();
                  temp2[1] = Integer.toString(Integer.parseInt(temp2[1]) + 1);
                  stack.push(temp2);
                  flag = true;
                } else {
                  i += 1;
                }
              } else {
                stack.push(temp);
                i += 1;
              }
            }
          }
        }
        System.out.println(translate.substring(1));
      }
    }
  }
}