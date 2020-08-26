package typings.zeroclipboard.ZC

import typings.std.HTMLElement
import typings.std.HTMLObjectElement
import typings.zeroclipboard.anon.ClearData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZeroClipboardCopyEvent extends ZeroClipboardEvent {
  var clipboardData: ClearData = js.native
}

object ZeroClipboardCopyEvent {
  @scala.inline
  def apply(
    clipboardData: ClearData,
    currentTarget: HTMLObjectElement,
    relatedTarget: HTMLElement,
    target: HTMLElement,
    timeStamp: Double,
    `type`: String
  ): ZeroClipboardCopyEvent = {
    val __obj = js.Dynamic.literal(clipboardData = clipboardData.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], relatedTarget = relatedTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZeroClipboardCopyEvent]
  }
  @scala.inline
  implicit class ZeroClipboardCopyEventOps[Self <: ZeroClipboardCopyEvent] (val x: Self) extends AnyVal {
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
    def setClipboardData(value: ClearData): Self = this.set("clipboardData", value.asInstanceOf[js.Any])
  }
  
}

