import java.util.Collections;
import java.util.Map;

public class MyCustomFunction {
    
    public Map<String, String> apply(String columnName, String inputValue) {
        // Same logic as MyCustomFunction
        String outputColumnName = columnName + "_list";
        String output = inputValue == null ? null : inputValue.toUpperCase();
        return Collections.singletonMap(outputColumnName, output);
    }
}
