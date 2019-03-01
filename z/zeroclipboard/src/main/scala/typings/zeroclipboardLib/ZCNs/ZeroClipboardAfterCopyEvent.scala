package typings
package zeroclipboardLib.ZCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZeroClipboardAfterCopyEvent extends ZeroClipboardEvent {
  var data: Dictionary[java.lang.String]
  var errors: js.Array[_]
  var success: Dictionary[scala.Boolean]
}

object ZeroClipboardAfterCopyEvent {
  @scala.inline
  def apply(
    currentTarget: stdLib.HTMLObjectElement,
    data: Dictionary[java.lang.String],
    errors: js.Array[_],
    relatedTarget: stdLib.HTMLElement,
    success: Dictionary[scala.Boolean],
    target: stdLib.HTMLElement,
    timeStamp: scala.Double,
    `type`: java.lang.String,
    client: ZeroClipboardClient = null
  ): ZeroClipboardAfterCopyEvent = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("currentTarget")(currentTarget)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("errors")(errors)
    __obj.updateDynamic("relatedTarget")(relatedTarget)
    __obj.updateDynamic("success")(success)
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("timeStamp")(timeStamp)
    if (client != null) __obj.updateDynamic("client")(client)
    __obj.asInstanceOf[ZeroClipboardAfterCopyEvent]
  }
}

