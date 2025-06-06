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
        int number = 10;
        String result=RomanPrinter.print(number);
        assertEquals(" __   __\n \\ \\ / /\n  \\ V / \n   > <  \n  / . \\ \n /_/ \\_\\\n", result);
        
    }

    @Test 
        public void shouldPrint15(){
        int number = 15;
        String result =  RomanPrinter.print(number);
        assertEquals(" __   __ __      __\n \\ \\ / / \\ \\    / /\n  \\ V /   \\ \\  / / \n   > <     \\ \\/ /  \n  / . \\     \\  /   \n /_/ \\_\\     \\/    \n", result);
    }

    @Test 
        public void shouldPrint19(){
        int number = 19;
        String result =  RomanPrinter.print(number);
        assertEquals(" __   __  _____  __   __\n \\ \\ / / |_   _| \\ \\ / /\n  \\ V /    | |    \\ V / \n   > <     | |     > <  \n  / . \\   _| |_   / . \\ \n /_/ \\_\\ |_____| /_/ \\_\\\n", result);
    }

    @Test 
        public void shouldPrint20(){
        int number = 20;
        String result =  RomanPrinter.print(number);
        assertEquals(" __   __ __   __\n \\ \\ / / \\ \\ / /\n  \\ V /   \\ V / \n   > <     > <  \n  / . \\   / . \\ \n /_/ \\_\\ /_/ \\_\\\n", result);
    }

    @Test
        public void shouldPrint30(){
            int number = 30;
            String result =  RomanPrinter.print(number);
            assertEquals(" __   __ __   __ __   __\n \\ \\ / / \\ \\ / / \\ \\ / /\n  \\ V /   \\ V /   \\ V / \n   > <     > <     > <  \n  / . \\   / . \\   / . \\ \n /_/ \\_\\ /_/ \\_\\ /_/ \\_\\\n", result);
    }
    
    @Test
    public void shouldPrint40(){
        int number = 40;
        String result =  RomanPrinter.print(number);
        assertEquals(" __   __  _      \n \\ \\ / / | |     \n  \\ V /  | |     \n   > <   | |     \n  / . \\  | |____ \n /_/ \\_\\ |______|\n", result);
    }

    @Test
    public void shouldPrint50(){
        int number = 50;
        String result =  RomanPrinter.print(number);
        assertEquals("  _      \n | |     \n | |     \n | |     \n | |____ \n |______|\n", result);
    }

    @Test
    public void shouldPrint60(){
        int number = 60;
        String result =  RomanPrinter.print(number);
        assertEquals("  _       __   __\n | |      \\ \\ / /\n | |       \\ V / \n | |        > <  \n | |____   / . \\ \n |______| /_/ \\_\\\n", result);
    }

    @Test
    public void shouldPrint70(){
        int number = 70;
        String result =  RomanPrinter.print(number);
        assertEquals("  _       __   __ __   __\n | |      \\ \\ / / \\ \\ / /\n | |       \\ V /   \\ V / \n | |        > <     > <  \n | |____   / . \\   / . \\ \n |______| /_/ \\_\\ /_/ \\_\\\n", result);
    }

    @Test
    public void shouldPrint80(){
        int number = 80;
        String result =  RomanPrinter.print(number);
        assertEquals("  _       __   __ __   __ __   __\n | |      \\ \\ / / \\ \\ / / \\ \\ / /\n | |       \\ V /   \\ V /   \\ V / \n | |        > <     > <     > <  \n | |____   / . \\   / . \\   / . \\ \n |______| /_/ \\_\\ /_/ \\_\\ /_/ \\_\\\n", result);
    }

    @Test
    public void shouldPrint90(){
        int number = 90;
        String result =  RomanPrinter.print(number);
        assertEquals(" __   __   _____ \n \\ \\ / /  / ____|\n  \\ V /  | |     \n   > <   | |     \n  / . \\  | |____ \n /_/ \\_\\  \\_____|\n", result);
    }

    @Test
    public void shouldPrint100(){
        int number = 100;
        String result =  RomanPrinter.print(number);
        assertEquals("   _____ \n  / ____|\n | |     \n | |     \n | |____ \n  \\_____|\n", result);
    }

    @Test
    public void shouldPrint200(){
        int number = 200;
        String result =  RomanPrinter.print(number);
        assertEquals("   _____    _____ \n  / ____|  / ____|\n | |      | |     \n | |      | |     \n | |____  | |____ \n  \\_____|  \\_____|\n", result);
    }

    @Test
    public void shouldPrint300(){
        int number = 300;
        String result =  RomanPrinter.print(number);
        assertEquals("   _____    _____    _____ \n  / ____|  / ____|  / ____|\n | |      | |      | |     \n | |      | |      | |     \n | |____  | |____  | |____ \n  \\_____|  \\_____|  \\_____|\n", result);
    }

    @Test
    public void shouldPrint400(){
        int number = 400;
        String result =  RomanPrinter.print(number);
        assertEquals("   _____   _____  \n  / ____| |  __ \\ \n | |      | |  | |\n | |      | |  | |\n | |____  | |__| |\n  \\_____| |_____/ \n", result);
    }

    @Test
    public void shouldPrint500(){
        int number = 500;
        String result =  RomanPrinter.print(number);
        assertEquals("  _____  \n |  __ \\ \n | |  | |\n | |  | |\n | |__| |\n |_____/ \n", result);
    }

    @Test
    public void shouldPrint600(){
        int number = 600;
        String result =  RomanPrinter.print(number);
        assertEquals("  _____     _____ \n |  __ \\   / ____|\n | |  | | | |     \n | |  | | | |     \n | |__| | | |____ \n |_____/   \\_____|\n", result);
    }

    @Test
    public void shouldPrint700(){
        int number = 700;
        String result =  RomanPrinter.print(number);
        assertEquals("  _____     _____    _____ \n |  __ \\   / ____|  / ____|\n | |  | | | |      | |     \n | |  | | | |      | |     \n | |__| | | |____  | |____ \n |_____/   \\_____|  \\_____|\n", result);
    }

    @Test
    public void shouldPrint800(){
        int number = 800;
        String result =  RomanPrinter.print(number);
        assertEquals("  _____     _____    _____    _____ \n |  __ \\   / ____|  / ____|  / ____|\n | |  | | | |      | |      | |     \n | |  | | | |      | |      | |     \n | |__| | | |____  | |____  | |____ \n |_____/   \\_____|  \\_____|  \\_____|\n", result);
    }

    @Test
    public void shouldPrint900(){
        int number = 900;
        String result =  RomanPrinter.print(number);
        assertEquals("   _____   __  __ \n  / ____| |  \\/  |\n | |      | \\  / |\n | |      | |\\/| |\n | |____  | |  | |\n  \\_____| |_|  |_|\n", result);
    }

    @Test
    public void shouldPrint1000(){
        int number = 1000;
        String result =  RomanPrinter.print(number);
        assertEquals("  __  __ \n |  \\/  |\n | \\  / |\n | |\\/| |\n | |  | |\n |_|  |_|\n", result);
    }


    @Test(expected = IllegalArgumentException.class)
    public void testPrintZero(){
        RomanPrinter.print(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintNegative(){
        RomanPrinter.print(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintGreater(){
        RomanPrinter.print(1001);
    }
}
