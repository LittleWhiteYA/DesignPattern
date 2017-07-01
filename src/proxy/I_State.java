package proxy;

import java.io.Serializable;

public interface I_State extends Serializable {

	void insertQuarter();
	void ejectQuarter();
	void turnCrack();
	void dispense();
}
