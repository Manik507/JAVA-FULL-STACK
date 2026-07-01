package com.mycompany.javapractice;

import java.util.*;

public class ArrayListProject {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;
        ArrayList<String> tasks = new ArrayList<>();
        int i;

        while (isRunning) {

            System.out.println("----Menu----");
            System.out.println("---1. Add Task---");
            System.out.println("---2. View Task---");
            System.out.println("---3. Remove Task---");
            System.out.println("---4. Exit---");
            System.out.print("Enter the choice :- ");

            // Validate menu choice
            if (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                sc.nextLine();      // Remove invalid input
                continue;           // Show menu again
            }

            int choice = sc.nextInt();
            sc.nextLine();          // Consume leftover newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Task :- ");
                    String task = sc.nextLine();

                    if (task.isBlank()) {
                        System.out.println("Task Failed to Add");
                    } else {
                        tasks.add(task);
                        System.out.println("Task Added Successfully");
                    }
                    break;

                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available in the list");
                    } else {
                        System.out.println("Your Tasks :-");
                        i = 0;
                        for (String t : tasks) {
                            ++i;
                            System.out.println(i + ". " + t);
                        }
                    }
                    break;

                case 3:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available in the list");
                    } else {

                        System.out.println("Enter the Task Number :-");

                        // Validate task number
                        if (!sc.hasNextInt()) {
                            System.out.println("Please enter a valid task number.");
                            sc.nextLine();      // Remove invalid input
                            break;
                        }

                        int n = sc.nextInt();
                        sc.nextLine();

                        if (n >= 1 && n <= tasks.size()) {
                            tasks.remove(n - 1);
                            System.out.println("Task Deleted Successfully");
                        } else {
                            System.out.println("No Task Present at " + n + " number");
                        }
                    }
                    break;

                case 4:
                    isRunning = false;
                    System.out.println("Exited Successfully :)");
                    break;

                default:
                    System.out.println("Enter a valid option.");
            }
        }

        sc.close();
    }
}