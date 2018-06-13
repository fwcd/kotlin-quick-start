fun pow(a: Int, b: Int): Int {
	var result = 1

	for (i in 0 until b) {
		result *= a
	}

	return result
}

fun add(a: Int, b: Int): Int {
	return a + b
}

fun main(args: Array<String>) {
	println(pow(2, 4))
}