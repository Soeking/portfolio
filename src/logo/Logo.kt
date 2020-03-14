package logo

import react.RBuilder
import react.dom.img

@JsModule("src/logo/soeking_icon.jpg")
external val icon: dynamic

fun RBuilder.logo() {
    img("icon", icon as? String, "Logo") {}
}