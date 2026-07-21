class Solution {
    public int largestAltitude(int[] gain) {
        int currentAltitude = 0;
        int maxAltitude = 0; // Starts at 0 because the trip begins at 0

        for (int i = 0; i < gain.length; i++) {
            // Update current altitude
            currentAltitude += gain[i];

            // Record the highest point reached so far
            if (currentAltitude > maxAltitude) {
                maxAltitude = currentAltitude;
            }
        }

        return maxAltitude;
    }
}