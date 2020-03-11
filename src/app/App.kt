package app

import react.*
import react.dom.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div {
            a("https:twitter.com/soeki_ng", "_blank", "Link") {
                +"Twitter"
            }
            a("https:github.com/Soeking", "_blank", "Link") {
                +"git hub"
            }
        }
    }
}

fun RBuilder.app() = child(App::class) {}
