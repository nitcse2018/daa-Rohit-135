import java.io.*;
public class CharStream 
{
	public static void main(String []args) throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Rohit Kumar\\Desktop\\Lockdown\\Java File Handling\\Input.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Rohit Kumar\\Desktop\\Lockdown\\Java File Handling\\Output.txt",true));
		
		int i;
		while((i=br.read())!=-1)
		{
			bw.write((char)i);
		}
		br.close();
		bw.close();
	}
}
