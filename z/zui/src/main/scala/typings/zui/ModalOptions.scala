package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * bootstrap
  */
@js.native
trait ModalOptions extends js.Object {
  var backdrop: js.UndefOr[Boolean | String] = js.native
  var keyboard: js.UndefOr[Boolean] = js.native
  var remote: js.UndefOr[String] = js.native
  var show: js.UndefOr[Boolean] = js.native
}

object ModalOptions {
  @scala.inline
  def apply(): ModalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalOptions]
  }
  @scala.inline
  implicit class ModalOptionsOps[Self <: ModalOptions] (val x: Self) extends AnyVal {
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
    def setBackdrop(value: Boolean | String): Self = this.set("backdrop", value.asInstanceOf[js.Any])
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

