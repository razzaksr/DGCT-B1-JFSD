package cse.basic;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        // System.out.println( "Hello World!" );
        // String magic = "89.4";
        // System.out.println(magic+4);
        // double data = Double.parseDouble(magic);
        // System.out.println(data+4);
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec("cmd");
    }
}
