class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return knightIsAwake == false;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if (knightIsAwake && archerIsAwake && prisonerIsAwake) {
            return true; 
        } else if (knightIsAwake == false && archerIsAwake == false && prisonerIsAwake == false) {
            return false; 
        } else {
            return true; 
        }
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if (archerIsAwake == false && prisonerIsAwake == false) {
            return false;
        } else if (prisonerIsAwake == true && archerIsAwake == false) {
            return true;
        } else {
            return false; 
        }
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if (knightIsAwake == false && archerIsAwake == false && prisonerIsAwake == false && petDogIsPresent) {
            return true;
        } else if (knightIsAwake && archerIsAwake == false && prisonerIsAwake == false && petDogIsPresent) {
            return true; 
        } else if (knightIsAwake == false && archerIsAwake == false && prisonerIsAwake == true && petDogIsPresent) {
            return true;
        } else if (knightIsAwake && archerIsAwake == false && prisonerIsAwake && petDogIsPresent) {
            return true;
        } else if (knightIsAwake == false && archerIsAwake == false && prisonerIsAwake && petDogIsPresent == false) {
            return true;
        } else {
            return false; 
        }
    }
    
}
