package typings.zeroclipboard.ZC

import typings.std.HTMLElement
import typings.std.HTMLObjectElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZeroClipboardAfterCopyEvent extends ZeroClipboardEvent {
  var data: Dictionary[String] = js.native
  var errors: js.Array[_] = js.native
  var success: Dictionary[Boolean] = js.native
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
    `type`: String
  ): ZeroClipboardAfterCopyEvent = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], relatedTarget = relatedTarget.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZeroClipboardAfterCopyEvent]
  }
  @scala.inline
  implicit class ZeroClipboardAfterCopyEventOps[Self <: ZeroClipboardAfterCopyEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setData(value: Dictionary[String]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorsVarargs(value: js.Any*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[_]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: Dictionary[Boolean]): Self = this.set("success", value.asInstanceOf[js.Any])
  }
  
}

