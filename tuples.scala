//Tuples is a useful data structure, resembling lists (also immutable) but in tuple you can store objects of different types.
//Very useful when you want to return several objects of different types from your method
var pair = (1001, "night")

println(pair._1) //Notice that _N numbers are 1-based, not 0-based (which is similar to Haskel and ML)
println(pair._2)