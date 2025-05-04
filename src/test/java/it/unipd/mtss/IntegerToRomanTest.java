//////////////////////////////////////////////////////////////////// 
// [Tommaso] [Ceron] [2101045] 
// [Dennis] [Parolin] [2113203] 
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {
    @Test
    public void shouldConvertToI() {
        int number = 1;
        String result = IntegerToRoman.convert(number);
        assertEquals("I", result);
    }

    @Test
    public void shouldConvertToII() {
        int number = 2;
        String result = IntegerToRoman.convert(number);
        assertEquals("II", result);
    }

    @Test
    public void shouldConvertToIII() {
        int number = 3;
        String result = IntegerToRoman.convert(number);
        assertEquals("III", result);
    }

    @Test
    public void shouldConvertToIV() {
        int number = 4;
        String result = IntegerToRoman.convert(number);
        assertEquals("IV", result);
    }

    @Test
    public void shouldConvertToV() {
        int number = 5;
        String result = IntegerToRoman.convert(number);
        assertEquals("V", result);
    }

    @Test
    public void shouldConvertToVI() {
        int number = 6;
        String result = IntegerToRoman.convert(number);
        assertEquals("VI", result);
    }

    @Test
    public void shouldConvertToVII() {
        int number = 7;
        String result = IntegerToRoman.convert(number);
        assertEquals("VII", result);
    }

    @Test
    public void shouldConvertToVIII() {
        int number = 8;
        String result = IntegerToRoman.convert(number);
        assertEquals("VIII", result);
    }

    @Test
    public void shouldConvertToIX() {
        int number = 9;
        String result = IntegerToRoman.convert(number);
        assertEquals("IX", result);
    }

    @Test
    public void shouldConvertToX() {
        int number = 10;
        String result = IntegerToRoman.convert(number);
        assertEquals("X", result);
    }

    @Test
    public void shouldConvertToXV(){
        int number = 15;
        String result = IntegerToRoman.convert(number);
        assertEquals("XV", result);
    }

    @Test
    public void shouldConvertToXIX(){
        int number = 19;
        String result = IntegerToRoman.convert(number);
        assertEquals("XIX", result);
    }

    @Test
    public void shouldConvertToXX(){
        int number = 20;
        String result = IntegerToRoman.convert(number);
        assertEquals("XX", result);
    }
}