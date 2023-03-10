
public interface Priority {

	//Constants for priority
	int MED_PRIORITY = 5;
	int MIN_PRIORITY = 1;
	int MAX_PRIORITY = 10;
	
	/*setPriority and getPriority defines a way
	 * where it establishes a numeric priority
	 * among a set of objects
	 */
	
	//setPriority starts here
	public void setPriority(int Priority_Set);
	//setPriority ends here
	
	//getPriority starts here
	public int getPriority();
	//getPriority ends here
}
