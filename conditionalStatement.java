import java.util.*;
public class conditionalStatement {
    public static void main(String[] args) {
        int age  = 15;
        if (age>=18){
            System.out.println("Adult");
        }

        else if (age>=13 && age<18){
            System.out.println("Teenager");
        }

        else{
            System.out.println("Child");
        }

        // Ternary operator

        // syntax --> variable = condition ? statement1 : statement2
        // if condition is true statment1 will be executed, otherwise statement2 will be executed

        String type = (age % 2 == 0) ? "Even" : "Odd";
        System.out.println(type);
    }
}
