void main() {
    PlayerLinkedList playerList = new PlayerLinkedList();
    playerList.addonFront(new Player(1, "Goku", 500));
    playerList.addonFront(new Player(2, "Saitama", 999));
    playerList.addonFront(new Player(3, "Sakamoto", 10));

    playerList.printList();

    IO.println();
    IO.println("Size: " + playerList.Size());
    IO.println("Contains: " + playerList.contains(new Player(3, "Sakamoto", 10)));
    IO.println("Index : " + playerList.indexOf(new Player(3, "Sakamoto", 10)));

    playerList.removeFirst();

    IO.println();
    IO.println("After removing first:");
    playerList.print();

    IO.println();
    IO.println("Size: " + playerList.Size());
}