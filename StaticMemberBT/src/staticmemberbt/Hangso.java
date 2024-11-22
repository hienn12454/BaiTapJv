/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticmemberbt;

import java.util.Scanner;




/**
 *
 * @author TUF
 */
public class Hangso {
    public static double PI = 3.14;
    public static double r;

    public Hangso() {
    }

    public static double getR() {
        return r;
    }

    public static void setR(double r) {
        Hangso.r = 6.0;
    }

    public static double Area(){
        return PI * r * r;
    }
}
