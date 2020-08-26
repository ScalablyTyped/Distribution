package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * modal trigger
  */
@js.native
trait ModalTriggerOption extends js.Object {
  var backdrop: js.UndefOr[Boolean] = js.native
  var broken: js.UndefOr[js.Function0[_]] = js.native
  var className: js.UndefOr[String] = js.native
  var fade: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[String] = js.native
  var hidden: js.UndefOr[js.Function0[_]] = js.native
  var icon: js.UndefOr[String] = js.native
  var iframe: js.UndefOr[String] = js.native
  var keyboard: js.UndefOr[Boolean] = js.native
  var loaded: js.UndefOr[js.Function0[_]] = js.native
  var loadingIcon: js.UndefOr[String] = js.native
  var moveable: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var onHide: js.UndefOr[js.Function0[_]] = js.native
  var onShow: js.UndefOr[js.Function0[_]] = js.native
  var postion: js.UndefOr[String] = js.native
  var rememberPos: js.UndefOr[Boolean] = js.native
  var remote: js.UndefOr[String] = js.native
  var show: js.UndefOr[js.Function0[_]] = js.native
  var showHeader: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
  var waittime: js.UndefOr[Double] = js.native
  var width: js.UndefOr[String] = js.native
}

object ModalTriggerOption {
  @scala.inline
  def apply(): ModalTriggerOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalTriggerOption]
  }
  @scala.inline
  implicit class ModalTriggerOptionOps[Self <: ModalTriggerOption] (val x: Self) extends AnyVal {
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
    def setBackdrop(value: Boolean): Self = this.set("backdrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackdrop: Self = this.set("backdrop", js.undefined)
    @scala.inline
    def setBroken(value: () => _): Self = this.set("broken", js.Any.fromFunction0(value))
    @scala.inline
    def deleteBroken: Self = this.set("broken", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setFade(value: Boolean): Self = this.set("fade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFade: Self = this.set("fade", js.undefined)
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHidden(value: () => _): Self = this.set("hidden", js.Any.fromFunction0(value))
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIframe(value: String): Self = this.set("iframe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIframe: Self = this.set("iframe", js.undefined)
    @scala.inline
    def setKeyboard(value: Boolean): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboard: Self = this.set("keyboard", js.undefined)
    @scala.inline
    def setLoaded(value: () => _): Self = this.set("loaded", js.Any.fromFunction0(value))
    @scala.inline
    def deleteLoaded: Self = this.set("loaded", js.undefined)
    @scala.inline
    def setLoadingIcon(value: String): Self = this.set("loadingIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadingIcon: Self = this.set("loadingIcon", js.undefined)
    @scala.inline
    def setMoveable(value: Boolean): Self = this.set("moveable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoveable: Self = this.set("moveable", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnHide(value: () => _): Self = this.set("onHide", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    @scala.inline
    def setOnShow(value: () => _): Self = this.set("onShow", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    @scala.inline
    def setPostion(value: String): Self = this.set("postion", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostion: Self = this.set("postion", js.undefined)
    @scala.inline
    def setRememberPos(value: Boolean): Self = this.set("rememberPos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRememberPos: Self = this.set("rememberPos", js.undefined)
    @scala.inline
    def setRemote(value: String): Self = this.set("remote", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemote: Self = this.set("remote", js.undefined)
    @scala.inline
    def setShow(value: () => _): Self = this.set("show", js.Any.fromFunction0(value))
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setShowHeader(value: Boolean): Self = this.set("showHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowHeader: Self = this.set("showHeader", js.undefined)
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setWaittime(value: Double): Self = this.set("waittime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaittime: Self = this.set("waittime", js.undefined)
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

