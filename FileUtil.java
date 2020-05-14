package util;

import java.io.*;

public class FileUtil {
	
	 public static void ReadFileByLine(String filename) throws Exception{
	       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
	        String line = null;
	        while ((line = bufferedReader.readLine()) != null) {
	            System.out.println(line);
	        }
	        bufferedReader.close();
	    }
	 public static void WriteFile(String filename,boolean append,String abc) throws Exception{ 

		File file = new File(filename);
        FileOutputStream fos = null;
        if(!file.exists()){
            file.createNewFile();
            fos = new FileOutputStream(file);//首次写入
        }else{
            fos = new FileOutputStream(file,append);//在文件末尾追加写入
        }
        OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
    	osw.write(abc);
        osw.write("\n");
        osw.close();
	} 
	 public static void main(String[] args) throws Exception {
		 WriteFile("d:\\ary2.txt",true,"youwant");
		 ReadFileByLine("d:\\ary2.txt");
	 }
}
