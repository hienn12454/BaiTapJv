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
public class Configuration {
    public static String configValue;
    static {
        configValue = "Default config value";
        System.out.println("Config Value");
    }
}
