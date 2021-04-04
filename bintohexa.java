// binary number to hexadecimal number
import java.io.*;
import java.util.*;
 
class bintohexa{
static void createMap(Map<String, Character> um)
{
    um.put("0000", '0');
    um.put("0001", '1');
    um.put("0010", '2');
    um.put("0011", '3');
    um.put("0100", '4');
    um.put("0101", '5');
    um.put("0110", '6');
    um.put("0111", '7');
    um.put("1000", '8');
    um.put("1001", '9');
    um.put("1010", 'A');
    um.put("1011", 'B');
    um.put("1100", 'C');
    um.put("1101", 'D');
    um.put("1110", 'E');
    um.put("1111", 'F');
}
 
static String convertBintoHex(String bin)
{
    int l = bin.length();
    int t = bin.indexOf('.');
 
    // Length of string before '.'
    int left_s = t != -1 ? t : l;
 //left substring %4
    for(int i = 1;
            i <= (4 - left_s % 4) % 4;
            i++)
        bin = '0' + bin;
 
    // If decimal point exists
    if (t != -1)
    {
        // Length of string after '.'
        int right_s= l - left_s - 1;
 
        for(int i = 1;
                i <= (4 - right_s % 4) % 4;
                i++)
            bin = bin + '0';
    }
 
    // map between binary and hexa
        Map<String,
        Character> bin_hex_map = new HashMap<String,
                                             Character>();
    createMap(bin_hex_map);
 
    int i = 0;
    String hex = "";
 
    while (true)
    {
         
        hex += bin_hex_map.get( bin.substring(i, i + 4));
        i += 4;
        if (i == bin.length())
            break;
 
        if (bin.charAt(i) == '.')
        {
            hex += '.';
            i++;
        }
    }
    return hex;
}
public static void main(String[] args)
{
    String bin = "1100";
     
    System.out.print("Hexadecimal number = " +
                      convertBintoHex(bin));
}
}