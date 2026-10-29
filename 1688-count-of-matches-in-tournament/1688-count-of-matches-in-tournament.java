class Solution {
    public int numberOfMatches(int n) {
        int teams = n;
        int matches = 0;
        int count = 0;
        while(teams >= 2){
            matches = teams/2;
            teams = teams - matches;
            count += matches;
        }
        return count;
    }
}