package app

import link.link
import logo.logo
import react.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        logo()
        link()
    }
}

fun RBuilder.app() = child(App::class) {}
