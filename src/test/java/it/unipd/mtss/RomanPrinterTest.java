//////////////////////////////////////////////////////////////////// 
// [Tommaso] [Ceron] [2101045] 
// [Dennis] [Parolin] [2113203] 
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RomanPrinterTest {
    @Test
    public void testPrint() {
        assertEquals("  __ \n |   |\n   | |  \n   | |  \n  | | \n |__|\n", RomanPrinter.print(1));
        assertEquals("      \n |   | |   |\n   | |     | |  \n   | |     | |  \n  | |   | | \n || ||\n", RomanPrinter.print(2));
        assertEquals("        __ \n |   | |   | |   |\n   | |     | |     | |  \n   | |     | |     | |  \n  | |   | |   | | \n |__| || ||\n", RomanPrinter.print(3));
    }
}