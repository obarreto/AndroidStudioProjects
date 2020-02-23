package com.example.appsoma;

public class Operacoes {

    private float a;
    private float b;

    //Metodo construtor Operacao
    public Operacoes(float a, float b){
        this.a = a;
        this.b = b;
    }

    public float somar(){
        return a + b;
    }

    public float subtrair(){
        return a - b;
    }

    public float multiplicar(){
        return a * b;
    }

    public float dividir(){
        return a / b;
    }
}

