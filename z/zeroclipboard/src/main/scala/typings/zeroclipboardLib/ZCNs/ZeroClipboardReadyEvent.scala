package typings
package zeroclipboardLib.ZCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZeroClipboardReadyEvent extends ZeroClipboardEvent {
  var message: java.lang.String
  var version: java.lang.String
}

object ZeroClipboardReadyEvent {
  @scala.inline
  def apply(
    currentTarget: stdLib.HTMLObjectElement,
    message: java.lang.String,
    relatedTarget: stdLib.HTMLElement,
    target: stdLib.HTMLElement,
    timeStamp: scala.Double,
    `type`: java.lang.String,
    version: java.lang.String,
    client: ZeroClipboardClient = null
  ): ZeroClipboardReadyEvent = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget, message = message, relatedTarget = relatedTarget, target = target, timeStamp = timeStamp, version = version)
    __obj.updateDynamic("type")(`type`)
    if (client != null) __obj.updateDynamic("client")(client)
    __obj.asInstanceOf[ZeroClipboardReadyEvent]
  }
}

