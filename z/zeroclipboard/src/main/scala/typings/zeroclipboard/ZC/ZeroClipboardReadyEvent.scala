package typings.zeroclipboard.ZC

import typings.std.HTMLElement
import typings.std.HTMLObjectElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZeroClipboardReadyEvent extends ZeroClipboardEvent {
  var message: String
  var version: String
}

object ZeroClipboardReadyEvent {
  @scala.inline
  def apply(
    currentTarget: HTMLObjectElement,
    message: String,
    relatedTarget: HTMLElement,
    target: HTMLElement,
    timeStamp: Double,
    `type`: String,
    version: String,
    client: ZeroClipboardClient = null
  ): ZeroClipboardReadyEvent = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget, message = message, relatedTarget = relatedTarget, target = target, timeStamp = timeStamp, version = version)
    __obj.updateDynamic("type")(`type`)
    if (client != null) __obj.updateDynamic("client")(client)
    __obj.asInstanceOf[ZeroClipboardReadyEvent]
  }
}

