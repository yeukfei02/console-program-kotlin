package console_program

import localstorage.LocalStorage

open class BaseClass(width: Int?, height: Int?) {
    var width = 0
    var height = 0

    init {
        if (width != null) {
            this.width = width
        } else {
            this.width = 20
        }

        if (height != null) {
            this.height = height
        } else {
            this.height = 4
        }
    }

    fun storeDataList(dataList: MutableList<MutableList<MutableMap<String, Any>>>) {
        LocalStorage.dataList = dataList
    }

    fun retrieveDataList() {
        val localStorageDataList = LocalStorage.dataList

        if (localStorageDataList.isNotEmpty()) {
            val valueList =
                localStorageDataList.map { it ->
                    val rows = it.map { it["value"] }
                    rows.joinToString("")
                }

            if (valueList.isNotEmpty()) {
                for (value in valueList) {
                    println(value)
                }
            }
        }
    }
}