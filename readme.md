# Algorithms Problems and Solutions

## Intro

Interview: Algorithms problems and solutions written in Java, including test cases.

## Algorithms problems content

- All problems and solutions are in directory: `src/main/java/algo/*`
- All test cases are in directory: `src/test/java/algo/*`

## Content

### Array - `/array`

1. `ArrayChunk.java`

   Chunk Array: Given an array and chunk size, divide the array into many subarrays where each subarray is of length size.

2. `Intersect.java`

   Compute two arrays' intersection.

3. `IsSorted.java`

   Test if a given array of numbers is sorted.

4. `Matrix.java`

   Produce a spiral matrix.

5. `Missing.java`

   Missing Number: Take an unsorted array of unique numbers from to n and return the missing number in the sequence.

6. `MovingZeroes.java`

   Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

7. `PlusOne.java`

   Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

8. `RemoveDuplicates.java`

   Given an array with sorted numbers, remove duplicated numbers in-place.

9. `RotateArray.java`

   Given an array, rotate the array to the right by k steps in-place.

10. `RotateImage.java`

    Rotate an image represented by a n\*n array by 90 degrees (clockwise).

11. `SockMerchant.java`

    Find out how many pairs of socks with matching colors(represented by numbers in an array).

12. `SparseArray.java`

    Compress and decompress a sparse array.

13. `TwoSum.java`

    Return indices of the two numbers whose sum equals to a target.

14. `ValidSudoku.java`

    Determine if a 9x9 Sudoku board is valid.

### Assorted - `/assorted`

1. `DrawPyramid.java`

   Pyramid: Print a pyramid shape with n levels using # character and space on its left and right side.

2. `DrawSteps.java`

   Steps: Print a step shape with n levels using # character and space(s) on the right.

3. `MaxProfit.java`

   Max profit: Given an array with each number representing a stock price for one day, work out an algorithm to find the max profit.

### Dynamic - `/dynamic`

**_TODO_**

1. `GridTraveler.java`

   A traveler begins in the top-left corner of a m x n grid and ends in the bottom-right corner. You may only move down or right. Calculate how many routes you can travel to the goal.

2. `CanSum.java`

   Given a target number and an array of numbers. Write algorithm to indicate if it is possible to generate the target sum using the numbers from the array. You may use an element of the array as many times as needed.

3. `HowSum.java`

   Follow up the previous problem: return an array containing one combination of the numbers that add up to exactly the target number.

4. `BestSum.java`

   Follow up the prvious problem: return an array that has the shortest combination of the numbers.

5. `CanConstruct.java`

   Given a target string and an array of strings. Write algorithm to indicate if it is possible to construct the target string by concatenating elements of the strings array.

6. `CountConstruct.java`

   Follow up the previous problem: return the number of ways to construct the target string by concatenating elements of the strings array.

7. `AllConstruct.java`

   Follow up the previous problem: return all the ways to construct the target string by concatenating elements of the strings array.

### Data structure - `/ds`

**_TODO_**

### Maths - `/mathematics`

1. `Fibonacci.java`

   Print the n-th number in the fibonacci series

2. `Fizzbuzz.java`

   Fizzbuzz: print the numbers from 1 to N.<br>
   But for multiples of 3 print 'fizz' instead of the number;<br>
   for multiples of 5, print 'buzz';<br>
   for numbers which are multiples of both 3 and 5, print 'fizzbuzz'<br>

3. `IsPrime.java`

   Test if a given number is a prime

### String - `/string`

1. `Anagrams.java`

   Anagrams: Check to see if two strings are anagrams of each other

2. `Capitalize.java`

   Capitalize: Capitalize each word in a string

3. `CheckPermutation.java`

   Check two strings are permutation

4. `CountVowels.java`

   Count the number of vowels used in a string

5. `Isbalanced.java`

   Test if curly braces in a string is matched

6. `IsUnique.java`

   Determine if a string has all unique characters

7. `MakeAnagrams.java`

   Determine the minimum number of characters deletions required to make two strings anagrams.

8. `Maxchar.java`

   Get the character that most commonly appears in a given string

9. `OneAway.java`

   Check if one string is one edit away from the other string

10. `Palindrome.java`

    Test a string is a palindrome(its reversed string is exactly the same as itself)

11. `PalindromePermutation.java`

    Check if a string is a permutation of a palindrome

12. `RemoveVowels.java`

    Remove vowels of a string

13. `ReverseInteger.java`

    Reverse an integer

14. `ReverseString.java`

    Reverse a string

15. `StringCompression.java`

    Compress a string

16. `StringRotation.java`

    Check if one string is the rotation of the other string, using isSubString function

### Sorting - `/sorting`

1. `BubbleSorting.java`

   Implement bubble sorting

2. `MergeSorting.java`

   Implement merge sorting

3. `SelectionSorting.java`

   Implmenet selection sorting

### Searching - `/searching`

1. `LinearSearch.js`

   Implement linear search

2. `BinarySearch.js`

   Implement binary search

3. `JumpSearch.js`

   Implmenet jump search

4. `InterpolationSearch.js`

   Implement interpolation search

5. `ExponentialSearch.js`

   Implement exponential search

## Development Environment

- Java 11
- [Gradle](https://docs.gradle.org/current/userguide/installation.html)
- [Junit5](https://junit.org/junit5/docs/current/user-guide/#overview)

## How to run

Under project root directory: `./gradlew test`.
