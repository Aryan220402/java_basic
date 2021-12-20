import java.io.*;
public class try_with_resources 
{
     public static void main(String[] args)
    {
        try (FileOutputStream fos = new FileOutputStream("gfgtextfile.txt")) 
	{	
		// Custom string input

                 String text="Hello World. This is my java program";

            byte arr[] = text.getBytes();
             
            fos.write(arr);
        }
        catch (Exception e) 
	{
            System.out.println(e);
        }
        System.out.println("Resource are closed and message has been written into the gfgtextfile.txt");
    }
    
}
