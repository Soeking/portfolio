package link

import react.RBuilder
import react.dom.a
import react.dom.div
import react.dom.img

@JsModule("src/link/GitHub.png")
external val github: dynamic

@JsModule("src/link/Twitter.png")
external val twitter: dynamic

fun RBuilder.link() {
    div {
        a("https://twitter.com/soeki_ng", "_blank", "Link") {
            img("twitter", twitter as? String, "LinkIcon") {}
        }
        a("https://github.com/Soeking", "_blank", "Link") {
            img("github", github as? String, "LinkIcon") {}
        }
    }
}
