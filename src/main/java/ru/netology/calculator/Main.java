package ru.netology.calculator;

public class Main {
    public static void main(String[] args) {


        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(8, 6);
        int b = calc.minus.apply(11, 3); // при равенстве аргументов, b принимает значение "0"
        int c = calc.devide.apply(a, b); // При делении на "0" выбрасывает исключение


        calc.println.accept(c);
    }
}