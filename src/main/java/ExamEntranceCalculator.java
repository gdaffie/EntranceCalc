/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author unico
 */
import java.util.Scanner;

public class ExamEntranceCalculator {
    public static final double ASSESSMENT_WEIGHT = 16.66;
    public static final double PASS_MARK = 30.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the name of the module: ");
        String moduleName = scanner.nextLine();

        System.out.print("Please enter the mark for Formative Assessment 1 (out of 100): ");
        double fa1Mark = scanner.nextDouble();

        System.out.print("Please enter the mark for Formative Assessment 2 (out of 100): ");
        double fa2Mark = scanner.nextDouble();

        System.out.print("Please enter the mark for Formative Assessment 3 (out of 100): ");
        double fa3Mark = scanner.nextDouble();

        double fa1Weight = fa1Mark / 100 * ASSESSMENT_WEIGHT;
        double fa2Weight = fa2Mark / 100 * ASSESSMENT_WEIGHT;
        double fa3Weight = fa3Mark / 100 * ASSESSMENT_WEIGHT;

        double finalMark = fa1Weight + fa2Weight + fa3Weight;

        System.out.println("Module: " + moduleName);
        System.out.println("Formative Assessment 1: " + fa1Mark + "%");
        System.out.println("Formative Assessment 2: " + fa2Mark + "%");
        System.out.println("Formative Assessment 3: " + fa3Mark + "%");
        System.out.println("Semester Mark: " + finalMark + "%");

        if (finalMark >= PASS_MARK) {
            System.out.println("Congratulations, you have qualified to write the exam!");
        } else {
            System.out.println("You did not meet the qualifying criteria. You have failed your module.");
        }
    }
}
