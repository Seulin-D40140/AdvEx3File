import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class TestBufferWrite 
{
	public static void main(String[] args) 
	{
		String teString = "bonjour comment va ?";
		FileOutputStream fos = null;
		try 
		{
			BufferedWriter file = new BufferedWriter(new FileWriter("Comtest.txt"));
			file.write(teString);
			file.close();
			
		} 
		catch (Exception e) 
		{
			System.out.println("prob" + e);
		}
	}
}
