import java.util.ArrayList;
import java.util.List;

public class TodoList {
	List<TodoListItem> todoList = new ArrayList<>();
	
    /*
     * Add a new item to the list, given a description and priority.
     */
    public void addItem(String description, int priority) {
        todoList.add(new TodoListItem(description, priority));
    }
    
    /*
     * Get the item at a given index.
     */
    public TodoListItem getItem(int i) {
        return todoList.get(i);
    }
    
    /*
     * Get the number of items in the list.
     */
    public int size() {
        return todoList.size();
    }
    
    /*
     * Find the first item in the list which is not marked "done".
     * If all items are marked "done", this method returns null.
     */
    public TodoListItem findFirstNotDone() {
        for(TodoListItem item: todoList) {
        	if(item.isDone() == false) {
        		return item;
        	}
        }
        return null;
    }
    
    /*
     * Find the highest-priority item which is not marked "done".
     * If all items are marked "done", this method returns null.
     */
    public TodoListItem findHighestPriorityNotDone() {
        TodoListItem highestPriority = new TodoListItem(null, 0);
    	
    	for(TodoListItem item: todoList) {
    		if(item.getPriority() > highestPriority.getPriority() && !item.isDone()) {
    			highestPriority = item;
    		}
    		//return highestPriority;
    	}
        return highestPriority;
    }
    
    /*
     * Search for items whose description contains the given text.
     * The descriptions are returned in a list.
     */
    public List<String> search(String text) {
        List<String> list = new ArrayList<>();
        
        for(TodoListItem item: todoList) {
        	if(item.getDescription().toLowerCase().contains(text.toLowerCase())) {
        		list.add(item.getDescription());
        	}
        }
        return list;
    }
}
