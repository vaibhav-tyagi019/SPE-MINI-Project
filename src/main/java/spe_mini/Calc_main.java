package spe_mini;

import java.util.*;
import java.lang.Math;


import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;



public class Calc_main {

    private static final Logger logger = LogManager.getLogger(Calc_main.class);



    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        while(true)
        {
            System.out.println("SPE Mini-Project Calculator");
            System.out.println("Enter your choice");
            System.out.println("1- To find Factorial");
            System.out.println("2- To find Square Root");
            System.out.println("3- To find x to the power y");
            System.out.println("4- To find Log to the base e");
            System.out.println("Press any other key to exit calculator");

            int choice =Integer.parseInt(sc.nextLine());

            switch (choice)
            {
                case 1: {
                    System.out.println("Enter no to find Factorial");
                    int n = Integer.parseInt(sc.nextLine());
                    double ans=factorial(n);
                    if(ans<0)
                        System.out.println("not possible");
                    else
                        System.out.println("Factorial of " + n + " is : " + ans);
                }
                break;

                case 2:
                {
                    System.out.println("Enter no to find Square root");
                    double n = Double.parseDouble(sc.nextLine());
                    double ans=squareRoot(n);
                    if(ans<0)
                        System.out.println("not possible");
                    else
                        System.out.println("Square root of " + n + " is : " + ans);
                }
                break;

                case 3: {
                    System.out.println("Enter value for x");
                    double x = Double.parseDouble(sc.nextLine());

                    System.out.println("Enter value for y");
                    double y = Double.parseDouble(sc.nextLine());


                    double ans = power(x, y);
                    System.out.println("x to the power y is : "+ans);
                }
                break;

                case 4: {
                    System.out.println("Enter value of no");
                    double n = Double.parseDouble(sc.nextLine());
                    double ans=n_log(n);

                    if(ans<0)
                        System.out.println("not possible");
                    else
                        System.out.println("Natural log of n is : "+ans);
                }
                break;

                default: {
                    logger.info("Calculator closing...");
                    return;
                }



            }
        }
    }

    public static double factorial(int n)
    {
        logger.info("Factorial called for : "+ n);
        if (n < 0) {

            logger.info("ans : "+ "not possible");
            return -1;
        }

        double ans = 1;
        for (int i = 2; i <= n; i++)
            ans *= i;

        logger.info("ans: "+ ans);
        return ans;


    }

    public static double squareRoot(double n)
    {
        logger.info("Square Root called for -"+ n);



        if (n < 0) {

            logger.info("ans: "+"not possible");
            return -1;
        }

        double ans = Math.sqrt(n);

        logger.info("ans: "+ ans);
        return  ans;



    }

    public static double power(double x,double y)
    {
        logger.info("Power called for : "+ x+" and "+y);





        double ans = Math.pow(x,y);

        logger.info("ans: "+ ans);
        return ans;



    }

    public static double n_log(double n)
    {
        logger.info("Natural log called for : "+ n);



        if (n < 0) {

            logger.info("ans: "+"not possible");
            return -1;
        }

        double ans = Math.log(n);

        logger.info("ans: "+ ans);
        return ans;



    }



}


