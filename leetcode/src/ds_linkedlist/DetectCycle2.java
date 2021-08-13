// 环形链表02
// https://leetcode-cn.com/leetbook/read/linked-list/jjhf6/
// 用哈希表

package ds_linkedlist;

import java.util.HashSet;
import java.util.Set;

public class DetectCycle2 {
	public Node detectCycle(Node head) {
        Node pos = head;
        Set<Node> visited = new HashSet<Node>();
        while (pos != null) {
            if (visited.contains(pos)) {
                return pos;
            } else {
                visited.add(pos);
            }
            pos = pos.next;
        }
        return null;
    }

}
