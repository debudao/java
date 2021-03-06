import java.io.*;
public class TestRandomAccess{ //Random Access File
	public static void main(String[] args){
		try{
			RandomAccessFile raf = new RandomAccessFile("data\\random.txt", "rw");
			for (int i=0; i<3; i++){
				raf.writeChar('S');
				raf.writeInt(i+10);
			}
			for (int i=0; i<3; i++){
				raf.seek(6 * i + 2);
				int n = raf.readInt();
				System.out.println(n);
			}
			System.out.println();
			raf.seek(0);
			for (int i=0; i<3; i++){
				raf.skipBytes(2);
				int n = raf.readInt();
				System.out.println(n);
			}
		} catch(IOException ioe){
			System.out.println(ioe);
		}
	}
}