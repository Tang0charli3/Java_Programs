package javaPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class GeneratingEmail {
public static void main(String[] args) throws IOException {
	Scanner sc=new Scanner(System.in);
	//System.out.println("Enter File Name");
	String filename="test6";
	
	//String username="";
	String name="";

	String domain="@gmail.com";
	File file=new File(filename+".txt");//naming the file
	if(!file.exists()) {
		file.createNewFile();
		System.out.println("Enter User Name");
		String username=sc.next();
		FileOutputStream fos=new FileOutputStream(file);
		fos.write(username.getBytes());
		System.out.println("file is created");
		
	}
	FileInputStream fis=new FileInputStream(file);
	int data=fis.read();
	while(data!=-1) {
		char ch=((char)data);
		name=name+ch;
		data=fis.read();
	}
	//System.out.println(name);		
	String numberOnly=name.replaceAll("[^0-9]", "");
	String onlyname=name.replaceAll("[^A-Za-z]+", "");
	//System.out.println(numberOnly);
	int num=Integer.parseInt(numberOnly);
	int newnum=num+1;
	name=onlyname+newnum;
	FileOutputStream fos=new FileOutputStream(file);
	fos.write(name.getBytes());
	//System.out.println(newnum);
	String email=name+domain;
	System.out.println(email);
}
}
