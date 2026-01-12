package CoreProgramming.ProgrammingElements.level1;

import java.util.Scanner;

public class SumNaturalWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a Natural Number");
            return;
        }

        int sumWhile = 0;
        int i = 1;

        while (i <= n) {
            sumWhile += i;
            i++;
        }

        int sumFormula = n * (n + 1) / 2;

        System.out.println("While loop sum = " + sumWhile);
        System.out.println("Formula sum = " + sumFormula);

        if (sumWhile == sumFormula)
            System.out.println("Both results are correct");
        else
            System.out.println("Results do not match");
    }
}

