package unidad7;


import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio3Test {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();


    @BeforeEach
    public void setUp(){
        System.setOut(new PrintStream(outputStreamCaptor));}


    @AfterEach
    public void tearDown(){

        System.setOut(standardOut);
    }

      @Test
    void testMain() {
       Ejercicio3.main(new String[1]);
       String salida = outputStreamCaptor.toString();
       assertEquals("el doble de 15 es 30", salida);   //basicamente lo que vimos aca es como capturar la salida de un metodo y ver si el texto es igual al que espero


    }


    @Test
    void testDoble() {
               Integer resutaldo = Ejercicio2.doble(2);
        Assertions.assertEquals(4, resutaldo);


    }

 

   @Test
    void testTriple() {
       Integer resutaldo = Ejercicio2.triple(3);
        Assertions.assertEquals(9, resutaldo);

    }

    
}
