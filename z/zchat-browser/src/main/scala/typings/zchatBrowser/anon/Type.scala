package typings.zchatBrowser.anon

import typings.zchatBrowser.mod.ChatEvent.Button
import typings.zchatBrowser.mod.ChatEvent.ListItem
import typings.zchatBrowser.mod.ChatEvent.StructuredMessage
import typings.zchatBrowser.zchatBrowserStrings.LIST_TEMPLATE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Type extends StructuredMessage {
  var buttons: js.Array[Button] = js.native
  var items: js.Array[ListItem] = js.native
  var `type`: LIST_TEMPLATE = js.native
}

object Type {
  @scala.inline
  def apply(buttons: js.Array[Button], items: js.Array[ListItem], `type`: LIST_TEMPLATE): Type = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  @scala.inline
  implicit class TypeOps[Self <: Type] (val x: Self) extends AnyVal {
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
    def setButtonsVarargs(value: Button*): Self = this.set("buttons", js.Array(value :_*))
    @scala.inline
    def setButtons(value: js.Array[Button]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: ListItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[ListItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: LIST_TEMPLATE): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

