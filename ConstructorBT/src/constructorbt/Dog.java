/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorbt;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 *
 * @author TUF
 */
public class Dog {
    private String mausac;
    private String name;

    public Dog() {
    }

    public Dog(String mausac, String name) {
        this.mausac = mausac;
        this.name = name;
    }

    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



  
}
