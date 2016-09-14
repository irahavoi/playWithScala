//A bad way: Imperative
/*
var i = 0

while(i < args.length){
  println(args(i) + " ")
  i += 1
}*/

//A slightly shorter way
/*

for(arg <- args)
  println(arg)
*/

//A better way: Functional
//args.foreach(arg => print(arg + " "))

//Even shorter way. Shorthand way - when function takes a single argument
args.foreach(print)