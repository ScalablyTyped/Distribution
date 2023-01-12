package typings.youtube.YT

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPlaylistSettings
  extends StObject
     with VideoOrPlaylistSettings {
  
  /**
    * Start index of the playlist, if not 0.
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    * Identifier for the listType videos list.
    */
  var list: String
  
  /**
    * Which type of content loads in the player.
    */
  var listType: js.UndefOr[ListType] = js.undefined
}
object IPlaylistSettings {
  
  inline def apply(list: String): IPlaylistSettings = {
    val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlaylistSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPlaylistSettings] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListType(value: ListType): Self = StObject.set(x, "listType", value.asInstanceOf[js.Any])
    
    inline def setListTypeUndefined: Self = StObject.set(x, "listType", js.undefined)
  }
}
