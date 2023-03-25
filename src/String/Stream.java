package String;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Stream
{
    public static void main(String[] args) throws IOException {

       // we are creating input and output and setting the value to null
        FileInputStream stream = null;
        FileOutputStream stream1 = null;
        try {
           // trying to set the value to a new instance with the paths
            stream = new FileInputStream("C:/Users/Learner_XZHCG103/Desktop/txt.txt");
            stream1 = new FileOutputStream("C:/Users/Learner_XZHCG103/Desktop/destination.txt");
            // we are initializing an integer
            int content;
           // .read() reads the input stream one line at a time and returns a int.
            // in the second () we are setting the value of content to the int that was return.
            // in the last () is checking if this a true -1
            while ((content= stream.read())!=-1){
              // we are just out putting  stream1 for writing  to the content.
                stream1.write((byte)content);
            }

        } finally
        {
            // if the stream is set to a destination it will close out.
            if(stream!= null) stream.close();
            if(stream1!= null) stream1.close();

        }





    }
}
