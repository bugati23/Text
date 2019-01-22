package service.reader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class ReaderFromFile {
    private static final Logger LOGGER = LogManager.getLogger(ReaderFromFile.class);
    public  String readFile(String filePath) throws ReaderException {
    String fileText;
    try(FileInputStream fileInputStream = new FileInputStream(filePath)) {
        byte[] bytes = new byte[fileInputStream.available()];
        fileInputStream.read(bytes);
        fileText = new String(bytes);
    } catch (FileNotFoundException e) {
        throw new ReaderException(filePath + "wasn't found!");
    } catch (IOException e) {
        throw new ReaderException(filePath + "isn't available!");
    }
    return fileText;
}
}
