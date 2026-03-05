package GLAB_303_13_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioExample {

    public static void main(String[] args) throws IOException {

        String[] inputFiles = {
                "src/GLAB_303_13_2/file1.txt",
                "src/GLAB_303_13_2/file2.txt"
        };

        String outputFile = "src/GLAB_303_13_2/nioOutput.txt";

        FileOutputStream fos = new FileOutputStream(outputFile);
        FileChannel targetChannel = fos.getChannel();

        for (String inputFile : inputFiles) {

            FileInputStream fis = new FileInputStream(inputFile);
            FileChannel inputChannel = fis.getChannel();

            ByteBuffer buffer = ByteBuffer.allocate(1024);

            while (inputChannel.read(buffer) > 0) {
                buffer.flip();
                targetChannel.write(buffer);
                buffer.clear();
            }

            inputChannel.close();
            fis.close();
        }

        targetChannel.close();
        fos.close();

        System.out.println("Files merged successfully into nioOutput.txt");
    }
}