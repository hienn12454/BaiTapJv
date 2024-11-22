/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticmemberbt;

/**
 *
 * @author TUF
 */
public class Intializer {
    static int intialValue;
    static{
        intialValue = 1000;
        System.out.println("Static block: intialValue intialuzed to " + intialValue);
    }
}
