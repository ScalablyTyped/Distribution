package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalOptionsBackdropString extends js.Object {
  var backdrop: js.UndefOr[String] = js.native
   // for "static"
  var keyboard: js.UndefOr[Boolean] = js.native
  var remote: js.UndefOr[String] = js.native
  var show: js.UndefOr[Boolean] = js.native
}

object ModalOptionsBackdropString {
  @scala.inline
  def apply(): ModalOptionsBackdropString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalOptionsBackdropString]
  }
  @scala.inline
  implicit class ModalOptionsBackdropStringOps[Self <: ModalOptionsBackdropString] (val x: Self) extends AnyVal {
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
    def setBackdrop(value: String): Self = this.set("backdrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackdrop: Self = this.set("backdrop", js.undefined)
    @scala.inline
    def setKeyboard(value: Boolean): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboard: Self = this.set("keyboard", js.undefined)
    @scala.inline
    def setRemote(value: String): Self = this.set("remote", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemote: Self = this.set("remote", js.undefined)
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
  }
  
}

