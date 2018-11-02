import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

public class TodoListTest {
    private final TodoList todoList = new TodoList();
    
    @Test
    public void testAddItem() {
        todoList.addItem("Bake a cake", 2);
        TodoListItem item = todoList.getItem(0);
        
        assertEquals("Bake a cake", item.getDescription());
        assertEquals(2, item.getPriority());
    }
    
    @Test
    public void testGetItem() {
        todoList.addItem("Drink tea", 5);
        todoList.addItem("Bake a cake", 2);
        todoList.addItem("Renew passport", 10);
        
        TodoListItem item0 = todoList.getItem(0);
        TodoListItem item1 = todoList.getItem(1);
        TodoListItem item2 = todoList.getItem(2);
        
        assertEquals("Drink tea", item0.getDescription());
        assertEquals("Bake a cake", item1.getDescription());
        assertEquals("Renew passport", item2.getDescription());
    }
    
    @Test
    public void testSize() {
        assertEquals(0, todoList.size());
        todoList.addItem("Drink tea", 5);
        todoList.addItem("Bake a cake", 2);
        todoList.addItem("Renew passport", 10);
        assertEquals(3, todoList.size());
    }
    
    @Test
    public void testFindFirstNotDone() {
        todoList.addItem("Drink tea", 5);
        todoList.addItem("Bake a cake", 2);
        todoList.addItem("Renew passport", 10);
        todoList.getItem(0).markDone();
        
        TodoListItem result = todoList.findFirstNotDone();
        assertEquals("Bake a cake", result.getDescription());
    }
    
    @Test
    public void testAllDone() {
        todoList.addItem("Drink tea", 5);
        todoList.addItem("Bake a cake", 2);
        todoList.addItem("Renew passport", 10);
        todoList.getItem(0).markDone();
        todoList.getItem(1).markDone();
        todoList.getItem(2).markDone();
        
        assertNull(todoList.findFirstNotDone());
    }
    
    @Test
    public void testHighestPriorityNotDone() {
        todoList.addItem("Drink tea", 5);
        todoList.addItem("Bake a cake", 2);
        todoList.addItem("Buy milk", 7);
        todoList.addItem("Renew passport", 10);
        todoList.getItem(3).markDone();
        
        TodoListItem result = todoList.findHighestPriorityNotDone();
        assertEquals("Buy milk", result.getDescription());
    }
    
    @Test
    public void testSearch() {
        todoList.addItem("Buy bread", 7);
        todoList.addItem("Buy tea", 7);
        todoList.addItem("Drink tea", 5);
        todoList.addItem("Bake a cake", 2);
        todoList.addItem("Buy milk", 7);
        todoList.addItem("Renew passport", 10);
        
        assertEquals(
            Arrays.asList("Buy bread", "Buy tea", "Buy milk"),
            todoList.search("Buy")
        );
    }
}
