package com.softserve.homework7;


import com.softserve.homework6.Figure;
import com.softserve.homework6.Rectangle;
import com.softserve.homework6.Square;

/*

Homework 7 (from 01.06.2021)
++ Взяти за основу класи з попереднього завдання, внести зміни.
++ Інтерфейс Figure повинен наслідувати інтерфейс Comparable<Figure> та містити декларацію методу обчислення периметра.
++   Класи Rectangle та Square наслідують інтерфейс Figure та реалізовують методи обчислення периметра та compareTo(Figure other).
   Метод compareTo(Figure other) повинен звертатися до методу обчислення периметра.
   Задати масив, який містить об'єкти Rectangle та Square (достатньо 5-6 елементів).
   Вияснити, чи фігури посортовані по зростанню.
Для коду використати пакет com.softserve.homework7
Запушати код на github у свою вітку.


*/
public class Appl7 {

    public static void main(String[] args) {
        Figure[] figures = {
                new Rectangle(3,7),
                new Rectangle(4, 8),
                new Square(7.0),
                new Square(8),
                new Square(9),
        };
        String isSorted = "Yes!";
        for (int i = 0; i < figures.length - 1; i++) {
            int perimeter = figures[i].compareTo(figures[i + 1]);
            if (perimeter > 0) {
                isSorted="No!";
            }
        }
        System.out.println("Figures sorted by its perimeter in Asc order? - " + isSorted);


        for (int i = 0; i < figures.length; i++) {
            System.out.print("\nFigure " + (i + 1) + " is " + figures[i] +   ".  Its perimeter is " +  figures[i].getPerimeter());
        }
    }

}
