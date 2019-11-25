package typings.zeroclipboard.ZC

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
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], relatedTarget = relatedTarget.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZeroClipboardAfterCopyEvent]
  }
}

