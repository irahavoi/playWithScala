val oneTwo = List(1,2)
val threeFour = List(3,4)

// ::: <- list concatenation
val oneTwoThreeFour = oneTwo ::: threeFour

println(oneTwo + " and " + threeFour + " were not modified")

println(oneTwoThreeFour + "<- is a new list");

// :: <- "cons" operator. Cons prepends a new element to the beginning of the existing lists
val zeroOnewTwoThreeFour = 0 :: oneTwoThreeFour

println(zeroOnewTwoThreeFour + "<- Prepending a zero")


//Remmber that every operator in Scala is a method: 1 :: twoThree is the same as twoThree.::(1)


//Also remember that, unlike in Java, in Scala lists are immutable: e.g. every time you add something to a list, you actually create a new list, not modifying the old one


//Appending to a list:
val zeroOnewTwoThreeFourFive = zeroOnewTwoThreeFour :+ 5
println(zeroOnewTwoThreeFourFive + "<- Warning: Appending to a list(using : methiod) is O(n) (the time it takes to append to a list grows linearly with the size of the list.)")

println("So, it's more efficient to prepend to a list and then reverse it: ")
//We need Nil at the end, as it is an empty list that has a :: method:
val nums = 7 :: 6 :: 5 :: 4 :: 3 :: 2 :: 1 :: Nil

println(nums.reverse + "<- prepending (using :: method) takes O(1)")


//Getting elements at index () <- parentheses are used instead of square brackets. The secret is that parentheses are the shortcut version of .apply()
println("nums(0): " + nums(0))

//Same effect:
println("nums(0): " + nums.apply(0))




//Some interesting list methods:
var strList = "Will" :: "Fill" :: "Untill" :: Nil //creating a new list with the 3 given values
println(strList)


println(strList.count(s => s.length == 4)) //Counts all strings that have 4 letters. Returns 2.


strList = strList :+ "OneMoreOn theRight"
strList = strList :+ "OneMoreOn theRight(2)"
strList = "OneMoreOnTheRight" :: strList

println(strList)


//Dropping the first element:
strList = strList.drop(1)

//Dropping two elements on the right:
strList = strList.dropRight(2)

println(strList + "<- After dropping")



println(strList.exists(s => s == "Fill")) //checks if the given string exists

strList = strList.filter(s => s.length == 4)

println(strList + "<- After filtering (4 letters)")

strList.foreach(s => println(">>" + s + "<<"))

println(strList.forall(s => s.length == 4)) //Checks if all strings consist of 4 letters

println(strList.map(s => s + "y"))