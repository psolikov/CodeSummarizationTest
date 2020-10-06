package ru.hse.spb.solikov

import kotlin.system.exitProcess

fun print_help(){
    print("Usage: ./gradlew run --args='<REPO-URL>'")
}

/*
* Сперва обходим все файлы и заносим в базу,
* затем обрабатываем только диффы, тем самым эффективно обходим все что надо
* */

fun main(args: Array<String>) {
    if (args.size != 1) {
        print_help()
        exitProcess(1)
    }
    val exampleUrl = "https://github.com/eclipse/jgit.git"
    GitHandler.cloneRepo(exampleUrl)
}