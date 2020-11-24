package typings.ytSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaylistMetadataOptions extends js.Object {
  
  var listId: String = js.native
}
object PlaylistMetadataOptions {
  
  @scala.inline
  def apply(listId: String): PlaylistMetadataOptions = {
    val __obj = js.Dynamic.literal(listId = listId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistMetadataOptions]
  }
  
  @scala.inline
  implicit class PlaylistMetadataOptionsOps[Self <: PlaylistMetadataOptions] (val x: Self) extends AnyVal {
    
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
    def setListId(value: String): Self = this.set("listId", value.asInstanceOf[js.Any])
  }
}
