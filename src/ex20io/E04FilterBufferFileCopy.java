package ex20io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class E04FilterBufferFileCopy {
	public static void main(String[] args) {
		try {
			InputStream in= new FileInputStream("src/ex20io/A38Http2.zip");
			OutputStream out=new FileOutputStream("src/ex20io/A38Http2_copy3.zip");
			//파일과 JAVA사이에서 버퍼역할을 할수있는 버퍼 필터스트림추가
			BufferedInputStream bufIn=new BufferedInputStream(in);
			BufferedOutputStream bufOut= new BufferedOutputStream(out);
			
			int copyByte=0;
			int bData;
			/*
			 버퍼 필터스트림을 통해 파일을 읽어 저장한다
			 버퍼를 기반으로 하므로 읽기/쓰기 속도가 매우 빠르다
			 */
			while(true) {
				bData= bufIn.read();
				if(bData==-1) {
					break;
				}
				
				bufOut.write(bData);
				copyByte++;
			}
			
			bufIn.close();
			bufOut.close();
			System.out.println("복사된 파일크기: "+(copyByte/1024)+"Kbyte");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
