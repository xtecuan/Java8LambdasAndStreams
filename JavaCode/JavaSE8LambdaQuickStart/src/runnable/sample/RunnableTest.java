/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runnable.sample;

/**
 *
 * @author xtecuan
 */
public class RunnableTest {
    public static void main(String[] args) {
        System.out.println("== Runnable Test ==");
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World 1");
            }
        };
        
        Runnable r2 = () -> System.out.println("Hello World 2");
        
        r1.run();
        r2.run();
    }
}
