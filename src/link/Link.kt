package link

import react.RBuilder
import react.dom.a
import react.dom.div

fun RBuilder.link(){
    div {
        a("https://twitter.com/soeki_ng", "_blank", "Link") {
            +"Twitter"
        }
        a("https://github.com/Soeking", "_blank", "Link") {
            +"git hub"
        }
    }
}