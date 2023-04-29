package dort_nisan.c_example;

public class Die {

    //sadece bu class içinde kullanılacak değişkenler private olmalı.
    private final int Max=6;
    private int faceValue;

//constructor. 1 classtan obje üretildiğinde ilk nasıl çalışacağını belirtir.
    public Die(){
        faceValue=1;
    }

    public int roll(){
        faceValue=(int)(Math.random()*Max)+1;
        
        return faceValue;
    }

    public void setFaceValue(int value){
        faceValue=value;
    }

    public int getFaceValue(){
        return faceValue;
    }

    public String toString(){
        String result=Integer.toString(faceValue);

        return result;
    }
       
}