/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clasehilos;

/**
 *
 * @author Erick Rodriguez Chávez <necrobhyangel@gmail.com>
 */
public class MiHilo extends NoHaceNada implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread());
        
        
    }
    
}
