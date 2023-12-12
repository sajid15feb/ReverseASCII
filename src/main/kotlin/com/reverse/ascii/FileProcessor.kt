package com.reverse.ascii

import java.io.*


 class FileProcessor {
    @Throws(IOException::class)
    fun reverseFileContents(inputFilePath: String?, outputFilePath: String?) {
        BufferedReader(FileReader(inputFilePath)).use { reader ->
            BufferedWriter(FileWriter(outputFilePath)).use { writer ->
                val content = StringBuilder()
                var line: String?
                while (reader.readLine().also { line = it } != null) {
                    content.append(line)
                }
                val reversedContent = content.reverse().toString()
                writer.write(reversedContent)
            }
        }
    }
}