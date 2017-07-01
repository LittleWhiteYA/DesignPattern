package command;

public class RemoteLoader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl_WithUndo remoteControl = new RemoteControl_WithUndo();
		
		Light livingroomlight = new Light("Living Room");
		Light kitchenlight = new Light("Kitchen");
		
		LightOnCommand livrmlight_On = new LightOnCommand(livingroomlight);
		LightOffCommand livrmlight_Off = new LightOffCommand(livingroomlight);
		LightOnCommand kitlight_On = new LightOnCommand(kitchenlight);
		LightOffCommand kitlight_Off = new LightOffCommand(kitchenlight);
		
		remoteControl.setCommand(0, livrmlight_On, livrmlight_Off);
		remoteControl.setCommand(1, kitlight_On, kitlight_Off);
		
		System.out.println(remoteControl);
		
		remoteControl.onButtonPushed(0);
		remoteControl.offButtonPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonPushed();
		remoteControl.onButtonPushed(1);
		remoteControl.offButtonPushed(1);
		remoteControl.onButtonPushed(2);
		
	}

}
