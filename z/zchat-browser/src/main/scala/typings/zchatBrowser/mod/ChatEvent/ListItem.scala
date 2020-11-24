package typings.zchatBrowser.mod.ChatEvent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListItem extends js.Object {
  
  var action: Action = js.native
  
  var heading: String = js.native
  
  var image_url: js.UndefOr[String] = js.native
  
  var paragraph: String = js.native
}
object ListItem {
  
  @scala.inline
  def apply(action: Action, heading: String, paragraph: String): ListItem = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], paragraph = paragraph.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItem]
  }
  
  @scala.inline
  implicit class ListItemOps[Self <: ListItem] (val x: Self) extends AnyVal {
    
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
    def setAction(value: Action): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeading(value: String): Self = this.set("heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParagraph(value: String): Self = this.set("paragraph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage_url(value: String): Self = this.set("image_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage_url: Self = this.set("image_url", js.undefined)
  }
}
