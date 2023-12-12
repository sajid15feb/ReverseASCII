package com.reverse.ascii

import java.lang.Exception

fun main(args: Array<String>) {
    try {
        FileProcessor().reverseFileContents("src/main/resources/input.txt", "src/main/resources/output.txt")
    }catch (e:Exception) {
        print(e.message)
    }
}

