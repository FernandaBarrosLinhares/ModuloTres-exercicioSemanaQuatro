package org.example.Exercicio4;

public class Pato implements Animal, Ave{
    @Override
    public void comer() {
        System.out.println("Pato comendo");
    }

    @Override
    public void dormir() {
        System.out.println("Pato dormindo");
    }

    @Override
    public void voar() {
        System.out.println("Pato voando");
    }
}
