// Description
//  Imagine you are building a Facebook clone.
//  Write a function called ‘mostVotes’ that —
// 1) takes in an int array called votesPerUser as a parameter, where each element in the array represents the number of votes received by the user, with the userId at that index.
// 2) returns the index of the user with the most votes.
// 3) if there are ties between users with the most votes, returns the index of the first user with the most votes. For example, if the 0th and 7th users in the array both have 20 votes, and both have the most number of votes, they return 0. 

// For example, if the array is - 2 4 3 5 6 3
// Output would be - User with the most votes is User: 4

class UserMaxVotes {
  public static void main(String args[]) {
    int[] votes = {1,2,34,5,6,7,8,9,10,11,12,13,14,15};
    int userWithMostVotes = mostVotes(votes); 
    System.out.println("User with the most votes is User: " + userWithMostVotes);  
    }
    
    // write the function mostVotes() here.
    public static int mostVotes(int[] votesPerUser){
        int index = 0, maxNum=votesPerUser[0];
        for(int i=1; i<votesPerUser.length; i++){
            if(votesPerUser[i] > maxNum){
                maxNum = votesPerUser[i];
                index = i;
            }
        }
        return index;
    }
    
}
