
package com.zeddysoft.netstar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * <u>e-MINPHIS</u><br>
 * A project of the Health Information Systems Unit of the<br>
 * Department of Computer Science and Engineering,<br>
 * Obafemi Awolowo University, Ile-Ife.<br>
 * 
 * 
 * <pre>
 * Class name: PlayClass.java
 * Version: 1.0
 * Author: AZEEZ TAIWO
 * 
 * <u>Description</u>
 * 
 * 
 * </pre>
 * @author AZEEZ TAIWO
 * @version 1.0
 */
public class PlayClass {
    public PlayClass(){
        System.out.println("This constructor was called");
}
    public PlayClass(String x){
        new PlayClass();
        System.out.println(x);
    }
    public static void main(String[] args) {
    PlayClass x=new PlayClass("Shola");
    }
    
}