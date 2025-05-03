//////////////////////////////////////////////////////////////////// 
// [Tommaso] [Ceron] [2101045] 
// [Dennis] [Parolin] [2113203] 
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RomanPrinterTest {
    @Test
    public void shouldPrint1(){
        int number =1;
        String result=RomanPrinter.print(number);
        assertEquals("  _____ \n |_   _|\n   | |  \n   | |  \n  _| |_ \n |_____|\n", result);        
    }

    @Test
    public void shouldPrint2(){
        int number =2;
        String result=RomanPrinter.print(number);
        assertEquals("  _____   _____ \n |_   _| |_   _|\n   | |     | |  \n   | |     | |  \n  _| |_   _| |_ \n |_____| |_____|\n", result);
        
    }

    @Test
    public void shouldPrint3(){
        int number =3;
        String result=RomanPrinter.print(number);
        assertEquals("  _____   _____   _____ \n |_   _| |_   _| |_   _|\n   | |     | |     | |  \n   | |     | |     | |  \n  _| |_   _| |_   _| |_ \n |_____| |_____| |_____|\n", result);
        
    }

    @Test
    public void shouldPrint4(){
        int number =4;
        String result=RomanPrinter.print(number);
        assertEquals("  _____  __      __\n |_   _| \\ \\    / /\n   | |    \\ \\  / / \n   | |     \\ \\/ /  \n  _| |_     \\  /   \n |_____|     \\/    \n", result);
        
    }

    @Test
    public void shouldPrint5(){
        int number =5;
        String result=RomanPrinter.print(number);
        assertEquals(" __      __\n \\ \\    / /\n  \\ \\  / / \n   \\ \\/ /  \n    \\  /   \n     \\/    \n", result);
        
    }

    @Test
    public void shouldPrint6(){
        int number =6;
        String result=RomanPrinter.print(number);
        assertEquals(" __      __  _____ \n \\ \\    / / |_   _|\n  \\ \\  / /    | |  \n   \\ \\/ /     | |  \n    \\  /     _| |_ \n     \\/     |_____|\n", result);
        
    }

    @Test
    public void shouldPrint7(){
        int number =7;
        String result=RomanPrinter.print(number);
        assertEquals(" __      __  _____   _____ \n \\ \\    / / |_   _| |_   _|\n  \\ \\  / /    | |     | |  \n   \\ \\/ /     | |     | |  \n    \\  /     _| |_   _| |_ \n     \\/     |_____| |_____|\n", result);
        
    }

    @Test
    public void shouldPrint8(){
        int number =8;
        String result=RomanPrinter.print(number);
        assertEquals(" __      __  _____   _____   _____ \n \\ \\    / / |_   _| |_   _| |_   _|\n  \\ \\  / /    | |     | |     | |  \n   \\ \\/ /     | |     | |     | |  \n    \\  /     _| |_   _| |_   _| |_ \n     \\/     |_____| |_____| |_____|\n", result);
        
    }

    @Test
    public void shouldPrint9(){
        int number =9;
        String result=RomanPrinter.print(number);
        assertEquals("  _____  __   __\n |_   _| \\ \\ / /\n   | |    \\ V / \n   | |     > <  \n  _| |_   / . \\ \n |_____| /_/ \\_\\\n", result);
        
    }

    @Test
    public void shouldPrint10(){
        int number =10;
        String result=RomanPrinter.print(number);
        assertEquals(" __   __\n \\ \\ / /\n  \\ V / \n   > <  \n  / . \\ \n /_/ \\_\\\n", result);
        
    }
}
