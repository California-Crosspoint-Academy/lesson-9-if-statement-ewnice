//Eunice Chan
//2025-09-05

public class Notes {
    public static void main(String[] args) {
        
        int score = 92;
        if (score>=90) {
            System.out.println("Congrats!");
        }
        else {
            System.out.println("It's okay...");
        }
        
        int d = 32;
        if (d==30) {
            System.out.println(++d);
        }
        else {
            System.out.println(--d);
        }

        int grade = 54;
        if (grade>=90) {
            System.out.println("You received an A.");
        }
        else if (grade>=80) {
            System.out.println("You received a B.");
        }
        else if (grade>=70) {
            System.out.println("You received a C");
        }
        else if (grade>=60) {
            System.out.println("You received a D");
        }
        else {
            System.out.println("You failed.");
        }
    }   
}