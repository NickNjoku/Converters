
public class MegaBytesConverter {
	
	public static void printMegaBytesAndKiloBytes(int kiloBytes)
	{
		if(kiloBytes <0)
		{
			System.out.println("Invalid Value");
		}
		
		else
		{
			int totalMB = kiloBytes / 1024;
			int remainder = kiloBytes % 1024;
			
			System.out.println(kiloBytes + " KB = "+ totalMB + " MB and "+ remainder + " KB");
		}
		
	}

}
