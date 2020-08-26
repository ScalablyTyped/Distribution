package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessagerOption extends js.Object {
  var actions: js.UndefOr[js.Array[Action]] = js.native
  var close: js.UndefOr[Boolean] = js.native
  var contentClass: js.UndefOr[String] = js.native
  var cssClass: js.UndefOr[String] = js.native
  var fade: js.UndefOr[Boolean] = js.native
  var icon: js.UndefOr[String] = js.native
  var message: js.UndefOr[String] = js.native
  var onAction: js.UndefOr[OnActionFunc] = js.native
  var parent: js.UndefOr[String] = js.native
  var placement: js.UndefOr[String] = js.native
  var scale: js.UndefOr[Boolean] = js.native
  var show: js.UndefOr[Boolean] = js.native
  var time: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[MessagerTypeEnum | String] = js.native
}

object MessagerOption {
  @scala.inline
  def apply(): MessagerOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessagerOption]
  }
  @scala.inline
  implicit class MessagerOptionOps[Self <: MessagerOption] (val x: Self) extends AnyVal {
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
    def setActionsVarargs(value: Action*): Self = this.set("actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: js.Array[Action]): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    @scala.inline
    def setClose(value: Boolean): Self = this.set("close", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    @scala.inline
    def setContentClass(value: String): Self = this.set("contentClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentClass: Self = this.set("contentClass", js.undefined)
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setFade(value: Boolean): Self = this.set("fade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFade: Self = this.set("fade", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setOnAction(value: (/* name */ String, /* action */ String, /* messager */ Messager) => js.Any): Self = this.set("onAction", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnAction: Self = this.set("onAction", js.undefined)
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    @scala.inline
    def setPlacement(value: String): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    @scala.inline
    def setScale(value: Boolean): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
    @scala.inline
    def setType(value: MessagerTypeEnum | String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

