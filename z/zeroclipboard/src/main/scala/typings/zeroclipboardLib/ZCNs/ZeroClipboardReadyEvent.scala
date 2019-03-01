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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("currentTarget")(currentTarget)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("relatedTarget")(relatedTarget)
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("timeStamp")(timeStamp)
    __obj.updateDynamic("version")(version)
    if (client != null) __obj.updateDynamic("client")(client)
    __obj.asInstanceOf[ZeroClipboardReadyEvent]
  }
}

