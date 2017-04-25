boolean hasCycle(Node head) 
{
    if(head==null)
        return false;
    
    Node n1=head;
    Node n2=head;
    while(n2!=null && n2.next!=null)
    {
        n1=n1.next;
        n2=n2.next.next;
        if(n1==n2)
            {
                return true;
            } 
    }
    return false;
}
