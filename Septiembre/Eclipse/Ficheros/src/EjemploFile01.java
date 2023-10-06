
import java.io.File;

public class EjemploFile01 {

	public static void main(String[] args) {
		File f= new File("C:\\DAM\\accesodatos\\ficheritos.txt"); 
	
		try {
			f.createNewFile();
		}catch (Exception e){
			
		}
	}

}