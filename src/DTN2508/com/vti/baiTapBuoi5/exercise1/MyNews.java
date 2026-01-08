package DTN2508.com.vti.baiTapBuoi5.exercise1;

import java.util.Scanner;

public class MyNews {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        News news = null;

        while (true) {
            System.out.println("Menu");
            System.out.println("1: Insert news");
            System.out.println("2: View news list");
            System.out.println("3: Average rate");
            System.out.println("4: Exit");
            System.out.println("Choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    news = new News();
                    System.out.print("Enter Title: ");
                    news.setTitle(scanner.nextLine());

                    System.out.print("Enter Publish Date: ");
                    news.setPublishDate(scanner.nextLine());

                    System.out.print("Enter Author: ");
                    news.setAuthor(scanner.nextLine());

                    System.out.print("Enter Content: ");
                    news.setContent(scanner.nextLine());

                    System.out.println("Enter 3 rates:");
                    for (int i = 0; i < 3; i++) {
                        System.out.print("Rate " + (i + 1) + ": ");
                        int rate = scanner.nextInt();
                        news.setRate(i, rate);
                    }
                    scanner.nextLine(); // clear buffer

                    System.out.println("Insert news successfully!");
                    break;
                case 2:
                    if (news != null) {
                        news.display();
                    } else {
                        System.out.println("No news to display!");
                    }
                    break;

                case 3:
                    if (news != null) {
                        news.calculate();
                        news.display();
                    } else {
                        System.out.println("No news to calculate!");
                    }
                    break;

                case 4:
                    System.out.println("Exit program!");
                    scanner.close();
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

    }
}
