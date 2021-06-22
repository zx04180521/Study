package Util;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class HttpUtil {



    public static String readBody(HttpServletRequest req) throws UnsupportedEncodingException {
        //1.先获取请求中的body长度，进行分配空间
        //  单位是字节
        int contentLength=req.getContentLength();
        byte[] buf=new byte[contentLength];
        ServletInputStream inputStream=null;
        try {
            inputStream =req.getInputStream();
            inputStream.read(buf);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return new String(buf,"utf-8");
    }
}
