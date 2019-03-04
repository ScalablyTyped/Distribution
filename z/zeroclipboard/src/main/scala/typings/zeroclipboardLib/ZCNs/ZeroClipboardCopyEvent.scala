package typings
package zeroclipboardLib.ZCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZeroClipboardCopyEvent extends ZeroClipboardEvent {
  var clipboardData: zeroclipboardLib.Anon_ClearData
}

object ZeroClipboardCopyEvent {
  @scala.inline
  def apply(
    clipboardData: zeroclipboardLib.Anon_ClearData,
    currentTarget: stdLib.HTMLObjectElement,
    relatedTarget: stdLib.HTMLElement,
    target: stdLib.HTMLElement,
    timeStamp: scala.Double,
    `type`: java.lang.String,
    client: ZeroClipboardClient = null
  ): ZeroClipboardCopyEvent = {
    val __obj = js.Dynamic.literal(clipboardData = clipboardData, currentTarget = currentTarget, relatedTarget = relatedTarget, target = target, timeStamp = timeStamp)
    __obj.updateDynamic("type")(`type`)
    if (client != null) __obj.updateDynamic("client")(client)
    __obj.asInstanceOf[ZeroClipboardCopyEvent]
  }
}

