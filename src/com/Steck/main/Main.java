package com.Steck.main;

public class Main {
    public static void main(String args []){
        Steck B=new Steck(2);//тестирование конструктора с объектом
        B.pechat();
        B.Add(4);//тестирование добавления
        B.pechat();
        B.extract();
        B.pechat();
        System.out.println(B.pustota());
        B.extract();
        System.out.println(B.pustota());
        B.extract();//ошибка данных
        System.out.println(B.pustota());
    }
}
