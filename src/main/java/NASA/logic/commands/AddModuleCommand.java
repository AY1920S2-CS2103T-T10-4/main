package nasa.logic.commands;

import static java.util.Objects.requireNonNull;
import static nasa.logic.parser.CliSyntax.PREFIX_MODULE;
import static nasa.logic.parser.CliSyntax.PREFIX_MODULE_NAME;

import nasa.logic.commands.exceptions.CommandException;
import nasa.model.Model;
import nasa.model.module.Module;

public class AddModuleCommand extends Command {

    public static final String COMMAND_WORD = "event";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Adds a module to NASA. "
            + "Parameters:"
            + PREFIX_MODULE + "MODULE CODE"
            + PREFIX_MODULE_NAME + "MODULE NAME" + "\n"
            + "Example: " + COMMAND_WORD + " "
            + PREFIX_MODULE + "CS3233"
            + PREFIX_MODULE_NAME + "Competitive Programming";

    public static final String MESSAGE_SUCCESS = "New module added!";
    public static final String MESSAGE_DUPLICATED_ACTIVITY = "This module already exist!";

    private Module toAdd;

    public AddModuleCommand(Module module) {
        requireNonNull(module);
        toAdd = module;
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);
        // TODO add the necessary implementation once model is done
        return new CommandResult("");
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof AddModuleCommand // instanceof handles nulls
                && toAdd.equals(((AddModuleCommand) other).toAdd));
    }
}
