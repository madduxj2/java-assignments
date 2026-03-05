package GLAB_303_13_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

public class NioExampleTwo {

    public static void main(String[] args) throws IOException {

        String[] inputFiles = {
                "src/GLAB_303_13_2/file1.txt",
                "src/GLAB_303_13_2/file2.txt"
        };

        String outputFile = "src/GLAB_303_13_2/outputExampleTwo.txt";

        FileOutputStream fos = new FileOutputStream(outputFile);
        WritableByteChannel targetChannel = fos.getChannel();

        for (String inputFile : inputFiles) {

            FileInputStream fis = new FileInputStream(inputFile);
            FileChannel inputChannel = fis.getChannel();

            inputChannel.transferTo(0, inputChannel.size(), targetChannel);

            inputChannel.close();
            fis.close();
        }

        targetChannel.close();
        fos.close();

        System.out.println("Files transferred successfully.");
    }
}