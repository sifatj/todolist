
public class TodoListItem {
	private String description;
	private int priority;
	private boolean done;
	
	/**
	 * Class constructor
	 * @param description
	 * @param priority
	 */
	public TodoListItem(String description, int priority) {
		this.description = description;
		this.priority = priority;
		this.done = false;
	}

	/**
	 * Returns the item description
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Returns the item priority
	 * @return priority
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * Returns current state of done 
	 * @return done
	 */
	public boolean isDone() {
		return done;
	}

	/**
	 * Changes the state of done to true
	 */
	public void markDone() {
		done = true;
	}

}
