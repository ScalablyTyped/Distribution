package typings.zeroclipboard.ZC

import typings.std.HTMLElement
import typings.std.HTMLObjectElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZeroClipboardEvent extends js.Object {
  var client: js.UndefOr[ZeroClipboardClient] = js.undefined
  var currentTarget: HTMLObjectElement
  var relatedTarget: HTMLElement
  var target: HTMLElement
  var timeStamp: Double
  var `type`: String
}

object ZeroClipboardEvent {
  @scala.inline
  def apply(
    currentTarget: HTMLObjectElement,
    relatedTarget: HTMLElement,
    target: HTMLElement,
    timeStamp: Double,
    `type`: String,
    client: ZeroClipboardClient = null
  ): ZeroClipboardEvent = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget, relatedTarget = relatedTarget, target = target, timeStamp = timeStamp)
    __obj.updateDynamic("type")(`type`)
    if (client != null) __obj.updateDynamic("client")(client)
    __obj.asInstanceOf[ZeroClipboardEvent]
  }
}

