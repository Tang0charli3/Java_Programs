package WorkingWithFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WorkingWithFile {
public static void main(String[] args) throws IOException {
	File file=new File("Sample.txt");//naming the file
	if(!file.exists()) {
		file.createNewFile();
		System.out.println("File is Created");
	}
	else {
		System.out.println("File Already Created");
	}
	String a="Tango Charlie";
	FileOutputStream fos=new FileOutputStream(file);
	fos.write(a.getBytes());
	FileInputStream fis=new FileInputStream(file);
	int i=fis.read();
	while(i!=-1) {
		System.out.print((char)i);
				i=fis.read();
				
	}
}
}
