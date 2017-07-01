package command;

public class RemoteControl_WithUndo {
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;
	
	public RemoteControl_WithUndo(){
		onCommands = new Command[7];
		offCommands = new Command[7];
		
		Command noCommand = new NoCommand();
		for(int i=0; i<7; ++i){
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
		
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand){
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonPushed(int slot){
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}
	
	public void offButtonPushed(int slot){
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
	public void undoButtonPushed(){
		undoCommand.undo();
	}
	
	public String toString(){
		StringBuffer strbuf = new StringBuffer();
		strbuf.append("\n----------Remote Control----------\n");
		for(int i=0; i<onCommands.length; ++i)
		{
			strbuf.append("[slot"+i+"]"+onCommands[i].getClass().getName()+"   "
							+offCommands[i].getClass().getName()+"\n");
		}
		
		strbuf.append("[undo]"+undoCommand.getClass().getName());
		return strbuf.toString();
	}
}
