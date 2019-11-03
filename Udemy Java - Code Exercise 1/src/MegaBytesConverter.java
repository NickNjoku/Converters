/**
 * Class that has one method with the purpose of converting KBs to MBs
 * @author nicholasnjoku
 *
 */
public class MegaBytesConverter {
	
	/**
	 * Takes in # of KBs and prints out the conversion to MB
	 * 1 MB = 1024 KB
	 * 
	 * @param kiloBytes
	 */
	public static void printMegaBytesAndKiloBytes(int kiloBytes)
	{
		// Covers the case if the input kiloBytes is negative
		if(kiloBytes <0)
		{
			System.out.println("Invalid Value");
		}
		
		// Conversion (1MB = 1024KB)
		else
		{
			int totalMB = kiloBytes / 1024;
			int remainder = kiloBytes % 1024;
			
			System.out.println(kiloBytes + " KB = "+ totalMB + " MB and "+ remainder + " KB");
		}	
	}
}
