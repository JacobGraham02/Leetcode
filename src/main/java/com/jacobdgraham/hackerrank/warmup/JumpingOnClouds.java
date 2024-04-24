package com.jacobdgraham.hackerrank.warmup;

import java.util.List;

/**
 * There is a new mobile game that starts with consecutively numbered clouds. Some of the clouds are thunderheads and others are cumulus. The player can jump on any cumulus cloud having a number that is equal to the number of the current cloud plus or

. The player must avoid the thunderheads. Determine the minimum number of jumps it will take to jump from the starting postion to the last cloud. It is always possible to win the game.

For each game, you will get an array of clouds numbered
if they are safe or

if they must be avoided.

Example
Index the array from . The number on each cloud is its index in the list so the player must avoid the clouds at indices and . They could follow these two paths: or . The first path takes jumps while the second takes . Return

.

Function Description

Complete the jumpingOnClouds function in the editor below.

jumpingOnClouds has the following parameter(s):

    int c[n]: an array of binary integers

Returns

    int: the minimum number of jumps required

 */
public class JumpingOnClouds {
    
    /**
     * There is a new mobile game that starts with consecutively numbered clouds. Some of the clouds are thunderheads and others are cumulus. The player can jump on any cumulus cloud having a number that is equal to the number of the current cloud plus or

. The player must avoid the thunderheads. Determine the minimum number of jumps it will take to jump from the starting postion to the last cloud. It is always possible to win the game.

For each game, you will get an array of clouds numbered
if they are safe or

if they must be avoided.

Example
Index the array from . The number on each cloud is its index in the list so the player must avoid the clouds at indices and . They could follow these two paths: or . The first path takes jumps while the second takes . Return

.

Function Description

Complete the jumpingOnClouds function in the editor below.

jumpingOnClouds has the following parameter(s):

    int c[n]: an array of binary integers

Returns

    int: the minimum number of jumps required

     * @param c the list containing integers of 0 and 1, where 0 represents a cloud that can be jumped onto, and 1 does not
     * @return the minimum number of jumps required
     */
    public final int jumpingOnClouds(List<Integer> c) {
        int numberOfJumps = 0;
        int currentListIterator = 0;
        
        /**
        * We have to check for +2 because we potentially are skipping over 2 clouds,
        * and check if the i+2th position is equal to 0 (for valid cloud jumps).
        * Because the number of jumps will always be increasing if the currentListIterator target position is 0,
        * we will always increment the number of jumps, but will increment the currentListIterator by 1 or 2
        */
        while (currentListIterator < c.size() - 1) {
            if (currentListIterator + 2 < c.size() && c.get(currentListIterator+2) == 0) {
                currentListIterator+=2;
            } else {
                currentListIterator+=1;
            }
            numberOfJumps++;
        }
        return numberOfJumps;
    }
}
