//Eunice Chan
//2025-09-08

public class Exercise {
    public static void main(String[] args) {

        //question 1
        int i = 10, j = 3;
        boolean truefalse;
        truefalse = (j>i); //print false as 3 is not greater than 10

        //question 2
        truefalse = (i>j); //print true as 10 is greater than 3

        //question 3
        truefalse = (i==j); //print false as 10 does not equal to 3

        //question 4
        truefalse = ((j<=i) || (j>=i)); //print true as j is greater than i so on of the OR statements are true meaning its true

        //question 5
        truefalse = ((i>j) && (j==0)); //print false as j does not equal to 0 so one of the AND statements are false meaning its false

        //question 6
        truefalse = ((j<50) || (j!=33)); //print true as j does not equal 33 and is less than 50

        //question 7
        truefalse = (!(j>=0) || (i<=50)); //print true as i=10 is less than 50 

        //question 8
        truefalse = (!(!(!true))); //print false as not not not true is simplified to not true which is false

        //question 9
        truefalse = (5<=5); //print true as 5 equals 5

        //question 10
        truefalse = (j!=i); //print true as 3 does not equal 10

        //question 11
        int m = 40;
        boolean b = m<=44;
        System.out.println(b); //print out true as a has to be less than or equal to 44 and 40 is less than 44

        //question 12
        int r = 18;
        boolean bb = r<17;
        System.out.println(bb); //print out false as 18 is not less than 17

        //question 13
        boolean a = !((2>3) || (5==5) && (7>1) && (4<15) || (35<=36) && (89!=34)); //false as one of the AND statements is true so the OR statement is true but there's a negation operator meaning not true
        System.out.println(a);

        //question 14
        String s1 = "school BUS";
        if (s1.equals("school bus")) {
          System.out.println("Equal");
        }
        else {
          System.out.println("Not Equal"); //print out not equal as bus is capitalized and the if statement accounts for capitalized letters
        }

        //question 15
        String s2 = "school BUS";
        if (s2.equalsIgnoreCase("school bus")) {
          System.out.println("Equal");
        }
        else {
          System.out.println("Not Equal"); //print out equal as the if statements ignores capital or lower case letters
        }

        //question 16
        int jj = 19, n = 200;
        if (jj==18) {
          n++;
          jj++;
          System.out.println(n);
          System.out.println(jj); //print out nothing as 19 doesn't equal 18 so the if statement has no effect
        }

        //question 17
        int g = 33;
        boolean ba = g==34;
        System.out.println(ba); //print out false as 33 does not equal 34

        //question 18 
        int k = 4;
        boolean bc = (k%2==0);
        System.out.println(bc); //print out true as remainder of 4/2 is 0

        //question 19
        String pw = "Xray";
        if (pw == "XRAY") {
          System.out.println("Password entered successfully.");
        }
        else {
          System.out.println("Incorrect password."); //print out incorrect password as Xray doesn't have the correct capitalization and the condition accounts for casing
        }
        
        //question 20
        int x = 79;
        if (x>50) {
          if (x<60) {
            System.out.println("One");
          }
          else {
            System.out.println("Two"); //print out two as 79 is greater than 50 and not less than 60
          }
        }
        else {
          if (x>30) {
            System.out.println("Three");
          }
          else {
            System.out.println("Four");
          }
        }
    }
}