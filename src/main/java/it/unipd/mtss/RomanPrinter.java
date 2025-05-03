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
    
        String[] asciiLetters = { "  _____ ", " |_   _|", "   | |  ", "   | |  ", "  _| |_ ", " |_____|"};
        
        for( int z=0; z<6; z++) {
            for (int i =0; i< romanNumber.length(); i++) {
                asciiArt.append(asciiLetters[z]);
            }
            asciiArt.append("\n");
        }
        return asciiArt.toString();
    }
}
