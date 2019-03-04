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
    val __obj = js.Dynamic.literal(currentTarget = currentTarget, relatedTarget = relatedTarget, target = target, timeStamp = timeStamp)
    __obj.updateDynamic("type")(`type`)
    if (client != null) __obj.updateDynamic("client")(client)
    __obj.asInstanceOf[ZeroClipboardEvent]
  }
}

