
public class Task implements Priority, Comparable<Task>{

	//Enumerated Status starts here
	enum Status{NOT_STARTED, IN_PROCESS, COMPLETE}
	
	Status stat;
	
	String name;
	int priority;
	
	//Default constructor starts here
	public Task()
	{
		super();
		name = "";
		priority = 0;
	}
	//Default constructor ends here
	
	//Preferred constructor starts here
	public Task(String name, int priority)
	{	
		super();
		this.name = name;
		this.priority = priority;
	}
	
	//Getters and setters start here
	
	//getName method starts here
	
	/*This method just returns the name
	 * @return name 
	 * 
	 */
	public String getName() 
	{
		return name;
	}//getName method ends here
	
	//getStat method starts here
	
	/*
	 * This method returns the stat
	 * and the stat holds which type of status 
	 * from the enumerated Status 
	 * @return stat
	 */
	public Status getStat() 
	{
		return stat;
	}//getStat method ends here

	
	//setStat methods start here
	
	/*
	 *setStat1 is the first of the  
	 * setStat methods. It does not 
	 * need any parameters; it just
	 * sets stat to NOT_STARTED, which
	 * NOT_STARTED is from Status.
	 */
	public void setStat1() 
	{
		this.stat = Status.NOT_STARTED;
	}//setStat1 method ends here
	
	
	/*
	 *setStat2 is the second of the  
	 * setStat methods. It does not 
	 * need any parameters; it just
	 * sets stat to IN_PROCESS, which
	 * IN_PROCESS is from Status.
	 */
	public void setStat2() 
	{
		this.stat = Status.IN_PROCESS;
	}//setStat2 method ends here
	
	/*
	 *setStat3 is the third of the  
	 * setStat methods. It does not 
	 * need any parameters; it just
	 * sets stat to COMPLETE, which
	 * COMPLETE is from Status.
	 */
	public void setStat3() 
	{
		this.stat = Status.COMPLETE;
	}//setStat3 method ends here

	
	//setPriority method starts here
	/*
	 * @param priority just sets the 
	 * priority by an integer
	 * 
	 */
	@Override
	public void setPriority(int priority)
	// TODO Auto-generated method stub
	{
		this.priority = priority;
	}//setPriority ends here

	//getPriority method starts here
	/*
	 * @return priority returns the priority
	 */
	@Override
	public int getPriority() 
		// TODO Auto-generated method stub
	{
		return priority;
	}//getPriority method ends here
	//Getters and Setters end here
	
	//compareTo method starts here
	@Override
	public int compareTo(Task o) {
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
	 * the Task object has.
	 */
	@Override
	public String toString() {
		return "Task [stat= " + stat + ", name= " + name + ", priority= "
				+ "" + priority + "]";
	}//toString method ends here
	
}//Class ends here
