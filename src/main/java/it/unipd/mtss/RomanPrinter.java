//////////////////////////////////////////////////////////////////// 
// [Tommaso] [Ceron] [2101045] 
// [Dennis] [Parolin] [2113203] 
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {
    public static String print(int num){
        return printAsciiArt(IntegerToRoman.convert(num));
    }
    private static String printAsciiArt(String romanNumber){
        StringBuilder asciiArt = new StringBuilder();
    
        String[][] asciiLetters = {
            {//Riga1
                " __   __",  // X
                " __      __",  // V
                "  _____ " // I
            },

            {//Riga2
                " \\ \\ / /",  // X
                " \\ \\    / /",  // V
                " |_   _|" // I
            },

            {//Riga3
                "  \\ V / ",  // X
                "  \\ \\  / / ",  // V
                "   | |  " // I
            },

            {//Riga4
                "   > <  ", // X
                "   \\ \\/ /  ", // V
                "   | |  " // I
            },
                
            {//Riga5
                "  / . \\ ", // X
                "    \\  /   ", // V
                "  _| |_ " // I
            },
                
            {//Riga6
                " /_/ \\_\\", // X
                "     \\/    ", // V
                " |_____|" // I
            },
        };
        for( int z=0; z<6; z++) {
            for (char c : romanNumber.toCharArray()) {
                asciiArt.append(asciiLetters[z]["XVI".indexOf(c)]);
            }
            asciiArt.append("\n");
        }
        return asciiArt.toString();
    }
}
