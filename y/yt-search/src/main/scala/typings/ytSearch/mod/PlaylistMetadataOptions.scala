package typings.ytSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaylistMetadataOptions extends StObject {
  
  /** @default 'US' */
  var gl: js.UndefOr[String] = js.undefined
  
  /** @default 'en' */
  var hl: js.UndefOr[String] = js.undefined
  
  var listId: String
}
object PlaylistMetadataOptions {
  
  inline def apply(listId: String): PlaylistMetadataOptions = {
    val __obj = js.Dynamic.literal(listId = listId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistMetadataOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlaylistMetadataOptions] (val x: Self) extends AnyVal {
    
    inline def setGl(value: String): Self = StObject.set(x, "gl", value.asInstanceOf[js.Any])
    
    inline def setGlUndefined: Self = StObject.set(x, "gl", js.undefined)
    
    inline def setHl(value: String): Self = StObject.set(x, "hl", value.asInstanceOf[js.Any])
    
    inline def setHlUndefined: Self = StObject.set(x, "hl", js.undefined)
    
    inline def setListId(value: String): Self = StObject.set(x, "listId", value.asInstanceOf[js.Any])
  }
}
