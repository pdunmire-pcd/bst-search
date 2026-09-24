import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {

   @Test
   public void contains_emptyTree_returnsFalse() {
    BinaryTreeNode<Integer> root = null;
    boolean result = BstSearch.contains(root, 5);
    assertFalse(result);
   }

   @Test 
   public void contains_targetAtRoot_returnsTrue(){
    BinaryTreeNode<Integer> root = new BinaryTreeNode<>(5);
    boolean result = BstSearch.contains(root, 5);
    assertTrue(result);
   }

   @Test
   public void contains_targetInLeftSubTree_returnsTrue() {
    BinaryTreeNode<Integer> three = new BinaryTreeNode<>(3);
    BinaryTreeNode<Integer> seven = new BinaryTreeNode<>(7);
    BinaryTreeNode<Integer> fifteen = new BinaryTreeNode<>(15);
    BinaryTreeNode<Integer> five = new BinaryTreeNode<>(5, three, seven);
    BinaryTreeNode<Integer> root = new BinaryTreeNode<>(10, five, fifteen);
    boolean result = BstSearch.contains(root, 3);
    assertTrue(result);
   }

   @Test
   public void contains_targetInRightSubTree_returnsTrue(){
    BinaryTreeNode<Integer> three = new BinaryTreeNode<>(3);
    BinaryTreeNode<Integer> seven = new BinaryTreeNode<>(7);
    BinaryTreeNode<Integer> fifteen = new BinaryTreeNode<>(15);
    BinaryTreeNode<Integer> five = new BinaryTreeNode<>(5, three, seven);
    BinaryTreeNode<Integer> root = new BinaryTreeNode<>(10, five, fifteen);
    boolean result = BstSearch.contains(root, 15);
    assertTrue(result);
   }

   @Test
    public void contains_targetNotInTree_returnsFalse() {
        BinaryTreeNode<Integer> three = new BinaryTreeNode<>(3);
        BinaryTreeNode<Integer> seven = new BinaryTreeNode<>(7);
        BinaryTreeNode<Integer> fifteen = new BinaryTreeNode<>(15);
        BinaryTreeNode<Integer> five = new BinaryTreeNode<>(5, three, seven);
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(10, five, fifteen);
        boolean result = BstSearch.contains(root, 6);
        assertFalse(result);
}

    @Test
    public void contains_nullTarget_throwsNullPointerException() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(5);
        assertThrows(NullPointerException.class, () -> {
        BstSearch.contains(root, null);
    });
}

   
}