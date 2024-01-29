class AnnalynsInfiltration {

    // Fast attack: a fast attack can be made if the knight is sleeping, 
    // as it takes time for him to get his armor on, so he will be vulnerable.
    public static boolean canFastAttack(boolean knightIsAwake) {
        return knightIsAwake ? false : true;
    }

    // Spy: the group can be spied upon if at least one of them is awake. 
    // Otherwise, spying is a waste of time.

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return (knightIsAwake ||  archerIsAwake ||  prisonerIsAwake) ? true : false;
    }

    // Signal prisoner: the prisoner can be signalled using bird sounds if 
    // the prisoner is awake and the archer is sleeping, 
    // as archers are trained in bird signaling, so they could intercept the message.

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return (prisonerIsAwake && !archerIsAwake) ?  true : false;
    }

    // true if
    // If Annalyn has her pet dog with her she can rescue the prisoner if the archer is asleep. 
    // The knight is scared of the dog and the archer will not have time to get ready before Annalyn and the prisoner can escape.

    // If Annalyn does not have her dog then she and the prisoner must be very sneaky! 
    // Annalyn can free the prisoner if the prisoner is awake and the knight and archer are both sleeping,
    // but if the prisoner is sleeping they can't be rescued:
    // the prisoner would be startled by Annalyn's sudden appearance and wake up the knight and archer.

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if(petDogIsPresent && !archerIsAwake) {
            return true;
        } else if (!petDogIsPresent) {
            return (prisonerIsAwake && (!knightIsAwake && !archerIsAwake)) ? true : false;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(AnnalynsInfiltration.canFastAttack(false));
        System.out.println(AnnalynsInfiltration.canSpy(false, false, false));
        System.out.println(AnnalynsInfiltration.canSignalPrisoner(false, true));
        System.out.println(AnnalynsInfiltration.canFreePrisoner(false, false, true, true));

    }
}
