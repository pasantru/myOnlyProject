  import java.util.Scanner;

  /**
   * Created by Pablo Sanchez on 14/11/2016.
   * Modified by Antonio Ruiz de la Torre on 25/11/2016.
   */

  public class Comparison {
      //@param -- Strign que se usa en la comparacion
      private String selec;

      public Comparison(){
          selec = "";
      }

      public Comparison(String selec){
          this.selec = selec;
      }

      public void rec(){
        try{
          System.out.printf("%s ", "Enter the calculation(Type help for advice):");
          Scanner sc = new Scanner(System.in);
          selec = sc.nextLine();
          if(selec.equals("help")) {
              System.out.println("Stuck hey ^^, type the following commands: \n\t-fib: Fibonacci sequence. \n\t-fact: Factorial. \n\t-hanoi: for hanoi towers. \n\t-calendar: To set up a calendar for your week studies. \n\t-Enjoy");
              System.out.printf("%s ", "Enter the calculation:");
              selec = sc.nextLine();
          }
          switch(selec){

            case "fib":     System.out.print("Type the numbers you require of the fibonacci sequence:");
                            int n1 = sc.nextInt();
                            fibonacci fib = new fibonacci();
                            int[] fibo = new int[n1+1];
                            for(int i = 0; i <= n1; i++) {
                                fibo[i] = fib.fibonacci(i);
                            }
                            for (int s: fibo) {
                              System.out.printf(" " + s);
                            }
                            System.out.printf("\n");
                            break;
            case "fact":    System.out.printf("%s ", "Type the number to calculate the factorial:");
                            int n2 = sc.nextInt();
                            factorial fact = new factorial();
                            System.out.println(fact.factorial(n2));
                            System.out.printf("\n");
                            break;
            case "hanoi":   System.out.printf("%s ", "Type the number of disks:");
                            int num = sc.nextInt();
                            System.out.printf("%s ", "Type the name of pile1:");
                            String p1 = sc.next();
                            System.out.printf("%s ", "Type the name of pile2:");
                            String p2 = sc.next();
                            System.out.printf("%s ", "Type the number of pile3:");
                            String p3 = sc.next();
                            hanoi na = new hanoi();
                            na.hanoi(num,p1,p2,p3);
                            break;
            case "calendar":System.out.printf("%s ", "Type the number of days for the calendar:");
                            int n4 = sc.nextInt();
                            System.out.printf("%s ", "Type the number of subjects for the calendar:");
                            int n5 = sc.nextInt();
                            System.out.printf("%s ", "Type the subjects separated by \";\":");
                            String n6 = sc.next();
                            Calendar cal = new Calendar(n4,n5,n6);
                            cal.printTable();
                            break;
            default:        System.out.printf("%s ", "WRONG VALUE","\n");
                            break;
          }

        }catch(IllegalArgumentException e){
            e.getMessage();
        }
      }
  }
