package Book;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pilih \n 1.Textbook \n 2. Novel");
        System.out.println("==========================");
        System.out.println("   MAU PILIH YANG MANA?   ");
        System.out.println("==========================");
        int pilih = sc.nextInt();
        sc.nextLine();
        if (pilih == 1) {
            System.out.println("Tittle: ");
            String title = sc.nextLine();
            System.out.println("Year:");
            int year = sc.nextInt();
            System.out.println("Price:");
            double price = sc.nextDouble();
            System.out.println("Subject:");
            String subject = sc.next();
            TextBook tb1 = new TextBook(title, year, price, subject);
            tb1.print();
            System.out.println("Tambah Biography? (1. Ya, 2. Tidak) ");
            int pilih2 = sc.nextInt();
            sc.nextLine();

            switch (pilih2) {
                case 1:
                    System.out.println("About: ");
                    String about = sc.next();
                    Biography b1 = new Biography(title, year, price, about, subject);
                    b1.print();
                    break;

                case 2:
                    System.out.println("Tidak mau menambahkan Biography");
                    break;

                default:
                    System.out.println("Tidak ada pilihan");
                    break;
            }
        } else if (pilih == 2) {
            System.out.println("Genre: ");
            String genre = sc.nextLine();
            System.out.println("Tittle: ");
            String title = sc.nextLine();
            System.out.println("Year:");
            int year = sc.nextInt();
            System.out.println("Price:");
            double price = sc.nextDouble();
            sc.nextLine();
            
            Novel n1 = new Novel(title, year, price,genre);
            n1.print();
        } else {
            System.out.println("Tidak ada pilihan");
        }
        sc.close();
    }
}