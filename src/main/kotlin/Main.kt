import console_program.ConsoleProgram

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var loopStatus = true
            while (loopStatus) {
                print("enter command: ")
                val input = readLine()!!.split(' ')
                //                println("input = $input")

                if (input.isNotEmpty()) {
                    val action = input[0]
                    if (action.isNotEmpty() && action.uppercase() != "Q") {
                        performActions(input, action)
                    } else {
                        loopStatus = false

                        val consoleProgram = ConsoleProgram(null, null)
                        consoleProgram.quit()
                    }
                }
            }
        }

        private fun performActions(input: List<String>, action: String) {
            if (action.uppercase() == "C") {
                val width = input[1].toInt()
                val height = input[2].toInt()

                val consoleProgram = ConsoleProgram(width, height)
                consoleProgram.createCanvas()
            } else if (action.uppercase() == "L") {
                val x1 = input[1].toInt()
                val y1 = input[2].toInt()
                val x2 = input[3].toInt()
                val y2 = input[4].toInt()

                val consoleProgram = ConsoleProgram(null, null)
                consoleProgram.drawLine(x1, y1, x2, y2)
            } else if (action.uppercase() == "R") {
                val x1 = input[1].toInt()
                val y1 = input[2].toInt()
                val x2 = input[3].toInt()
                val y2 = input[4].toInt()

                val consoleProgram = ConsoleProgram(null, null)
                consoleProgram.drawRectangle(x1, y1, x2, y2)
            } else if (action.uppercase() == "B") {
                val x = input[1].toInt()
                val y = input[2].toInt()
                val c = input[3]

                val consoleProgram = ConsoleProgram(null, null)
                consoleProgram.fill(x, y, c)
            }
        }
    }
}