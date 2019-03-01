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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("clipboardData")(clipboardData)
    __obj.updateDynamic("currentTarget")(currentTarget)
    __obj.updateDynamic("relatedTarget")(relatedTarget)
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("timeStamp")(timeStamp)
    if (client != null) __obj.updateDynamic("client")(client)
    __obj.asInstanceOf[ZeroClipboardCopyEvent]
  }
}

