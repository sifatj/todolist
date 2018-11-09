
public class TodoListItem {
	private String description;
	private int priority;
	private boolean done;
	
	public TodoListItem(String description, int priority) {
		this.description = description;
		this.priority = priority;
		this.done = false;
	}

	public String getDescription() {
		return description;
	}

	public int getPriority() {
		return priority;
	}

	public boolean isDone() {
		return done;
	}

	public void markDone() {
		done = true;
	}

}
