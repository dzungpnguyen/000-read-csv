import scala.io.Source

val filename="file.csv"
for (line <- Source.fromFile(filename).getLines){
	println(line)
}