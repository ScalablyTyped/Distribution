package typings.ytSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaylistMetadataOptions extends StObject {
  
  var listId: String
}
object PlaylistMetadataOptions {
  
  inline def apply(listId: String): PlaylistMetadataOptions = {
    val __obj = js.Dynamic.literal(listId = listId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistMetadataOptions]
  }
  
  extension [Self <: PlaylistMetadataOptions](x: Self) {
    
    inline def setListId(value: String): Self = StObject.set(x, "listId", value.asInstanceOf[js.Any])
  }
}
