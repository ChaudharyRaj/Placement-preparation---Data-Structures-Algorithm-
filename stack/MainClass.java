package stack;
import java.io.*;

public class MainClass {

	public static void main(String[] args) throws IOException {
		/*Referencing a file on given path*/
		File f = new File("D:\\java\\fileHandling\\FileHandlingNewFilef1.txt");
		
		/*Create new File */
		
		/* if(f.createNewFile()){
			
			System.out.println("File Created  "+ f.getName());
			
		}else{
			
			System.out.println("File already created");
		}
		*/
		
		/*FildeReader*/
		/*if(f.exists()){
			
			System.out.println("file name "+f.getName());
			
			System.out.println("file path "+f.getAbsolutePath());
			
			System.out.println("Writeable "+f.canWrite());
			
			System.out.println("Redable "+f.canRead());
			
			System.out.println("File length "+f.length());
			
		}else{
			System.out.println("file is not exist ! ");
		}*/
	
		/*FileWriter*/
		/*FileWriter fw = new FileWriter(f);
		fw.write(100+"\n");
		char[] ch = {'x','y','z'};
		fw.write(ch);
		fw.write("welcome");
		fw.flush();
		fw.close();
		System.out.println("File length "+f.length());*/
		
		/*FileReader fr =  new FileReader(f);
		int x = fr.read();
		while(x != -1){
			System.out.print((char)x);
			x = fr.read();
		}*/
		
		
		/*buffredWriter */
		/*
		 * FileWriter writer = new FileWriter(f); 
		 * BufferedWriter bw = new
		 * BufferedWriter(writer); 
		 * bw.write("Hello Wrold"); 
		 * String arg = "Hello Geeks";
		 * int offset = 6;
		 * 
		 * bw.newLine(); 
		 * bw.write(arg,offset,arg.length()-offset); 
		 * bw.newLine(); char[]
		 * ch = {'x','y','z'}; bw.write(ch); 
		 * bw.flush(); 
		 * bw.close();
		 */
		
		/*BuffreadReader to reat data rom file*/
		
		FileReader fr =  new FileReader(f);
		BufferedReader br  =  new BufferedReader(fr);
		String s[] = br.readLine().trim().split("\\s");
		for(String s1 : s){
			System.out.println(s1+" ");
		}
	}

}
