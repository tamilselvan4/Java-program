public class ListNode {
    String name;
    ListNode next;

    public ListNode(String name, ListNode next) {
        this.name = name;
        this.next = next;
    }

    public void setNode(ListNode node) {
        this.next = node;
    }
}
