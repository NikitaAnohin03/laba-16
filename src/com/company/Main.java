package com.company;

class Formula {
    int a;
    int b;
    int c;
    Formula(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void displayFormula() {
        double vector = a * Math.pow(b, c);
        System.out.println(vector);
    }
}

class Formula2 {
    int l;
    int m;
    int f;
    Formula2(int l, int m, int f) {
        this.l = l;
        this.m = m;
        this.f = f;
    }
    public void displayFormula() {
        double vector = l * Math.pow(m, f);
        System.out.println(vector);
    }
}
@FunctionalInterface
interface Converter <Formula,Formula2>{
    Formula2 convert(Formula t);
}
public class Main {
    public static void main(String[] args) {
        Formula formula = new Formula(56,12,4);
        Converter con = x -> new Formula2(formula.a, formula.b, formula.c);
        Formula2 form = (Formula2) con.convert(formula);
        form.displayFormula();
    }
}