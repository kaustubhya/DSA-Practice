//         ListNode dummy = new ListNode(0);
//         ListNode scratchPad = dummy;
//         // b. normal appending
//         while(left!= null && right != null) {
//             // exception, compare the values here
//             if(left.val < right.val) {
//                // add smaller value
//                 scratchPad.next = left;
//                 left = left.next;
//             }
//             else {
//                 scratchPad.next = right;
//                 right = right.next;
//             }
//             // c. move to a fresh scratchPad node
//             scratchPad = scratchPad.next;
//         }
//         // d. if left or right nodes are unequal, take care of them
//         if(left != null) {
//             // it is still not done
//             scratchPad.next = left;
//         }
//         if(right != null) {
//             scratchPad.next = right;
//         }
//        /* e. finally return the dummy node,
//         don't return the 0th value as it is empty, return from the next value */
//         return dummy.next;
//     }
// }
​