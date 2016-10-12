package drivers.commands.factory;

import drivers.commands.Parameter2DIntegerArrayCommand;
import drivers.commands.ParameterBooleanCommand;
import drivers.commands.ParameterCharacterCommand;
import drivers.commands.ParameterCommand;
import drivers.commands.ParameterIntegerArrayCommand;
import drivers.commands.ParameterIntegerCommand;
import drivers.commands.ParameterStringCommand;
import drivers.commands.enums.ParameterTypeEnum;

public class ParameterCommandFactory {
	public static ParameterCommand buildParameterCommand(ParameterTypeEnum parameter) {
		ParameterCommand command = null;
		switch (parameter) {
		case INTEGER:
			command = new ParameterIntegerCommand();
			break;
		case CHARACTER:
			command = new ParameterCharacterCommand();
			break;
		case INTEGERARRAY:
			command = new ParameterIntegerArrayCommand();
			break;
		case BOOLEAN:
			command = new ParameterBooleanCommand();
			break;
		case STRING:
			command = new ParameterStringCommand();
			break;
		case INTEGER_2DARRAY:
			command = new Parameter2DIntegerArrayCommand();
			break;
		default:
			break;
		}
		return command;
	}
}