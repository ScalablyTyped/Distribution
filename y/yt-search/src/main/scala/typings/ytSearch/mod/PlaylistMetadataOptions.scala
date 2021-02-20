package typings.ytSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaylistMetadataOptions extends StObject {
  
  var listId: String = js.native
}
object PlaylistMetadataOptions {
  
  @scala.inline
  def apply(listId: String): PlaylistMetadataOptions = {
    val __obj = js.Dynamic.literal(listId = listId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistMetadataOptions]
  }
  
  @scala.inline
  implicit class PlaylistMetadataOptionsMutableBuilder[Self <: PlaylistMetadataOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListId(value: String): Self = StObject.set(x, "listId", value.asInstanceOf[js.Any])
  }
}
