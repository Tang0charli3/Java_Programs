package javaPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandaling1 {
public static void main(String[] args) throws IOException {
	File file=new File("Sample.txt");//naming the file
	if(!file.exists()) {
		file.createNewFile();
		System.out.println("file is created");
	}
	else {
		System.out.println("file is already present");
	}
	FileOutputStream fos=new FileOutputStream(file);
	String msg="I Am Tango Charlie";
	fos.write(msg.getBytes());
	
	
	
}
}
