package localstorage

class LocalStorage {
    companion object {
        var dataList = mutableListOf<MutableList<MutableMap<String, Any>>>()
    }
}