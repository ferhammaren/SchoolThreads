/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clasehilos;

/**
 *
 * @author Erick Rodriguez Chávez <necrobhyangel@gmail.com>
 */
public class Ejemplo_1_Hilos {
    public static void main(String[] args) {
        Thread hiloA = new Thread(new MiHilo(),"hiloA");
        Thread  hiloB = new Thread(new MiHilo(),"hiloB");
        

        hiloA.start();
    hiloB.start();
    
    try{
        Thread.sleep(1000);
    }catch(InterruptedException e){}
    
    
        System.out.println(Thread.currentThread());    

        
    
        hiloA.stop();
        hiloB.stop();
        
    }
        
    }

