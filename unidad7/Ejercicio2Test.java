package unidad7;
import unidad7.Ejercicio2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test {
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
