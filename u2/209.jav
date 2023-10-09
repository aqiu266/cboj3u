import java.io.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int a = inp.nextInt(), b = inp.nextInt(), c = inp.nextInt();
    int vmon = 0, cmon = 1;
    // cmon: coefficient monomial factor
    // vmon: variable monomial factor
    
    if (c == 0) {
      vmon = 1;
      
      for (int i = 1; i < Math.abs(Math.min(a, b)) + 1; i++) {
        if (a % i == 0 && b % i == 0) {
          cmon = i;
        }
      } 
    } else {
      if (b == 0) {
        for (int i = 1; i < Math.abs(Math.min(a, c)) + 1; i++) {
          if (a % i == 0 && c % i == 0) {
            cmon = i;
          }
        }
      } else {
        for (int i = 1; i < Math.abs(Math.min(Math.min(a, b), c)) + 1; i++) {
          if (a % i == 0 && b % i == 0 && c % i == 0) {
            cmon = i;
          }
        }
      }
    }

    if (a < 0) {
      cmon = cmon * -1;
    }
    
    a = a / cmon;
    b = b / cmon;
    c = c / cmon;
    int coef1 = 0, coef2 = 0, cons1 = 0, cons2 = 0;
    
    // coef = coefficient of variable in each binomial
    // cons = the corresponding constant of each binomial
    
    if (b != 0 && c != 0) {
      if (a == 1) {
        coef1 = 1;
        coef2 = 1;
        
        if (c > 0) {
          if (b > 0) {
            for (int i = 1; i < c + 1; i++) {
              if (i * (b - i) == c) {
                cons1 = i;
                cons2 = b - i;
                break;
              }
            }
          } else {
            for (int i = 1; i < c + 1; i++) {
              if (-1 * i * (b + i) == c) {
                cons1 = -1 * i;
                cons2 = b + i;
                break;
              }
            }
          }
        } else {
          for (int i = 1; i < Math.abs(c) + 1; i++) {
            if (i * (b - i) == c) {
              cons1 = i;
              cons2 = b - i;
              break;
            }
          }
        }
      } else if (c > 0 && b < 0) {
        for (int i = 1; i < Math.abs(a) + 1; i++) {
          if (a % i == 0) {
            boolean flag = false;
            
            for (int j = 1; j < Math.abs(c) + 1; j++) {
              if (c % j == 0) {
                if (((i * c)/j) + ((a * j)/i) == -1 * b) {
                  coef1 = i;
                  coef2 = a / i;
                  cons1 = -1 * j;
                  cons2 = -1 * c / j;
                  flag = true;
                  break;
                }
              }
            }

            if (flag == true) {
              break;
            }
          }
        }
      } else {
        for (int i = 1; i < Math.abs(a) + 1; i++) {
          if (a % i == 0) {
            boolean flag = false;
            
            for (int j = 1; j < Math.abs(c) + 1; j++) {
              if (c % j == 0) {
                if (((i * c)/j) + ((a * j)/i) == b) {
                  coef1 = i;
                  coef2 = a / i;
                  cons1 = j;
                  cons2 = c / j;
                  flag = true;
                  break;
                }
              }
            }

            if (flag == true) {
              break;
            }
          }
        }
      }
    } else if (b == 0) {
      if (a == Math.floor(Math.sqrt(a)) * Math.floor(Math.sqrt(a)) && (-1 * c) == Math.floor(Math.sqrt(-1 * c)) * Math.floor(Math.sqrt(-1 * c))) {
        coef1 = (int) Math.floor(Math.sqrt(a));
        cons1 = (int) Math.floor(Math.sqrt(-1 * c));
      }
    }

    String output = "";

    if (Math.abs(cmon) != 1) {
      output += cmon;
    } else if (cmon == -1) {
      output += "-";
    }

    if (vmon == 1) {
      if (a == 1) {
        output += "x(x";
      } else {
        output += "x(" + a + "x";
      }
      
      if (b < 0) {
        output += b + ")";
      } else {
        output += "+" + b + ")";
      }
    } else if (b == 0) {
      if (coef1 == 1) {
        output += "(x+" + cons1 + ")(x-" + cons1 +")";
      } else {
        output += "(" + coef1 + "x+" + cons1 + ")(" + coef1 + "x-" + cons1 + ")";
      }
    } else {
      if (((-1 * cons1) / coef1) < ((-1 * cons2) / coef2)) {
        if (coef1 == 1) {
          output += "(x";
        } else {
          output += "(" + coef1 + "x";
        }
      
        if (cons1 < 0) {
          output += "-" + Math.abs(cons1) + ")(";
        } else {
          output += "+" + cons1 + ")(";
        }

        if (coef2 == 1) {
          output += "x";
        } else {
          output += coef2 + "x";
        }
      
        if (cons2 < 0) {
          output += "-" + Math.abs(cons2) + ")";
        } else {
          output += "+" + cons2 + ")";
        }
      } else {
        if (coef2 == 1) {
          output += "(x";
        } else {
          output += "(" + coef2 + "x";
        }
      
        if (cons2 < 0) {
          output += "-" + Math.abs(cons2) + ")(";
        } else {
          output += "+" + cons2 + ")(";
        }

        if (coef1 == 1) {
          output += "x";
        } else {
          output += coef1 + "x";
        }
      
        if (cons1 < 0) {
          output += "-" + Math.abs(cons1) + ")";
        } else {
          output += "+" + cons1 + ")";
        }
      }
    }
    
    System.out.println(output);
  }
}