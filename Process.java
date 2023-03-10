
public class Process implements Priority,Comparable<Process> {

	String processID;
	int priority;
	
	//Default Constructor starts here
	public Process()
	{
		processID = "";
	}
	//Default Constructor ends here
	
	//Preferred Constructor starts here
	public Process(String processID, int priority)
	{
		this.processID = processID;
		this.priority = priority;
	}//Preferred Constructor ends here
	
	//Getters and setters start here
	
	//getProcessID method starts here
	
	/*
	 * @return processID returns the processID
	 */
	public String getProcessID()
	{
		return processID;
	}
	
	//setPriority method starts here
		/*
		 * @param priority just sets the 
		 * priority by an integer
		 * 
		 */
	@Override
	public void setPriority(int priority) {
		// TODO Auto-generated method stub
		this.priority = priority;
	}//setPriority method ends here

	//getPriority method starts here
		/*
		 * @return priority returns the priority
		 */
	@Override
	public int getPriority() {
		// TODO Auto-generated method stub
		return priority;
	}//getPriority method ends here
	//Getters and Setters ends here
	
	//compareTo method starts here
	@Override
	public int compareTo(Process o) {
		// TODO Auto-generated method stub
		
		/*o Refers to the compared task object getting passed in the 
		 * parameter
		 */
		
		/*this.priority refers to the original
		 * set priority this class has earlier
		*/
		
		/*
		 * the variable result functions as a
		 * value that stores a result. Like with
		 * the compareTo method, it returns a value 
		 * after it compares the two objects.
		 */
		
		/*If the two objects that are compared are equal
		 * then it returns the result 0. Otherwise -1.
		 * 
		 */
		int result = 0;
		
		if(o.getPriority() == this.priority)
		{
			result = 0;
		}
		
		else
		{
			result = -1;
		}
		
		return result;
	}//compareTo method ends here
	
	//toString method starts here
	/*this toString method returns all the info
	 * the Process object has.
	 */
	@Override
	public String toString() 
	{
		return "Process [processID= " + processID + ", priority= " + priority + "]";
	}//toString method ends here
	
}//Class ends here
