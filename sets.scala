import scala.collection.mutable

//Remember that Scala offers different implementation for mutable and immutables sets and maps (immutable is used by default)
val movieSet = mutable.Set("movie1", "movie2")
movieSet += "movie3" // += <- is an actual method defined on mutable sets.
println(movieSet)
