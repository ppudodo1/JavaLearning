# Referentni tipovi

## Boolean

```java
import java.io.Serializable;
import java.lang.constant.Constable;
public class Boolean extends Object implements Serializable, Comparable<java.lang.Boolean>, Constable{
    
}
```
The `Boolean` class wraps a value of the primitive type **boolean** in an object. An object of
type `Boolean` contains a single field whose type is **boolean**.

### Boolean Methods
- `booleanValue()` => returns the value of this `Boolean` object as a **boolean** primitive
- `valueOf(boolean b)` => returns a `Boolean` instanec representing the specified **boolean** 
value. If the specified boolean valuse is true, this method returns Boolean.True
- `valueOf(String s)`=> Returns a Boolean with a value represented by the specified string. The Boolean returned represents a true value if the string argument is not null and is equal, ignoring case, to the string "true". Otherwise, a false value is returned, including for a null argument.
- `toString(boolean b)` => Returns a String object representing the specified boolean. If the specified boolean is true, then the string "true" will be returned, otherwise the string "false" will be returned.
- `equals(Object obj)` => Returns true if and only if the argument is not null and is a Boolean object that represents the same boolean value as this object.
- `compareTo(Boolean b)`=>  Returns zero if this object represents the same boolean value as the argument; a positive value if this object represents true and the argument represents false; and a negative value if this object represents false and the argument represents true
- `compare(boolean x, boolean y)` => Compares two boolean values. The value returned is identical to what would be returned by:
  Boolean.valueOf(x).compareTo(Boolean.valueOf(y))

## Float
The `Float` class wraps a value of primitive type **float** in an object. And object of type 
`Float` constains a single field whose type is **float**

### Float methods
- `valueOf(float f)` =>Returns a Float instance representing the specified float value.
- `parseFloat(String s)` =>Returns a new float initialized to the value represented by the specified String, as performed by the valueOf method of class Float.
- `toString()`=> Returns a string representation of this Float object. The primitive float value represented by this object is converted to a String exactly as if by the method toString of one argument.
- `intValue()`=>Returns the value of this Float as an int after a narrowing primitive conversion.
- `equals(Object obj)`=> Compares this object against the specified object. The result is true if and only if the argument is not null and is a Float object that represents a float with the same value as the float represented by this object.
- `compareTo(Float anotherFloat)`=>Compares two Float objects numerically. This method imposes a total order on Float objects with two differences compared to the incomplete order defined by the Java language numerical comparison operators (<, <=, ==, >=, >) on float values.
- `compare(float f1m float f2)`=> Compares the two specified float values. The sign of the integer value returned is the same as that of the integer that would be returned by the call:

## Integer

The `Integer` class wraps a value of the primitive type **int** in an object. An object
of type `Integer` contains a single field whose type is **int**.

### Integer methods
- `toString(int i)`=>Returns a String object representing the specified integer. The argument is converted to signed decimal representation and returned as a string, exactly as if the argument and radix 10 were given as arguments to the toString(int, int) method. Returns:
  a string representation of the argument in base 10.
- `parseInt(String s)`=>Parses the string argument as a signed decimal integer. The characters in the string must all be decimal digits, except that the first character may be an ASCII minus sign '-' ('\u002D') to indicate a negative value or an ASCII plus sign '+' ('\u002B') to indicate a positive value. Returns:
  the integer value represented by the argument in decimal.
- `valueOf(String S)`=> Returns an Integer object holding the value of the specified String. The argument is interpreted as representing a signed decimal integer. an Integer object holding the value represented by the string argument.
- `toString()` =>Returns a String object representing this Integer's value. The value is converted to signed decimal representation and returned as a string, exactly as if the integer value were given as an argument to the toString(int) method.
- `equals()`=>Compares this object to the specified object. The result is true if and only if the argument is not null and is an Integer object that contains the same int value as this object.
- `compareTo(Integer anotherInteger)`=>Compares two Integer objects numerically.
- `compare(int x, int y)` =>Compares two int values numerically. The value returned is identical to what would be returned by:
  Integer.valueOf(x).compareTo(Integer.valueOf(y))
- `sum()`=>Adds two integers together as per the + operator.
- `max()`=>Returns the greater of two int values as if by calling Math.max.
- `min()`=>Returns the smaller of two int values as if by calling Math.min.

## String 
The `String` class represents character strings. All string literals in Java programs such
as **abc** are implemented as instances of this class.

### String methods
- `length()` => Returns the length of this string. The length is equal to the number of Unicode code units in the string.
- `isEmpty()` => Returns true if, and only if, length() is 0.
- `charAt(int index)`=>Returns the char value at the specified index. An index ranges from 0 to length() - 1. The first char value of the sequence is at index 0, the next at index 1, and so on, as for array indexing.
- `equals()`=>Compares this string to the specified object. The result is true if and only if the argument is not null and is a String object that represents the same sequence of characters as this object.
- `compareTo()`=>Compares two strings lexicographically.
- `startsWith(String prefix, int toffset)`=>Tests if the substring of this string beginning at the specified index starts with the specified prefix.
-  `startsWith(String prefix)`=>Tests if this string starts with the specified prefix.
- `endsWith()`=>Tests if this string ends with the specified suffix.
- `indexOf(int ch)`=>Returns the index within this string of the first occurrence of the specified character. 
- `indexOf(int ch, int fromIndex)` => Returns the index within this string of the first occurrence of the specified character, starting the search at the specified index.
- `indexOf(String str)` =>Returns the index within this string of the first occurrence of the specified substring.
- `substring(int beginIndex)`=> Returns a string that is a substring of this string. The substring begins with the character at the specified index and extends to the end of this string.
- `concat` =>Concatenates the specified string to the end of this string.
- `replace(char oldChar, char newChar)`=> Returns a string resulting from replacing all occurrences of oldChar in this string with newChar.
- `contains(CharSequence s)`=>Returns true if and only if this string contains the specified sequence of char values.

## Double
The `Double` class wraps a value of the primitive type **double** in an object. An object of type
`Double` contains a single field whose type is **double**.


### Double Methods
- `toString(double d)` => Returns a string representation of the double argument. 
- `valueOf(String s)` => Returns a Double object holding the double value represented by the argument string s.
- `parseDouble(String s)`=>Returns a new double initialized to the value represented by the specified String, as performed by the valueOf method of class Double.
- `toString()`=>Returns a string representation of this Double object. The primitive double value represented by this object is converted to a string exactly as if by the method toString of one argument.
- `equals(Object obj)` =>Compares this object against the specified object. The result is true if and only if the argument is not null and is a Double object that represents a double that has the same value as the double represented by this object. 
- `compareTo(Double anotherDouble)`=>Compares two Double objects numerically. This method imposes a total order on Double objects with two differences compared to the incomplete order defined by the Java language numerical comparison operators (<, <=, ==, >=, >) on double values.
- `compare(double d1, double d2)`=>Compares the two specified double values. 
