public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return 40; 
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actualMinutesInOven) {
        return expectedMinutesInOven() - actualMinutesInOven;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numOfLayersAdded) {
        return numOfLayersAdded * 2; 
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numOfLayersAdded, int numOfMinInOven) {
        return preparationTimeInMinutes(numOfLayersAdded) + numOfMinInOven;
    }
}
