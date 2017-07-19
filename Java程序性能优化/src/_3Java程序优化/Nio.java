package _3Java程序优化;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by sharp on 2017/7/6 - 11:08
 */
public class Nio {
    public static void main(String[] args) {
        Buffer基本原理_标志位();
    }
    
    private static void Buffer基本原理_标志位() {
        ByteBuffer buffer = ByteBuffer.allocate(15);//15个字节大小的缓冲区
        System.out.println("初始阶段: limit=" + buffer.limit() + "; capacity=" + buffer.capacity() + "; position=" + buffer.position());
        
        //存入10个字节
        for (int i = 0; i < 10; i++) {
            buffer.put((byte) i);
        }
        System.out.println("存入10个字节后: limit=" + buffer.limit() + "; capacity=" + buffer.capacity() + "; position=" + buffer.position());
        
        buffer.flip();
        System.out.println("重置position: limit=" + buffer.limit() + "; capacity=" + buffer.capacity() + "; position=" + buffer.position());
    
        for (int i = 0; i < 5; i++) {
            System.out.print(buffer.get(i) + " ");
        }
        System.out.println();
        System.out.println("执行5次读操作: limit=" + buffer.limit() + "; capacity=" + buffer.capacity() + "; position=" + buffer.position());
        
        buffer.flip();
        System.out.println("重置position: limit=" + buffer.limit() + "; capacity=" + buffer.capacity() + "; position=" + buffer.position());
    
    }
    
    /**
     * 复制文件
     *
     * @param resource
     * @param destination
     * @throws IOException
     */
    public static void nioCopyFile(String resource, String destination) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File(resource));
        FileOutputStream fileOutputStream = new FileOutputStream(new File(destination));
        
        FileChannel readChannel = fileInputStream.getChannel(); //读文件通道
        FileChannel writeChannel = fileOutputStream.getChannel(); //写文件通道
        
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024); //读入数据缓存
        
        while (true) {
            byteBuffer.clear();
            //读入数据
            int len = readChannel.read(byteBuffer);
            
            //读取完毕
            if (len == -1) {
                break;
            }
            
            //写入文件
            byteBuffer.flip();
            writeChannel.write(byteBuffer);
        }
        
        readChannel.close();
        writeChannel.close();
    }
    
    
}
