import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {

   @Test
   public void contains_emptyTree_returnsFalse() {
    BinaryTreeNode<Integer> root = null;
    boolean result = BstSearch.contains(root, 5);
    assertFalse(result);
   }
}
