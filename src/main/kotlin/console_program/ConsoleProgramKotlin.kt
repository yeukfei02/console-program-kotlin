package console_program

import kotlin.system.exitProcess
import localstorage.LocalStorage

class ConsoleProgram(width: Int?, height: Int?) : BaseClass(width, height) {
    fun createCanvas() {
        val dataList = mutableListOf<MutableList<MutableMap<String, Any>>>()

        // setup dataList
        for (y in 0..height + 1) {
            val yList = mutableListOf<MutableMap<String, Any>>()

            // first row and last row
            if (y == 0 || y == height + 1) {
                for (x in 0..width + 1) {
                    val data = mutableMapOf<String, Any>()
                    data["x"] = x + 1
                    data["y"] = y + 1
                    data["value"] = "-"
                    yList.add(data)
                }
            } // other rows
            else {
                for (x in 0..width + 1) {
                    // first item and last item
                    if (x == 0 || x == width + 1) {
                        val data = mutableMapOf<String, Any>()
                        data["x"] = x + 1
                        data["y"] = y + 1
                        data["value"] = "|"
                        yList.add(data)
                    } // other items
                    else {
                        val data = mutableMapOf<String, Any>()
                        data["x"] = x + 1
                        data["y"] = y + 1
                        data["value"] = " "
                        yList.add(data)
                    }
                }
            }

            dataList.add(yList)
        }

        // store dataList
        storeDataList(dataList)

        // retrieve dataList
        retrieveDataList()
    }

    fun drawLine(x1: Int, y1: Int, x2: Int, y2: Int) {
        val localStorageDataList = LocalStorage.dataList

        val dataList = mutableListOf<MutableList<MutableMap<String, Any>>>()
        if (localStorageDataList.isNotEmpty()) {
            localStorageDataList.forEachIndexed { i, data ->
                val rows = mutableListOf<MutableMap<String, Any>>()

                if (i == y1 || i == y2) {
                    data.forEachIndexed { _, item ->
                        if ((item["x"] == x1 + 1 && item["y"] == y1 + 1) ||
                            (item["x"] == x2 + 1 && item["y"] == y2 + 1) ||
                            ((item["x"] as Int) > x1 + 1 && (item["x"] as Int) < x2 + 1) ||
                            ((item["y"] as Int) > y1 + 1 && (item["y"] as Int) < y2 + 1)
                        ) {
                            item["value"] = "x"
                        } else if (((item["x"] as Int) > 1 && (item["x"] as Int) <= x1 + 1) ||
                            ((item["x"] as Int) > 1 && (item["x"] as Int) <= x2 + 1)
                        ) {
                            item["cannotFill"] = true
                        }

                        rows.add(item)
                    }
                } else {
                    data.forEachIndexed { _, item -> rows.add(item) }
                }

                dataList.add(rows)
            }
        }

        // store dataList
        storeDataList(dataList)

        // retrieve dataList
        retrieveDataList()
    }

    fun drawRectangle(x1: Int, y1: Int, x2: Int, y2: Int) {
        val localStorageDataList = LocalStorage.dataList

        val dataList = mutableListOf<MutableList<MutableMap<String, Any>>>()
        if (localStorageDataList.isNotEmpty()) {
            localStorageDataList.forEachIndexed { i, data ->
                val rows = mutableListOf<MutableMap<String, Any>>()

                if (i in y1..y2) {
                    if (i != y2 - y1) {
                        data.forEachIndexed { _, item ->
                            if ((item["x"] as Int) >= x1 + 1 && (item["x"] as Int) <= x2 + 1) {
                                item["value"] = "x"
                            }

                            rows.add(item)
                        }
                    } else {
                        data.forEachIndexed { _, item ->
                            if (item["x"] == x1 + 1 || item["x"] == x2 + 1) {
                                item["value"] = "x"
                            } else if ((item["x"] as Int) > x1 + 1 && (item["x"] as Int) < x2 + 1) {
                                item["cannotFill"] = true
                            }

                            rows.add(item)
                        }
                    }
                } else {
                    data.forEachIndexed { _, item -> rows.add(item) }
                }

                dataList.add(rows)
            }
        }

        // store dataList
        storeDataList(dataList)

        // retrieve dataList
        retrieveDataList()
    }

    fun fill(x: Int, y: Int, c: String) {
        val localStorageDataList = LocalStorage.dataList

        val dataList = mutableListOf<MutableList<MutableMap<String, Any>>>()
        if (localStorageDataList.isNotEmpty()) {
            localStorageDataList.forEachIndexed { i, data ->
                val rows = mutableListOf<MutableMap<String, Any>>()

                if (i > 0 && i <= y + 1) {
                    data.forEachIndexed { _, item ->
                        if (((item["x"] as Int) > 1 && (item["x"] as Int) <= x + 1) ||
                            ((item["x"] as Int) > x + 1 && (item["x"] as Int) <= width + 1)
                        ) {
                            if (item["value"] === " " && !item.containsKey("cannotFill")) {
                                item["value"] = c
                            }
                        }

                        rows.add(item)
                    }
                } else {
                    data.forEachIndexed { _, item -> rows.add(item) }
                }

                dataList.add(rows)
            }
        }

        // store dataList
        storeDataList(dataList)

        // retrieve dataList
        retrieveDataList()
    }

    fun quit() {
        println("quitting...")

        exitProcess(-1)
    }
}