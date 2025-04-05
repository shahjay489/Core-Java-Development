package com.jayshah.chapter_8_Strings._5_String_Programs_2;

/**
 * Note:
 * - You can not use the String methods
 * - spaces can be at last not between the characters
 */
public class RemCharFromStr {
    public static void main(String[] args) {
        String str = "Govardhan java";
        char rem_ch = 'a';

        char[] ch_arr = str.toCharArray();   // this method is outside the logical part
        // here we can use methods but in logical part we can not use it
        // this instruction is given by sir/supervisor-interview

        int j = 0, count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (ch_arr[i] != rem_ch) {
                ch_arr[j] = ch_arr[i];
                j++;
            } else {
                count++;
            }
        }
        System.out.print("Before while loop: ");
        System.out.println(ch_arr);
        System.out.println(count);
        while (count > 0) {
            ch_arr[j] = ' ';
//            ch_arr[j] = '\0';     //  try with this and see the result
            j++;
            count--;
        }

        System.out.println(ch_arr);
    }
}

/*

    Note: at the last we have some space same as counter number we can see
          - because we just shift character if we see 'a'
          - so at the last all 'a' are left in terms of the spaces
          - if we want to remove that extra spaces then we need to use trim() method
          - that method removes all spaces from the front and back side.
          - Remember it can not remove from between the characters
 */