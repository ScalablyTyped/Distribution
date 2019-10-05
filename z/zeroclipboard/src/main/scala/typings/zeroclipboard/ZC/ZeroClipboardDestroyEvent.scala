package typings.zeroclipboard.ZC

import typings.std.HTMLElement
import typings.std.HTMLObjectElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZeroClipboardDestroyEvent extends ZeroClipboardEvent {
  var data: Dictionary[String]
  var success: Dictionary[Boolean]
}

object ZeroClipboardDestroyEvent {
  @scala.inline
  def apply(
    currentTarget: HTMLObjectElement,
    data: Dictionary[String],
    relatedTarget: HTMLElement,
    success: Dictionary[Boolean],
    target: HTMLElement,
    timeStamp: Double,
    `type`: String,
    client: ZeroClipboardClient = null
  ): ZeroClipboardDestroyEvent = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget, data = data, relatedTarget = relatedTarget, success = success, target = target, timeStamp = timeStamp)
    __obj.updateDynamic("type")(`type`)
    if (client != null) __obj.updateDynamic("client")(client)
    __obj.asInstanceOf[ZeroClipboardDestroyEvent]
  }
}

