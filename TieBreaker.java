Class myGame {

    public static Main(){
        int A = 5; // Target Score
        int B = 6; // Player 1
        int C = 4; // Player 2
        
        if(tieBreaker(A,B,C)){
            System.out.println("Tie Breaker!!");
        }
    }

    public static boolean tieBreaker(int target, int scoreA, int scoreB){
        boolean result = true;
        int highScore, lowScore;

        if (scoreA > scoreB) {
            highScore = scoreA;
            lowScore = scoreB;
        } else {
            highScore = scoreB;
            lowScore = scoreA;
        }

        if( highScore < target ) { result = false; }
        else {
            if (
            lowScore <= target -2 && 
            lowScore <= highScore -2  )
            { 
            result = false;
            }
        }
    return result;
    }
    
}
