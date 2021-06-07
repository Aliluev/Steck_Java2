package com.Steck.main;

public class Steck {
    int razmer;
    int []massiv;
    int vershina;
    // ДОБАВЛЕНИЕ, ИЗВЛЕЧЕНИЕ, ЧТЕНИЕ, ПОЛНОТА СТЕКА, ПУСТ СТЕК
    //      +          +           +                      +
    //конструктор по умолчанию//
    public Steck(){
        razmer=1;
        int []massiv=new int[1];
        vershina=0;
        massiv[vershina]=0;
    }
    //конструктор с передаваемым объектом
    public Steck(int a) {
        if(razmer==0) {
            razmer=1;
            vershina=0;
            massiv=new int[razmer];
            massiv[vershina]=a;
        }else {
            int[] vremenniy = new int[razmer];
            int l = 0;//счётчик
            for (int k : massiv) {
                vremenniy[0 + l] = k;
                l++;
            }
            razmer += 1;
            vershina += 1;
            massiv = new int[razmer];
            int g = 0;//счётчик
            for (int j : vremenniy) {
                massiv[0 + g] = j;
                g++;
            }
            massiv[vershina]=a;
        }
    }

    public void Add(int h){
        int[] vremenniy = new int[razmer];
        int l = 0;//счётчик
        for (int k : massiv) {
            vremenniy[0 + l] = k;
            l++;
        }
        razmer += 1;
        vershina += 1;
        massiv = new int[razmer];
        int g = 0;//счётчик
        for (int j : vremenniy) {
            massiv[0 + g] = j;
            g++;
        }
        massiv[vershina]=h;
    }

    public void pechat(){
        for(int i=0;i<razmer;i++) {
            System.out.println(massiv[i]);
        }
    }
    //Извлечь с вершины стека
    public void extract(){
        if(this.pustota()==false) {
            massiv[vershina] = 0;
            vershina -= 1;
            razmer -= 1;
        }else {
            System.out.println("Ошибка данных");// пока не умею исключения делать
        }
    }
    //СТЕК ПУСТ
    public boolean pustota(){
        if(vershina==-1&&razmer==0){
            return true;
        }else return false;
    }

}
