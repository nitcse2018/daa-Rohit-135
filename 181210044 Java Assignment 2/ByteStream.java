import java.io.*;
public class ByteStream 
{
	public static void main(String []args) throws IOException
	{
		FileInputStream in = new FileInputStream("C:\\Users\\Rohit Kumar\\Desktop\\Lockdown\\Java File Handling\\Input.txt");
		FileOutputStream out = new FileOutputStream("C:\\Users\\Rohit Kumar\\Desktop\\Lockdown\\Java File Handling\\Output.txt",true);
		
		int i;
		while((i=in.read())!=-1)
		{
			out.write((char)i);
		}
		in.close();
		out.close();
	}
}
