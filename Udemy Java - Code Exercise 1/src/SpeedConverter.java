
public class SpeedConverter {
	
	 // write your code here
    
	public static void printConversion(double kilometersPerHour)
	{
		
		long km = toMilesPerHour(kilometersPerHour);
		if(kilometersPerHour < 0)
		{
			System.out.println("Invalid Value");
		}
		else
		{
			System.out.println(kilometersPerHour + " km/h = " + km + " mi/h");
		}
	}
	
	
	
	public static long toMilesPerHour(double kilometersPerHour)
    {
        
    	//long km = (long) kilometersPerHour;
    	if(kilometersPerHour < 0)
    	{
    		return -1;
    	}
    	else
    	{
    		return Math.round(kilometersPerHour/ 1.609);	
    	}
    	
    }
	
	
}
