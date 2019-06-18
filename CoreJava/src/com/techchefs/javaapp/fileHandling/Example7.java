package com.techchefs.javaapp.fileHandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Example7 {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.setAge(28);
		p.setGender('M');
		p.setName("Shiva");
		
		FileOutputStream fout = null;
		ObjectOutputStream objout = null;
		try {
			fout = new FileOutputStream("test.txt");
			objout = new ObjectOutputStream(fout);
			objout.writeObject(p);
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				if (fout!=null) {
					fout.close();
				}
			} catch (IOException e) {
				System.out.println(e);
			} catch (NullPointerException e) {
				System.out.println(e);
			}
		}
		
		FileInputStream fin = null;
		ObjectInputStream objin = null;
		try {
			fin = new FileInputStream("test.txt");
		    objin = new ObjectInputStream(fin);
			Person p1 = (Person)objin.readObject();
			
			System.out.println(p1.getName()+" is of age "+ p1.getAge()+" and "+ p1.getGender());
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} finally {
			try {
				if (fin!=null) {
					fin.close();
				}
			} catch (IOException e) {
				System.out.println(e);
			}
		}
		
	}

}
