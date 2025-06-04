package operation.custom;

import java.util.Collections;
import java.util.Map;
import java.util.function.Function;

public class MyCustomFunction extends CustomFunctionWrapper {

	@Override
	public String getDisplayName() {
		return "My Custom Function";
	}

	@Override
	public String getId() {
		return "MyCustomFunction";
	}

	@Override
	public int getNumberOfArguments() {
		return 2; // or however many your function needs
	}

	@Override
	public Function<String[], Map<String, String>> getFunction() {
		return args -> {
			// args[0] = input column name, args[1] = value
			String columnName = args[0];
			String input = args[1];
			String outputColumnName = columnName + "_list";
			String output = input == null ? null : input.toUpperCase(); // Your logic
			return Collections.singletonMap(outputColumnName, output);
		};
	}

	@Override
	public boolean equals(Object o) {
		// assume same for testing
		return true;
		//return o != null && getClass() == o.getClass();
	}

	@Override
	public int hashCode() {
		return getId().hashCode();
	}
}
