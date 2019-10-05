package typings.zeroclipboard.ZC

import typings.std.HTMLElement
import typings.std.HTMLObjectElement
import typings.zeroclipboard.Anon_ClearData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZeroClipboardCopyEvent extends ZeroClipboardEvent {
  var clipboardData: Anon_ClearData
}

object ZeroClipboardCopyEvent {
  @scala.inline
  def apply(
    clipboardData: Anon_ClearData,
    currentTarget: HTMLObjectElement,
    relatedTarget: HTMLElement,
    target: HTMLElement,
    timeStamp: Double,
    `type`: String,
    client: ZeroClipboardClient = null
  ): ZeroClipboardCopyEvent = {
    val __obj = js.Dynamic.literal(clipboardData = clipboardData, currentTarget = currentTarget, relatedTarget = relatedTarget, target = target, timeStamp = timeStamp)
    __obj.updateDynamic("type")(`type`)
    if (client != null) __obj.updateDynamic("client")(client)
    __obj.asInstanceOf[ZeroClipboardCopyEvent]
  }
}

