import scala.io.Source

val filename="file.csv"
Source.fromfile(filename)
	.getLines
	.foreach(println)
