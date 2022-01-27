/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionsj;

/**
 *
 * @author Sanjeev
 */
public class MyException {
    public static void main(String[] args) {
        
        int i=8;
        
        try{
            if(i<10){
                throw new MeException("errore");
                
            }
        }
        catch(MeException e)
                {System.out.println(e);
            
                }}  }
    class MeException extends Exception
    {
        public MeException( String ms)
        {
            super(ms);
        }
    }
