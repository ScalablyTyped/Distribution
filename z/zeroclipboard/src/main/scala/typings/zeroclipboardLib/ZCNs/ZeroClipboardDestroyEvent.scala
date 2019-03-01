package typings
package zeroclipboardLib.ZCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZeroClipboardDestroyEvent extends ZeroClipboardEvent {
  var data: Dictionary[java.lang.String]
  var success: Dictionary[scala.Boolean]
}

object ZeroClipboardDestroyEvent {
  @scala.inline
  def apply(
    currentTarget: stdLib.HTMLObjectElement,
    data: Dictionary[java.lang.String],
    relatedTarget: stdLib.HTMLElement,
    success: Dictionary[scala.Boolean],
    target: stdLib.HTMLElement,
    timeStamp: scala.Double,
    `type`: java.lang.String,
    client: ZeroClipboardClient = null
  ): ZeroClipboardDestroyEvent = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("currentTarget")(currentTarget)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("relatedTarget")(relatedTarget)
    __obj.updateDynamic("success")(success)
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("timeStamp")(timeStamp)
    if (client != null) __obj.updateDynamic("client")(client)
    __obj.asInstanceOf[ZeroClipboardDestroyEvent]
  }
}

