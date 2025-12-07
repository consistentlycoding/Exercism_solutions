public class Lasagna {
    public int expectedMinutesInOven() {
        int expectedMinutesInOven = 40;
        return expectedMinutesInOven; 
    }

    public int remainingMinutesInOven(int actualMinutesInOven) {
        return expectedMinutesInOven() - actualMinutesInOven;
    }

    public int preparationTimeInMinutes(int numOfLayersAdded) {
        return numOfLayersAdded * 2; 
    }

    public int totalTimeInMinutes(int numOfLayersAdded, int numOfMinInOven) {
        return preparationTimeInMinutes(numOfLayersAdded) + numOfMinInOven;
    }
}
