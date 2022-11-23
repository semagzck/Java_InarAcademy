package chapters.chapter_12.exercise;

public class Exercise_01Test {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println(
                    "Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }
         test(args[0]);
         test(args[2]);

        int result = 0;

        switch (args[1].charAt(0)) {
                case '+':
                    result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                    break;

                case '-':
                    result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                    break;
                case '*':
                    result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                    break;

                case '/':
                    result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
                    break;

                case '%':
                    result = Integer.parseInt(args[0]) % Integer.parseInt(args[2]);
                    break;
            }

            System.out.println(args[0] + ' ' + args[1]  +  args[2] + "=" + result);
    }
           public static void test(String args){

            if(!(0<Integer.parseInt(args)&&Integer.parseInt(args)<10)){
                System.out.println("Wrong input");

        }
    }


    }

