package ru.hse.spb.solikov

import java.io.File

import org.eclipse.jgit.api.Git
import org.eclipse.jgit.api.errors.GitAPIException
import org.eclipse.jgit.api.errors.InvalidRemoteException
import org.eclipse.jgit.api.errors.TransportException

class GitHandler {
    companion object {
        private const val resourcesPath = "src/main/resources"

        fun cloneRepo(url: String) {
            Git.cloneRepository()
                .setURI(url)
                .setDirectory(File(resourcesPath))
                .call()
        }


    }
}