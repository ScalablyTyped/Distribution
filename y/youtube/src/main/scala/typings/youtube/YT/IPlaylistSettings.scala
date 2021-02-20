package typings.youtube.YT

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPlaylistSettings extends VideoOrPlaylistSettings {
  
  /**
    * Start index of the playlist, if not 0.
    */
  var index: js.UndefOr[Double] = js.native
  
  /**
    * Identifier for the listType videos list.
    */
  var list: String = js.native
  
  /**
    * Which type of content loads in the player.
    */
  var listType: js.UndefOr[ListType] = js.native
}
object IPlaylistSettings {
  
  @scala.inline
  def apply(list: String): IPlaylistSettings = {
    val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlaylistSettings]
  }
  
  @scala.inline
  implicit class IPlaylistSettingsMutableBuilder[Self <: IPlaylistSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListType(value: ListType): Self = StObject.set(x, "listType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListTypeUndefined: Self = StObject.set(x, "listType", js.undefined)
  }
}
