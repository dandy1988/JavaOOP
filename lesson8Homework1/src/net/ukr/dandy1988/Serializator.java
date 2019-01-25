package net.ukr.dandy1988;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Serializator {
	public static void saveObjectToFile(Object obj, File file) throws IOException{
		try(ObjectOutput oos = new ObjectOutputStream(new FileOutputStream(file))){
			oos.writeObject(obj);		
		}catch (IOException e) {
			throw e;
		}	
	}
	
	public static Object loadObjectFromFile(File file) throws IOException, ClassNotFoundException{
		try(ObjectInput ois = new ObjectInputStream(new FileInputStream(file))){
			return ois.readObject();
		}catch (IOException e) {
			throw e;
		}
	}
	
	public static void saveObjectToFileArray(Object obj[], File file) throws IOException{
		for (Object object : obj) {		
			try(ObjectOutput oos = new ObjectOutputStream(new FileOutputStream(file))){
				oos.writeObject(object);		
			}catch (IOException e) {
				throw e;
			}
		}
	}
	
	public static Group[] loadObjectFromFileArray(File file, int k) throws IOException, ClassNotFoundException{
		Group objReturn[] = new Group [k]; 
		for (int i = 0; i < objReturn.length; i++) {
			try(ObjectInput ois = new ObjectInputStream(new FileInputStream(file))){		
				 objReturn[i] = (Group) ois.readObject();
				 if (objReturn[i] == null) {
						return objReturn;
				 }
			}catch (IOException e) {
				throw e;
			}
		}
		return objReturn;
	}

}
