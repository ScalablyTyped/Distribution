package typings.zepto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZeptoAnimateSettings extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  var duration: js.UndefOr[Double] = js.native
  var easing: js.UndefOr[String] = js.native
}

object ZeptoAnimateSettings {
  @scala.inline
  def apply(): ZeptoAnimateSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZeptoAnimateSettings]
  }
  @scala.inline
  implicit class ZeptoAnimateSettingsOps[Self <: ZeptoAnimateSettings] (val x: Self) extends AnyVal {
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
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
  }
  
}

