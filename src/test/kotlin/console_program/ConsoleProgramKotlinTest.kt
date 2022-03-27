package console_program

import localstorage.LocalStorage
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

@TestMethodOrder(MethodOrderer.OrderAnnotation::class)
class ConsoleProgramTest {
    private lateinit var consoleProgram: ConsoleProgram

    @BeforeEach
    fun setupConsoleProgram() {
        consoleProgram = ConsoleProgram(20, 4)
    }

    @Test
    @Order(1)
    fun consoleProgramInstance() {
        assertNotNull(consoleProgram)
    }

    @Test
    @Order(2)
    fun createCanvas() {
        consoleProgram.createCanvas()

        val dataList = LocalStorage.dataList
        assertNotNull(dataList)
        assertTrue(dataList.size > 0)

        val firstRow = dataList[0].map { it["value"] }
        val secondRow = dataList[1].map { it["value"] }
        val thirdRow = dataList[2].map { it["value"] }
        val fourthRow = dataList[3].map { it["value"] }
        val fifthRow = dataList[4].map { it["value"] }
        val lastRow = dataList[5].map { it["value"] }

        val firstRowActual =
            listOf(
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
            )
        assertEquals(firstRow, firstRowActual)
        val secondRowActual =
            listOf(
                "|",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                "|"
            )
        assertEquals(secondRow, secondRowActual)
        val thirdRowActual =
            listOf(
                "|",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                "|"
            )
        assertEquals(thirdRow, thirdRowActual)
        val fourthRowActual =
            listOf(
                "|",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                "|"
            )
        assertEquals(fourthRow, fourthRowActual)
        val fifthRowActual =
            listOf(
                "|",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                "|"
            )
        assertEquals(fifthRow, fifthRowActual)
        val lastRowActual =
            listOf(
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
            )
        assertEquals(lastRow, lastRowActual)
    }

    @Test
    @Order(3)
    fun drawHorizontalLine() {
        consoleProgram.drawLine(1, 2, 6, 2)

        val dataList = LocalStorage.dataList
        assertNotNull(dataList)
        assertTrue(dataList.size > 0)

        val firstRow = dataList[0].map { it["value"] }
        val secondRow = dataList[1].map { it["value"] }
        val thirdRow = dataList[2].map { it["value"] }
        val fourthRow = dataList[3].map { it["value"] }
        val fifthRow = dataList[4].map { it["value"] }
        val lastRow = dataList[5].map { it["value"] }

        val firstRowActual =
            listOf(
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
            )
        assertEquals(firstRow, firstRowActual)
        val secondRowActual =
            listOf(
                "|",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                "|"
            )
        assertEquals(secondRow, secondRowActual)
        val thirdRowActual =
            listOf(
                "|",
                "x",
                "x",
                "x",
                "x",
                "x",
                "x",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                "|"
            )
        assertEquals(thirdRow, thirdRowActual)
        val fourthRowActual =
            listOf(
                "|",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                "|"
            )
        assertEquals(fourthRow, fourthRowActual)
        val fifthRowActual =
            listOf(
                "|",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                "|"
            )
        assertEquals(fifthRow, fifthRowActual)
        val lastRowActual =
            listOf(
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
            )
        assertEquals(lastRow, lastRowActual)
    }

    @Test
    @Order(4)
    fun drawVerticalLine() {
        consoleProgram.drawLine(6, 3, 6, 4)

        val dataList = LocalStorage.dataList
        assertNotNull(dataList)
        assertTrue(dataList.size > 0)

        val firstRow = dataList[0].map { it["value"] }
        val secondRow = dataList[1].map { it["value"] }
        val thirdRow = dataList[2].map { it["value"] }
        val fourthRow = dataList[3].map { it["value"] }
        val fifthRow = dataList[4].map { it["value"] }
        val lastRow = dataList[5].map { it["value"] }

        val firstRowActual =
            listOf(
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
            )
        assertEquals(firstRow, firstRowActual)
        val secondRowActual =
            listOf(
                "|",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                "|"
            )
        assertEquals(secondRow, secondRowActual)
        val thirdRowActual =
            listOf(
                "|",
                "x",
                "x",
                "x",
                "x",
                "x",
                "x",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                "|"
            )
        assertEquals(thirdRow, thirdRowActual)
        val fourthRowActual =
            listOf(
                "|",
                " ",
                " ",
                " ",
                " ",
                " ",
                "x",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                "|"
            )
        assertEquals(fourthRow, fourthRowActual)
        val fifthRowActual =
            listOf(
                "|",
                " ",
                " ",
                " ",
                " ",
                " ",
                "x",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                "|"
            )
        assertEquals(fifthRow, fifthRowActual)
        val lastRowActual =
            listOf(
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
            )
        assertEquals(lastRow, lastRowActual)
    }

