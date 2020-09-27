import stanford.karel.*;

public class VotingBox extends SuperKarel {

	public void run()
	{while (frontIsClear())
	{move();
	

	if (noBeepersPresent())
	{eliminateChad();}
	move();}}
		
//This setup moves every force when clear, then checks beepers and then
//eliminatesChad on collums where karel then moves again, then the process
//repeats as long as the frontIsClear.
	
	private void eliminateChad() 
	
	{turnRight();
	move();
		
	while (beepersPresent()) 
	{pickBeeper();}
	
	turnAround();
	move();
	move();
		
	while (beepersPresent()) 
	{pickBeeper();}
	
	turnAround();
	move();
	turnLeft();
	}}
	