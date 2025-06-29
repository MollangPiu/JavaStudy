package campus.design.memento;

import java.util.Stack;

public class MacroCommand implements Command, Cloneable {
    private Stack<Command> commands = new Stack<>();
    @Override
    public void execute() {
        commands.forEach(Command::execute);
    }

    public void add(Command command) {
        commands.push(command);
    }

    public void undo() {
        commands.pop();
    }

    public void clear() {
        commands.clear();
    }

    @Override
    public MacroCommand clone() {
        MacroCommand macroCommand = null;
        try {
            macroCommand = (MacroCommand) super.clone();
            macroCommand.commands = (Stack<Command>) this.commands.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return macroCommand;
    }
}
