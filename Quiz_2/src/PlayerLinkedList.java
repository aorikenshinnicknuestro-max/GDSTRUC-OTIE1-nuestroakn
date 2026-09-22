public class PlayerLinkedList {
    private PlayerNode head;
    int size = 0;

    public void addonFront(Player player) {
        PlayerNode node = new PlayerNode(player);
        node.setNextPlayer(head);
        head = node;

        size++;
    }

    public void removeFirst()
    {
        if(head != null)
        {
            head = head.getNextPlayer();
            size--;
        }
    }

    public int Size()
    {
        return size;
    }

    public boolean contains(Player player)
    {
        PlayerNode current = head;

        while(current != null)
        {
            if(current.getPlayer().id == player.id)
            {
                return true;
            }

            current = current.getNextPlayer();
        }

        return false;
    }

    public int indexOf(Player player)
    {
        PlayerNode current = head;
        int index = 0;
        while(current != null)

            if(current.getPlayer().id== player.id)
            {
                return index;
            }
        return -1;
    }

    public void printList() {
        PlayerNode currentNode = head;

        System.out.println("HEAD ");

        while (currentNode != null) {
            System.out.print(" -> " + currentNode.getPlayer());
            currentNode = currentNode.getNextPlayer();
        }
    }

    public void print() {
    }
}