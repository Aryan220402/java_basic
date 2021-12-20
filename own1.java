class InvalidAgeExceptions extends Exception
{
    InvalidAgeExceptions (String at)
    {

    }
}
class age
{
    public void age1(int a) throws InvalidAgeExceptions
    {

            if (a <18) 
	    {
                throw new InvalidAgeExceptions("Age is less than 18 ");

            }
	    else
	   {

                System.out.println("matured valid age to vote");
           }
    }
}
public class own1 
{
    public static void main(String[] args) 
	{
        	age a = new age();
        	try 
		{
            		a.age1(19);
        	}
	        catch (InvalidAgeExceptions E)
	        {
        	        System.out.println(E);
	
	        }
        }
}