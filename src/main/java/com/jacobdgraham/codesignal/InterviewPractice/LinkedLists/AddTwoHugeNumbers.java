package com.jacobdgraham.codesignal.InterviewPractice.LinkedLists;

import java.util.Stack;

public final class AddTwoHugeNumbers {
    
    public final SinglyLinkedListNode<Integer> solution(SinglyLinkedListNode<Integer> a, SinglyLinkedListNode<Integer> b) {
        Stack<Integer> stackListNodesA = new Stack<Integer>();
        Stack<Integer> stackListNodesB = new Stack<Integer>();
        SinglyLinkedListNode<Integer> resultListOfAddedIntegers = null;
        // A carry variable is needed when we add two integer values and get a sum larger than 9 (the largest value for a number)
        int carryVariable = 0;
        int resultOfSumPlusCarry = 0;
        
        while (a != null) {
            stackListNodesA.push(a.getValue());
            a = a.next;
        }
        while (b != null) {
            stackListNodesB.push(b.getValue());
            b = b.next;
        }
        
        while (!stackListNodesA.isEmpty() || !stackListNodesB.isEmpty() || carryVariable > 0) {
            int valueA;
            int valueB;
            
            if (stackListNodesA.isEmpty()) {
                valueA = 0;
            } else {
                valueA = stackListNodesA.pop();
            }
            if (stackListNodesB.isEmpty()) {
                valueB = 0;
            } else {
                valueB = stackListNodesB.pop();
            }
            
            resultOfSumPlusCarry = valueA + valueB + carryVariable;
            // 10000 is used because the maximum result for a variable is 9999, so we want to prevent that from happening
            carryVariable = resultOfSumPlusCarry / 10000; 
            int modulusResultOfSumPlusCarryForNode = resultOfSumPlusCarry % 10000;
            
            /*
            Use the modulus operator on the digit that is larger than 9999 to get the non-carry portion of the integer (the last digit). 
            */
            SinglyLinkedListNode<Integer> newNodeToInsert = new SinglyLinkedListNode<>(modulusResultOfSumPlusCarryForNode);
            newNodeToInsert.next = resultListOfAddedIntegers;
            resultListOfAddedIntegers = newNodeToInsert;
        }
        
        return resultListOfAddedIntegers;
    }
}
