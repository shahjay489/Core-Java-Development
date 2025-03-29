package com.jayshah.chapter_8_Strings._4_String_Programs_1;

public class MaxOccurringChar {
    public static void main(String[] args) {
        String str = "this is demo";

        str = str.replaceAll("\\s", ""); // to replace spaces
        System.out.println(str);

        int[] arr = new int[126];

        System.out.println(arr[100]);               // 0
        System.out.println(str.charAt(0));          // t
        System.out.println(arr[str.charAt(0)]);     // 0
        // if  String str = "abcd";
        // Ascii value of str.charAt(0) is 97 because a is at 0 index
        // so, arr[97] = 0 because we just create array and at this time all index has stored 0 value.

        // traverse string
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
        }

        int max = -1;   // why negative bcs already 0 is present after creating the array
        char c = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (max < arr[str.charAt(i)]) {
                max = arr[str.charAt(i)];
                c = str.charAt(i);
            }
        }
        // here we can traverse array also but
        // we traverse string so ultimately we will reach at array index

        System.out.println("Maximum repeated character is : " + c);
    }
}

/*
Note:

- here you can use collection part: key value pair
- Or for more easy way, you can use array part

- Every character has its Ascii value


Array:
0 to 126 then extend it till 256 for special characters

   0  1  2  3  ..... 31 32......... 97 98 99 100.... 126 .... 256
  |--|--|--|--|-----|--|--|--|-----|--|--|--|---|---|---|-----|
    0  0  0  0        0  0  0        0  0  0  0       0       0


0.) String str = "adbcc bdcdd";
1.) create Array => int[] arr = new int[126];
    - here, every postion stores 0 value (once you create the new Array)
2.)  if you do System.out.println(arr[100]) then output is 0.
3.)  System.out.println(str.charAtr[0]) becasue at 0 index value is a stored you can see this string "adbcc bdcdd" we made.
        // if  String str = "abcd";
        // Ascii value of str.charAt(0) is 97 because a is at 0 index
        // so, arr[97] = 0 because we just create array and at this time all index has stored 0 value.


String str = "abdcadb";
int[] arr = new int[126];
for (int i = 0; i < str.length(); i++) {
    arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
}
            index : a b d c a d b
                    0 1 2 3 4 5 6

i=0:
   arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
   arr[str.charAt(0)] = arr[str.charAt(0)] + 1;
   arr[a] = arr[a] + 1;
         ASCII value of `a` is 97
   arr[97] = arr[97] + 1;
           = 0 + 1        (index 97 : initial value store is 0)
           = 1
   now at arr[97] i.e. index at 97 has value 1 stored.

------ i++ :

i=1:
   arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
   arr[str.charAt(1)] = arr[str.charAt(1)] + 1;
   arr[b] = arr[b] + 1;
         ASCII value of `b` is 98
   arr[98] = arr[98] + 1;
           = 0 + 1        (index 98 : initial value store is 0)
           = 1
   now at arr[98] i.e. index at 98 has value 1 stored.

------ i++ : i=2 : arr[str.charAt(2)] = arr[d] = arr[100] = 0 then 1

------ i++ : i=3 : arr[str.charAt(3)] = arr[c] = arr[99] = 0 then 1

------ i++ : i=4
   arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
   arr[str.charAt(4)] = arr[str.charAt(4)] + 1;
   arr[a] = arr[a] + 1;
         ASCII value of `a` is 97
   arr[97] = arr[97] + 1;
           = 1 + 1        (index 98 : value was 1 when i=0 that time stored)
           = 2
   now at arr[97] i.e. index at 97 has value 2 stored.

-------- i++ : same for d and b


    index : a b d c a d b
            0 1 2 3 4 5 6   index position

            a  b  c  d
            0  0  0  0 : when array created that time value
            2  2  1  2 : values after completed full for loop





 */