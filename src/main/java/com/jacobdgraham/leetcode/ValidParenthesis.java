package com.jacobdgraham.leetcode;

import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid
 * 
 * An input string is valid if:
 *  1. Open brackets must be closed by the same type of brackets
 *  2. Open brackets must be closed in the correct order
 *  3. Every close bracket has a corresponding open bracket of the same type
 * 
 * Example 1:
 *  Input: s = "()"
 *  Output: true
 * 
 * Example 2:
 *  Input: s = "()[]{}"
 *  Output: true
 * 
 * Example 3:
 *  Input: s = "(]"
 *  Output: false
 * 
 * Constraints:
 *  1 <= s.length <= 10^4
 *  s consists of parenthesis only '()[]{}'
 */
public final class ValidParenthesis {
    
    /**
     * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid
     * 
     * An input string is valid if:
     *  1. Open brackets must be closed by the same type of brackets
     *  2. Open brackets must be closed in the correct order
     *  3. Every close bracket has a corresponding open bracket of the same type
     */
    public final boolean isValid(final String s) {
        final Stack<Character> character_stack = new Stack<>();
        final char[] string_chars = s.toCharArray();
        for (char string_character : string_chars) {
            if (string_character == '(') {
                character_stack.push(')');
            } else if (string_character == '{') {
                character_stack.push('}');
            } else if (string_character == '[') {
                character_stack.push(']');
            } else if (character_stack.empty() || character_stack.pop() != string_character) {
                return false;
            }
        }
        return character_stack.empty();
    }
}
