package typings.zeroclipboard.ZC

import typings.std.HTMLElement
import typings.std.HTMLObjectElement
import typings.zeroclipboard.anon.ClearData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZeroClipboardCopyEvent extends ZeroClipboardEvent {
  var clipboardData: ClearData
}

object ZeroClipboardCopyEvent {
  @scala.inline
  def apply(
    clipboardData: ClearData,
    currentTarget: HTMLObjectElement,
    relatedTarget: HTMLElement,
    target: HTMLElement,
    timeStamp: Double,
    `type`: String,
    client: ZeroClipboardClient = null
  ): ZeroClipboardCopyEvent = {
    val __obj = js.Dynamic.literal(clipboardData = clipboardData.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], relatedTarget = relatedTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZeroClipboardCopyEvent]
  }
}

