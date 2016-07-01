/** Program:  9.6 stopwatch
  * File:     stopwatchClass.java 
  * Summary:  create class for stopwatch
  * Author:   Eric Roberts
  * Date:     June 30, 2016
**/
public class stopwatchClass {
	//start and end time
	private long startTime;
	private long endTime;
	
	//no-arg constructor starts time
	stopwatchClass() {
		startTime = System.currentTimeMillis();
	}
	
	//reset startTime to current time
	public void start() {
		startTime = System.currentTimeMillis();
	}
	
	//sets the endTime to current time
	public void stop() {
		endTime = System.currentTimeMillis();
	}
	
	//return elapsed time for stopwatch
	public long getElapsedTime() {
		return getEndTime() - getStartTime();
	}
	
	//return start time
	public long getStartTime() {
		return startTime;
	}
	
	//return end time
	public long getEndTime() {
		return endTime;
	}

}
