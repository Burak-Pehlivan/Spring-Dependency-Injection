package QualifierAnnotation;

import org.springframework.stereotype.Component;

@Component("EXCEL")
public class ExcelFileReader implements Reader{

    @Override
    public String readFile() {
        return "EXCEL File";
    }
}
