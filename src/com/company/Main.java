package com.company;
public class Main {

    public static void main(String[] args) {
        int a;
        System.out.print("Пытаемся поделить на нуль...\n\n");
        try{
            a=100/0;
        }
        catch(ArithmeticException e){
            System.out.print("Обнаружена ошибка:\n");
            System.out.print(e.toString());
        }
        finally{
            System.out.print("\n\nНаводим порядок перед завершением программы...");
        }
    }
}
