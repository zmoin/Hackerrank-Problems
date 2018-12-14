/**
 * Node is defined as:
 * class SinglyLinkedListNode {
 *  public:
 *       int data;
 *      SinglyLinkedListNode *next;
 *
 *       SinglyLinkedListNode(int node_data) {
 *           this->data = node_data;
 *           this->next = nullptr;
 *       }
 * };
*/

SinglyLinkedListNode *deleteNode(SinglyLinkedListNode *head, int position)
{
    if (head == nullptr)
        return nullptr;
    else if (position == 0)
        return head->next;
    else
    {
        SinglyLinkedListNode *p = head;
        for (int i = 0; i < position - 1; i++)
        {
            p = p->next;
        }

        p->next = p->next->next;

        return head;
    }
}