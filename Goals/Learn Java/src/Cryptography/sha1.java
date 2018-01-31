import java.security.MessageDigest;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

class sha1 {
    
    public static void main(String[] args) throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        ByteBuffer b = ByteBuffer.allocate(512);
        b.order(ByteOrder.LITTLE_ENDIAN);
        b.clear();
        b.putInt((int)100000);
        b.flip();
        
        md.update(b.array(), 0, b.limit());
        byte[] result = md.digest();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < result.length; i++) {
            sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
        }
        System.out.println(sb.toString());

    }
}