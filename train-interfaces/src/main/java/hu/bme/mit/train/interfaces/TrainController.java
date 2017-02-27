package hu.bme.mit.train.interfaces;

public interface TrainController {

	void followSpeed();

	int getReferenceSpeed();

	void counter(); // ours

	void setSpeedLimit(int speedLimit);

	void setJoystickPosition(int joystickPosition);

}
