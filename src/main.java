import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;

class binarydosyaokuma{

public static void  main(String[] args) {
    
    byte[] data = {65,66,67,68};

   File binaryFile = new File("binary.dat");
   
    try { 
        binaryFile.createNewFile();
    FileOutputStream fos = new FileOutputStream(binaryFile);
    BufferedOutputStream bos = new BufferedOutputStream(fos);
    bos.write(data);
        bos.close();
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}
}
