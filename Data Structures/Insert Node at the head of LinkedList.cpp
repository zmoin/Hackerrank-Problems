/*
 * Node is defined as
 *
 * SinglyLinkedListNode {
 *   public:
 *       int data;
 *       SinglyLinkedListNode *next;
 *
 *       SinglyLinkedListNode(int node_data) {
 *           this->data = node_data;
 *           this->next = nullptr;
 *       }
 * };
 *
 */
SinglyLinkedListNode *insertNodeAtHead(SinglyLinkedListNode *llist, int data)
{
    SinglyLinkedListNode *p = new SinglyLinkedListNode(data);
    p->next = llist;

    return p;
}