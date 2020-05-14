/**
 * Write a description of class TinaMain here.
 *
 * @author Christina Martinez
 * @version 1.0
 */
public class TinaMain
{
    public static void main(String[] args)
    {
        // types that are native to java
        
        // boolean 
        boolean booleanType;        // can be either true or false
        
        // number types
        byte byteNumberType;        // really small number
        short shortNumberType;      // 2 bytes
        int intNumberType;          // has to be a whole number(+/-)
        long longNumberType;
        
        double doubleNumberType;    // has to be a number, can be a decimal (+/-) 8 bytes
        float floatNumberType;      // same as a double but twice as big in memory 4 bytes
        
        // [0] bit - 1 place
        // [0][0][0][0] nibble - 4 places
        // [0][0][0][0]-[0][0][0][1] byte - 8 places
        // [0][0][0][0]-[0][0][0][1]-[0][0][0][0]-[0][0][0][1]
        // [0][0][0][0]-[0][0][0][1]-[0][0][0][0]-[0][0][0][1]-[0][0][0][0]-[0][0][0][1]-[0][0][0][0]-[0][0][0][1]
        // [0][0][0][0]-[0][0][0][1]-[0][0][0][0]-[0][0][0][1]-[0][0][0][0]-[0][0][0][1]-[0][0][0][0]-[0][0][0][1]-[0][0][0][0]-[0][0][0][1]-[0][0][0][0]-[0][0][0][1]-[0][0][0][0]-[0][0][0][1]-[0][0][0][0]-[0][0][0][1]
    
        // letter types
        char charaType;             // single character 
        String stringType;          // a group of chars
        
        // initializing number types
        byte myNumber = 127;   // 2^8= 256   -127 -> 127
        int yourNumber = 243;
        
        char myChar = '#';
        String myString = "*424sdflj";
        
        boolean myBool = false;
        boolean yourBool = true;
        boolean wrongBool = "true";
     }
}
