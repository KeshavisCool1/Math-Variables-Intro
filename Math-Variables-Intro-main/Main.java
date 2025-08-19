class Main {
  public static void main(String[] args) {

    //Use the // to create single line comments to either add info or to take out code for debugging

    System.out.println("Hello world!");

    //We will be using System.out.println and System.out.print throughout the year. Try using both below to see what the difference is!

    System.out.println("hello my favorite number is : " + 345  );
    System.out.println("hello my favorite number is : " + 345  );




    //ANSWER: 



    //Throughout the year this year we will need to store information. For that we will be using VARIABLES!

    //Java is an Object-Oriented programming language. All variables we use this year will either be OBJECTS or PRIMITIVES

    //There are 8 primitives in Java: int, byte, short, long, float, double, boolean, char

    //For AP we need to know: int, double, boolean

    //List examples of the types below and give definition
    //int (integer): 12,1234,-2
    //double:23.2
    //boolean:True,False

    //For now we are just going to work with primitive

    //Create 3 variables of each of the above types (USE GOOD CODING PRACTICE WHEN CREATING THE VARIABLES
    int num = 34;
    boolean Birthday = false;
    boolean Computer = true;
    boolean Phone = true;
    int num_1 =1;
    int num_2 = 2;
    double ratio_car = 0.3;
    double b_s_r = 0.7;



    


    //MATH TIME!

    //What are the math operators that we can use?
    //+ - * / %

    //Try doing some math operations with numbers. How can we check to see if the math worked?

    int num_3 = 3/5 + 4;
    System.out.println(num_3);
    double num_4 = 3.57/5.4 + 4;
    System.out.println(num_4);
    

    //Create codes that will print the following:

    //Odd integers from 1 to 100, inclusive of both

    for (int start = 1; start < 101 ; start ++) {
        // Code to be executed in eac iteration
        if (start % 2 == 1){
          System.out.println(start);
        }
    }

    //All multiples of 3 from 1 to 100

    for (int start = 1; start < 101 ; start ++) {
        // Code to be executed in eac iteration
        if (start % 3 == 0){
          System.out.println(start);
        }
    }


    //Starting at 1000, print on the same line (with a - [hypthen] between each) all of the numbers that end in 0 going down to 0
    for (int start = 1000; start > -1 ; start --) {
        // Code to be executed in eac iteration
        if (start % 10 == 0){
          System.out.print(start+", ");
        
        }
    }
  }
}