    @Test
    @Order(5)
    fun drawRectangle() {
        consoleProgram.drawRectangle(14, 1, 18, 3)

        val dataList = LocalStorage.dataList
        assertNotNull(dataList)
        assertTrue(dataList.size > 0)

        val firstRow = dataList[0].map { it["value"] }
        val secondRow = dataList[1].map { it["value"] }
        val thirdRow = dataList[2].map { it["value"] }
        val fourthRow = dataList[3].map { it["value"] }
        val fifthRow = dataList[4].map { it["value"] }
        val lastRow = dataList[5].map { it["value"] }

        val firstRowActual =
            listOf(
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
            )
        assertEquals(firstRow, firstRowActual)
        val secondRowActual =
            listOf(
                "|",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                "x",
                "x",
                "x",
                "x",
                "x",
                " ",
                " ",
                "|"
            )
        assertEquals(secondRow, secondRowActual)
        val thirdRowActual =
            listOf(
                "|",
                "x",
                "x",
                "x",
                "x",
                "x",
                "x",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                "x",
                " ",
                " ",
                " ",
                "x",
                " ",
                " ",
                "|"
            )
        assertEquals(thirdRow, thirdRowActual)
        val fourthRowActual =
            listOf(
                "|",
                " ",
                " ",
                " ",
                " ",
                " ",
                "x",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                "x",
                "x",
                "x",
                "x",
                "x",
                " ",
                " ",
                "|"
            )
        assertEquals(fourthRow, fourthRowActual)
        val fifthRowActual =
            listOf(
                "|",
                " ",
                " ",
                " ",
                " ",
                " ",
                "x",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                " ",
                "|"
            )
        assertEquals(fifthRow, fifthRowActual)
        val lastRowActual =
            listOf(
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
            )
        assertEquals(lastRow, lastRowActual)
    }

    @Test
    @Order(6)
    fun fill() {
        consoleProgram.fill(10, 3, "o")

        val dataList = LocalStorage.dataList
        assertNotNull(dataList)
        assertTrue(dataList.size > 0)

        val firstRow = dataList[0].map { it["value"] }
        val secondRow = dataList[1].map { it["value"] }
        val thirdRow = dataList[2].map { it["value"] }
        val fourthRow = dataList[3].map { it["value"] }
        val fifthRow = dataList[4].map { it["value"] }
        val lastRow = dataList[5].map { it["value"] }

        val firstRowActual =
            listOf(
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
            )
        assertEquals(firstRow, firstRowActual)
        val secondRowActual =
            listOf(
                "|",
                "o",
                "o",
                "o",
                "o",
                "o",
                "o",
                "o",
                "o",
                "o",
                "o",
                "o",
                "o",
                "o",
                "x",
                "x",
                "x",
                "x",
                "x",
                "o",
                "o",
                "|"
            )
        assertEquals(secondRow, secondRowActual)
        val thirdRowActual =
            listOf(
                "|",
                "x",
                "x",
                "x",
                "x",
                "x",
                "x",
                "o",
                "o",
                "o",
                "o",
                "o",
                "o",
                "o",
                "x",
                " ",
                " ",
                " ",
                "x",
                "o",
                "o",
                "|"
            )
        assertEquals(thirdRow, thirdRowActual)
        val fourthRowActual =
            listOf(
                "|",
                " ",
                " ",
                " ",
                " ",
                " ",
                "x",
                "o",
                "o",
                "o",
                "o",
                "o",
                "o",
                "o",
                "x",
                "x",
                "x",
                "x",
                "x",
                "o",
                "o",
                "|"
            )
        assertEquals(fourthRow, fourthRowActual)
        val fifthRowActual =
            listOf(
                "|",
                " ",
                " ",
                " ",
                " ",
                " ",
                "x",
                "o",
                "o",
                "o",
                "o",
                "o",
                "o",
                "o",
                "o",
                "o",
                "o",
                "o",
                "o",
                "o",
                "o",
                "|"
            )
        assertEquals(fifthRow, fifthRowActual)
        val lastRowActual =
            listOf(
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
                "-",
            )
        assertEquals(lastRow, lastRowActual)
    }
}