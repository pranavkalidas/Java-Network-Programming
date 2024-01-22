package Basics;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channel;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.Arrays;

public class BufferAndChannel {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.quora.com");
            URLConnection urlConnection = url.openConnection();

            InputStream inputStream = urlConnection.getInputStream();
            ReadableByteChannel readableByteChannel = Channels.newChannel(inputStream);
            ByteBuffer buffer = ByteBuffer.allocate(64);

            while(readableByteChannel.read(buffer) > 0 ){
                System.out.println(new String(buffer.array()));
                buffer.clear();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
