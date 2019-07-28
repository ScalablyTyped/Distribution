package typings.zeroclipboard.ZCNs

import typings.std.HTMLElement
import typings.std.HTMLObjectElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZeroClipboardAfterCopyEvent extends ZeroClipboardEvent {
  var data: Dictionary[String]
  var errors: js.Array[_]
  var success: Dictionary[Boolean]
}

object ZeroClipboardAfterCopyEvent {
  @scala.inline
  def apply(
    currentTarget: HTMLObjectElement,
    data: Dictionary[String],
    errors: js.Array[_],
    relatedTarget: HTMLElement,
    success: Dictionary[Boolean],
    target: HTMLElement,
    timeStamp: Double,
    `type`: String,
    client: ZeroClipboardClient = null
  ): ZeroClipboardAfterCopyEvent = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget, data = data, errors = errors, relatedTarget = relatedTarget, success = success, target = target, timeStamp = timeStamp)
    __obj.updateDynamic("type")(`type`)
    if (client != null) __obj.updateDynamic("client")(client)
    __obj.asInstanceOf[ZeroClipboardAfterCopyEvent]
  }
}

