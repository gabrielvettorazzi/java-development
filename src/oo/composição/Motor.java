package oo.composição;

public class Motor {

    boolean ligado = false;
    double fatorIngeção = 1;

    int giros() {
        if (!ligado) {
            return 0;
        } else {
            return (int) Math.round(fatorIngeção * 3000);
        }
    }
}

