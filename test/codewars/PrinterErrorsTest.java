package codewars;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrinterErrorsTest {
    @Test
    public void test() {
        System.out.println("printerError Fixed Tests");
        String s="aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
        assertEquals("3/56", PrinterErrors.printerError(s));
    }
}