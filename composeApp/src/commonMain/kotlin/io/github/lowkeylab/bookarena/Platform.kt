package io.github.lowkeylab.bookarena

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform