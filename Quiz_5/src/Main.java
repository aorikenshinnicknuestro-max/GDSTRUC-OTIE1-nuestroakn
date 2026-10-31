public class Main {
    public static int findCharacterid(String[] trialPodiums, String targetName) {
        //Comments
        // Sorted or Unsorted - it is UNSORTED
        // 1) The pointer is initializing at the beginning and the end of the array
        // 2) The pointer's position is check if it matches the target value and return index
        // 3) The front pointer is moved forward as the back pointer moves backward in the center
        // 4) Repeat as the pointers cross, returning -1 is the value cannot be found
        // The Time Complexity is - O(n)
        int hope = 0;
        int despair = trialPodiums.length -1;

        while (hope <= despair) {
            if (trialPodiums[hope].equals(targetName)) {
                return hope;
            }

            if (trialPodiums[despair].equals(targetName)) {
                return despair;
            }

            hope++;
            despair--;
        }

        return -1;
    }

    public static void main(String[] args) {
        String[] classTrial = { //Class Trial 6 Living Students
        "Makoto Naegi",
        "Kyoko Kirgiri",
        "Byakuya Togami",
        "Toko Fukawa",
        "Aoi Asahina",
        "Yasuhiro Hagakure",
        };

        String targetCharacter = "Yasuhiro Hagakure";

        int resultIndex = findCharacterid(classTrial, targetCharacter);

        if (resultIndex != -1) {
            System.out.println("Success! " + targetCharacter + " found at randomized Class Trial Podium " + resultIndex);
        } else {
            System.out.println(targetCharacter + " is not present in this Class Trial 6 nor in the Game.");
        }
    }
}


