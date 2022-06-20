package com.diegotorres.introducao.junit5;

import static com.diegotorres.introducao.junit5.MathUtil.mdc;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Diego Torres
 */
public class MathUtilTest {

    @Test
    public void testMdcAParP1() {
        final int a = 4;
        final int b = 2;
        final int esperado = 2;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcAImparP1(){
        final int a = 6;
        final int b = 3;
        final int esperado = 3;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);        
    }
    
    @Test
    void testMdcParesP2(){
        final int a = 16;
        final int b = 8;
        final int divisor = 4;
        final int obtido = MathUtil.mdc(a,b);
        //assertEquals(esperado, obtido % divisor);   
        assertTrue(obtido % divisor == 0);       
        
    }
    @Test
    void testMdcAPositivoP3(){
        final int a = 15;
        final int b = 0;
        final int esperado = 15;
        final int obtido = MathUtil.mdc(a,b);
        assertEquals(esperado, obtido);
    
    
    }
    @Test
    void testMdcANegativoP3(){
        final int a = -30;
        final int b = 0;
        final int esperado = 30;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);        
    }
    @Test
    void testMdcMParP4(){
        final int a = 9;
        final int b = 3;
        final int m = 2;
        final int esperado = MathUtil.mdc(a*m, b*m);
        final int obtido = m* MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);           
                
    }
    
    @Test
    void testMdcP5(){
        // se mdc(a,b) == 1, então mdc(a*b, c) == mdc(b,c)
        final int a = 7;
        final int b = 3;
        final int c = 5;
        final int esperado = mdc(a*b, c);
        final int obtido = mdc(b,c);       
        assertEquals(esperado, obtido);    
    }
    
      @Test
    void testMdcP51(){
        // se mdc(a,b) == 1, então mdc(a*b, c) == mdc(b,c)
        final int a = 7;
        final int b = 3;
        final int c = 5;
        final int esperado = 1;
        final int obtido = mdc(b,c);
        assertEquals(esperado, obtido);
           
    }
    
   @Test
   void testMdcP6(){
       final int a = 18;
       final int b = 4;
       //mdc(a,b) == mdc(b,a)
       final int esperado = mdc (a,b);
       final int obtido = mdc (b,a);
       assertEquals(esperado, obtido);
   }
   
    @Test
   void testMdcTudoNegativoP7(){
       final int a = -12;
       final int b = -6;
       //mdc(a,b) == mdc(b,a)
       final int esperado = 6;
       final int obtido = mdc (a,b);
       assertEquals(esperado, obtido);
   }
   
    @Test
    void testMdcOutroBP1(){
        final int a = 9;
        final int b = -3;
        final int esperado = b;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    void testMdcAZeroP1(){
        final int a = 0;
        final int b = 1;
        final int esperado = b;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    
    
}
