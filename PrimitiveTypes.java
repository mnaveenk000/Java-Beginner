public class PrimitiveTypes {
    public static void main(String[] args) {
        // 1. Integer Types
        byte myByte = 127;                  // 8-bit, range: -128 to 127
        short myShort = 32000;              // 16-bit, range: -32,768 to 32,767
        int myInt = 2000000000;             // 32-bit, range: -2^31 to 2^31-1
        long myLong = 9000000000000000000L; // 64-bit, range: -2^63 to 2^63-1
        
        System.out.println("Integer Types:");
        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("int: " + myInt);
        System.out.println("long: " + myLong);
        
        // 2. Floating Point Types
        float myFloat = 3.14f;              // 32-bit, ~7 decimal digits
        double myDouble = 3.14159265359;    // 64-bit, ~15 decimal digits
        
        System.out.println("\nFloating Point Types:");
        System.out.println("float: " + myFloat);
        System.out.println("double: " + myDouble);
        
        // 3. Character Type
        char myChar = 'A';                  // 16-bit Unicode character
        char myUnicode = '\u0041';          // Unicode 'A'
        
        System.out.println("\nCharacter Type:");
        System.out.println("char (letter): " + myChar);
        System.out.println("char (unicode): " + myUnicode);
        
        // 4. Boolean Type
        boolean isTrue = true;              // true or false
        boolean isFalse = false;
        
        System.out.println("\nBoolean Type:");
        System.out.println("isTrue: " + isTrue);
        System.out.println("isFalse: " + isFalse);
        
        // Examples of operations
        System.out.println("\nOperations with Primitives:");
        
        // Integer operations
        int sum = myInt + 5;
        int difference = myInt - 10;
        System.out.println("Integer addition: " + sum);
        System.out.println("Integer subtraction: " + difference);
        
        // Floating point operations
        double result = myDouble * 2;
        System.out.println("Double multiplication: " + result);
        
        // Type conversion (casting)
        int intValue = (int) myDouble;      // Double to int (loses decimal part)
        double doubleValue = myInt;         // Int to double (automatic conversion)
        
        System.out.println("\nType Conversion:");
        System.out.println("Double to int: " + intValue);
        System.out.println("Int to double: " + doubleValue);
    }
} 