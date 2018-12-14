

/*
 * Prints the elements of a linked list to the console
 * The Node is defined as:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode* next;
 * };
 *
 */
void printLinkedList(SinglyLinkedListNode *head)
{
    SinglyLinkedListNode *temp = head;

    while (temp != nullptr)
    {
        std::cout << temp->data << std::endl;
        temp = temp->next;
    }
}