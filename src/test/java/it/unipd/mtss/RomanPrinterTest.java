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
        assertEquals("  _____ \n |_   _|\n   | |  \n   | |  \n  _| |_ \n |_____|\n", RomanPrinter.print(1));
        assertEquals("  _____   _____ \n |_   _| |_   _|\n   | |     | |  \n   | |     | |  \n  _| |_   _| |_ \n |_____| |_____|\n", RomanPrinter.print(2));
        assertEquals("  _____   _____   _____ \n |_   _| |_   _| |_   _|\n   | |     | |     | |  \n   | |     | |     | |  \n  _| |_   _| |_   _| |_ \n |_____| |_____| |_____|\n", RomanPrinter.print(3));
    }
}
