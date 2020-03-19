package com.example.appsoma;

public class Operacoes {

    private float psCpsl;
    private float cpSlH;
    private float cpSLS;
    private float ma;
    private float ms;
    public float h;
    public float fc;

    //Metodo construtor Operacao
    public Operacoes(float pesoCapsula, float capsulaSlHumid, float capsulaSlSeco){
        this.psCpsl = pesoCapsula;
        this.cpSlH = capsulaSlHumid;
        this.cpSLS = capsulaSlSeco;
        /*this.ma;//= pesoAgua;
        this.ms;//= soloSeco;
        this.h;//= humidade;
        this.fc;//= fatorConversao;*/
    }

    public float somar(){
        ma = cpSlH - cpSLS;
        ms = cpSLS - psCpsl;
        h = 100 * ma / ms;
        return h;
    }

   public float subtrair(){

        fc = 100 / (100 + h);

        return fc;
    }
    /*
    public float multiplicar(){
        return a * b;
    }

    public float dividir(){
        return a / b;
    }*/
}

