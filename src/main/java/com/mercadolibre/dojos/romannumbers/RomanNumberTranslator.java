package com.mercadolibre.dojos.romannumbers;

public class RomanNumberTranslator {

    private int data;
    private String result = "";

    public String translate(int data) {
        this.data = data;

        this.getResult(10, "X");
        this.getResult(9, "IX");
        this.getResult(5, "V");
        this.getResult(4, "IV");

        if(this.data <= 3){
            for(int i=0;i<this.data;i++){
                this.result += "I";
            }
        }

        return this.result;
    }

    public void getResult(int num , String roman){
        if(this.data >= num){
            this.result += roman;
            this.data -= num;
        }
    }
}
