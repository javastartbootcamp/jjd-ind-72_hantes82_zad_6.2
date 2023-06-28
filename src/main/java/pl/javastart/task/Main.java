package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy: ");
        int size = scan.nextInt();
        Array arr = new Array(size);
        arr.fulfil();
        arr.print();
    }
}
