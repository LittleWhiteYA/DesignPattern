package decorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

	protected LowerCaseInputStream(InputStream in) {
		super(in);
		// TODO Auto-generated constructor stub
	}
	
	public int read() throws IOException {
		int c = super.read();
		System.out.print(c+"|");
		return(c == -1 ? c : Character.toLowerCase((char)c));
	}
	
	public int read(byte[] b, int offset, int len) throws IOException {
		int result = super.read(b, offset, len);
		for(int i=offset; i<offset+result; ++i){
			b[i] = (byte)Character.toLowerCase((char)b[i]);
		}
		return result;
	}
	
}
