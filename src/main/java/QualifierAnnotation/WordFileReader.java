package QualifierAnnotation;

import org.springframework.stereotype.Component;


public class WordFileReader implements Reader{
    @Override
    public String readFile() {
        return "WORD File";
    }
}
