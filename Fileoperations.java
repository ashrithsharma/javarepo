package may_18;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Fileoperations {
void FileOp() throws Exception
{
	System.out.println("Implementing Buffered streams");
	BufferedInputStream bis=new BufferedInputStream(new FileInputStream("C:\\Users\\Ashrith\\file1.txt"));
	System.out.println("reading started");
	int x;
	while((x=bis.read())!=-1)

	{
		System.out.print((char)x);
		
	}
	bis.close();
	
}
}
