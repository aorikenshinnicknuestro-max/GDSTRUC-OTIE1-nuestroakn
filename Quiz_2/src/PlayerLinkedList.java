public class PlayerLinkedList {
    private PlayerNode head;
    int size = 0;

    public void add(Player player) {
        PlayerNode node = new PlayerNode(player);
        node.setNextPlayer(head);
        head = node;
        size++;
    }

    public Player removeFirst()
    {
        if(head == null)
        {
            return null;
        }

        PlayerNode nodeToRemove = head;
        head = head.getNextPlayer();

        Player removedPlayer = nodeToRemove.getPlayer();

        nodeToRemove.setNextPlayer(null);
        size--;

        return removedPlayer;
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
            if(current.getPlayer().equals(player))
            {
                return true;
            }
            current = current.getNextPlayer();
        }
        return false;
    }

    public int indexOf(Player player) {
        PlayerNode current = head;
        int index = 0;
        while (current != null){
            if (current.getPlayer().equals(player)) {
                return index;
            }
            current = current.getNextPlayer();
            index++;
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
        System.out.println(" -> null");
    }
}