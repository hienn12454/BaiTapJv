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
public class Counter {
    private static int count;

    public Counter() {
        count++;
    }

public static int getCount(){
    return count;
}
    
}