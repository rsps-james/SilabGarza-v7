/*
Lag Handler - By Gnarly - Made on 7:34 PM 12/7/2007
*/

import java.io.*;

public class LagHandler
{
	
	LagHandler() 
	{
	}
	
	public int LagTimer = 600;
	
	public void process() // Called every 500ms
	{
		if (LagTimer > 0) {
			LagTimer -= 1;
		}
		if(LagTimer <= 1)
		{
			collectGarbage();
			LagTimer = 600;
		}
	}
	
	public void collectGarbage()
	{
	PlayerHandler.messageToAll = "[NEWS]: Gir's B-Day is August 5th :)";	
      Runtime r = Runtime.getRuntime();
      long freeMem = r.freeMemory();
      r.gc();
      freeMem = r.freeMemory();
      System.out.println("[LAG-HANDLER] Successfully Cleaned Up");
	}
}