# Lab7-Ibrahim
Lab7 repo
#Answers to Questions in README.md
1.<i>What is the purpose of the various auxiliary methods populateList, populateFifoList, and ReverseLines.printReverse?</i>
- <p><b>populateList:</b> to perform recursion taking an object from the node and adding that object to the "result" list.</p>
- <p><b>populateFifoList:</b> to perform recursion taking an object passed by the node and adding that object to the first index in the "result" list.</p>
- <p><b>ReservesLine.printReverse:</b> Takes input from Scanner and echoes it then prints it out recursively in reversed order.</p>

2.<i>Why do these methods need to have arguments, and how does the argument change from one recursive call to the next?</i>
- <p><b>populateList:</b> This method needs a node(top node of linkedStack named "curr") and an Arraylist during the first method call. Inside the method we add "curr.data" and we change the first argument to point to the next node ("curr.next") in the recursive function call and the base case is that the top node ("curr") doesn't equal "null". </p>
-  <p><b>populateFifoList:</b> This method needs a node(top node of linkedStack named "curr") and an Arraylist during the first method call. Inside the method we add "curr.data" to the first index of the list (index:0) and we change the first argument to point to the next node ("curr.next") in the recursive function call while the base case is that the top node ("curr") doesn't equal "null". </p>
- <p><b>ReservesLine.printReverse:</b> The method needs an input (being a String here) for an argument to know what to print out. The user's input determine how the arguments differ for the recursive call.</p>

3.<i>What are the time and space complexity of each of the populateList populateFifoList methods, as well as ReverseLines.printReverse?</i>
- <p><b>populateList:</b> O(n) since an ArrayList is being used with the Linked stack, the time complexity is limited by O(n)</p>
- <p><b>populateFifoList:</b> O(n) same as populateList.</p>
- <p><b>ReservesLine.printReverse:</b> O(n) n being the input variable.
4.<i>Which of these methods can be implemented using while loops?</i>
- <p><b>populateList:</b> yes, but we have to be careful from ending up in an infinite loop, that could be done by checking the size variable of the node or result.size().</p>
- <p><b>populateFifoList:</b> yes, the same for populateList </p>
- <p><b>ReservesLine.printReverse:</b> yes, that is what was used in ReverseLines.java .</p>
