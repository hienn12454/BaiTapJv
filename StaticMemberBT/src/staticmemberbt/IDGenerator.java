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
public class IDGenerator {
    private static int nextID = 1;
    public static int generateID(){
        return nextID++;
    }
}
