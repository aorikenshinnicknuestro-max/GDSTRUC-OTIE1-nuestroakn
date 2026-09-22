public class PlayerLinkedList {
    private PlayerNode head;

    public void add(Player player){
        PlayerNode node = new PlayerNode(player);
        node.setNextPlayer(head);
        head = node;
    }

    public void printList(){
        PlayerNode currentNode = head;

        System.out.println("HEAD ");

        while (currentNode != null) {
            System.out.print(" -> " + currentNode.getPlayer());
            currentNode = currentNode.getNextPlayer();
        }
    }
}
