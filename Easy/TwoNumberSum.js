/**
array - The input number array where two index values will equal targetSum.
targetSum - Two number values added from array will equal this value.

For each known value X in the array, we are trying to find a value Y such that X + Y = targetSum.

First, create a dictionary (hash table) to store the results of our computations. Then, we have to loop
through the number array to iterate over potential targetSum summed values. A variable potentialMatch can
hold any potential summed numbers by subtracting the currently iterated number from the targetSum. Then, we 
will check if potentialMatch is in the hash table. If it is, we will return both the currently iterated
number and potentialMatch. If not, we will put that number into the hash table and set the value as true.

If no 2 numbers can be found that sum up to targetSum, we return an empty array. 
*/

function twoNumberSum(array, targetSum) {
    const nums_hash_table = {};
  
    for (const number of array) {
      const potentialMatch = targetSum - number;
      if (potentialMatch in nums_hash_table) {
        return [potentialMatch, number];
      } else {
        nums_hash_table[number] = true;
      }
    }
    return [];
  }