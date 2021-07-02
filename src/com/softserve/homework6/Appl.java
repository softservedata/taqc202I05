package com.softserve.homework6;

/*
        Homework 6 (from 28.05.2021)
        1) Написати інтерфейс Figure із методом обчислення периметру.
        Написати два класи Rectangle та Square, які наслідують та реалізують інтерфейс Figure.
        В методі main класу Appl створити масив, який складається із двох прямокутників та трьох квадратів.
        В циклі вивести периметри фігур.
        Для коду використати пакет com.softserve.homework6
        Запушати код на github у свою вітку.
*/

public class Appl {
    public static void main(String[] args) {
        Figure[] figures = {
                new Rectangle(20.50, 50.20),
                new Rectangle(12.00, 35.10),
                new Square(15.30),
                new Square(25.00),
                new Square(28.20)
        };

        for (int i = 0; i < figures.length; i++) {
            System.out.println("Figure " + (i + 1) + " is " + figures[i] +   ".  Its perimeter is " +  figures[i].getPerimeter());
        }
    }
}

