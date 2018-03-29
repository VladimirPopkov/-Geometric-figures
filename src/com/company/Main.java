package com.company;

import com.company.figures.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double sideA;
        double sideB;
        double angleAB;
        double R;

        for (;;) {
            System.out.println("1. Создать точку");
            System.out.println("2. Создать треугольник");
            System.out.println("3. Создать круг");
            System.out.println("4. Создать прямоугольник");
            System.out.println("5. Создать квадрат");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");

            try {
                System.out.println();
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        Point point = new Point();
                        calculation(point);
                        break;
                    case 2:
                        System.out.println("Введите данные: ");
                        System.out.print("Сторона А: ");
                        sideA = scanner.nextDouble();
                        System.out.print("Сторона В: ");
                        sideB = scanner.nextDouble();
                        System.out.print("Угол между сторонами: ");
                        angleAB = scanner.nextDouble();
                        calculation(new Triangle(sideA, sideB, angleAB));
                        break;
                    case 3:
                        System.out.println("Введите данные: ");
                        System.out.print("Радиус: ");
                        R = scanner.nextDouble();
                        calculation(new Circle(R));
                        break;
                    case 4:
                        System.out.println("Введите данные: ");
                        System.out.print("Сторона А: ");
                        sideA = scanner.nextDouble();
                        System.out.print("Сторона В: ");
                        sideB = scanner.nextDouble();
                        calculation(new Rectangle(sideA, sideB));
                        break;
                    case 5:
                        System.out.println("Введите данные: ");
                        System.out.print("Сторона А: ");
                        sideA = scanner.nextDouble();
                        calculation(new Square(sideA));
                        break;
                    case 0:
                        return;
                    default:
                        System.out.println("Действие отсутствует! Попробуйте снова.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели неверное значение! Попробуйте снова.");
                scanner.next();
            }
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println();
        }
    }

    private static void calculation(Point figure){
        System.out.println();
        System.out.println("Расчеты по фигуре: ");
        System.out.println("Площадь: " + figure.getArea());
        System.out.println("Периметр: " + figure.getPerimeter());
        System.out.println("Описание: " + figure.getDescription());
    }
}
