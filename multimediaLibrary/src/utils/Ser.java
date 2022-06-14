package utils;

import java.io.*;

public class Serializer {

	public static void save(String fileName, Object object) throws IOException {
		fileName += ".ser";
		FileOutputStream fileOut = new FileOutputStream(fileName);
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(object);
		out.close();
		fileOut.close();
	}
	
	public static Object load(String path) throws IOException, ClassNotFoundException {
		Object serial = null;
		FileInputStream fileIn = new FileInputStream(path);
		ObjectInputStream in = new ObjectInputStream(fileIn);
		
		serial = (Object) in.readObject();
		in.close();
		fileIn.close();
		return serial;
	}
	
}
