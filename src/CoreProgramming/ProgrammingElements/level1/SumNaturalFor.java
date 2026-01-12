package CoreProgramming.ProgrammingElements.level1;

import java.util.Scanner;

public class SumNaturalFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a Natural Number");
            return;
        }

        int sumFor = 0;

        for (int i = 1; i <= n; i++) {
            sumFor += i;
        }

        int sumFormula = n * (n + 1) / 2;

        System.out.println("For loop sum = " + sumFor);
        System.out.println("Formula sum = " + sumFormula);

        if (sumFor == sumFormula)
            System.out.println("Both results are correct");
        else
            System.out.println("Results do not match");
    }
}
