package JC.Exceptions4part;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsPart4 {
    public static void main(String[] args) {
        try{
            expept();
        }catch(IOException e){                //all exceptions extends from IOExceptions
                                              //block catch can be only one
        }

    }
    public static void expept() throws IOException, FileNotFoundException, IllegalStateException {

    }
}
