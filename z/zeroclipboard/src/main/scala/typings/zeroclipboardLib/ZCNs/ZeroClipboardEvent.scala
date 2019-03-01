package typings
package zeroclipboardLib.ZCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZeroClipboardEvent extends js.Object {
  var client: js.UndefOr[ZeroClipboardClient] = js.undefined
  var currentTarget: stdLib.HTMLObjectElement
  var relatedTarget: stdLib.HTMLElement
  var target: stdLib.HTMLElement
  var timeStamp: scala.Double
  var `type`: java.lang.String
}

object ZeroClipboardEvent {
  @scala.inline
  def apply(
    currentTarget: stdLib.HTMLObjectElement,
    relatedTarget: stdLib.HTMLElement,
    target: stdLib.HTMLElement,
    timeStamp: scala.Double,
    `type`: java.lang.String,
    client: ZeroClipboardClient = null
  ): ZeroClipboardEvent = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("currentTarget")(currentTarget)
    __obj.updateDynamic("relatedTarget")(relatedTarget)
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("timeStamp")(timeStamp)
    if (client != null) __obj.updateDynamic("client")(client)
    __obj.asInstanceOf[ZeroClipboardEvent]
  }
}

