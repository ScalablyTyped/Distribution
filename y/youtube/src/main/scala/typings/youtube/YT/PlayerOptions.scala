package typings.youtube.YT

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlayerOptions extends StObject {
  
  /**
    * Handlers for events fired by the player.
    */
  var events: js.UndefOr[Events] = js.native
  
  /**
    * Player height
    */
  var height: js.UndefOr[String | Double] = js.native
  
  /**
    * Points host to correct origin for CORS
    */
  var host: js.UndefOr[String] = js.native
  
  /**
    * Player parameters.
    */
  var playerVars: js.UndefOr[PlayerVars] = js.native
  
  /**
    * ID of the video to load.
    */
  var videoId: js.UndefOr[String] = js.native
  
  /**
    * Player width.
    */
  var width: js.UndefOr[String | Double] = js.native
}
object PlayerOptions {
  
  @scala.inline
  def apply(): PlayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayerOptions]
  }
  
  @scala.inline
  implicit class PlayerOptionsMutableBuilder[Self <: PlayerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: Events): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setPlayerVars(value: PlayerVars): Self = StObject.set(x, "playerVars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerVarsUndefined: Self = StObject.set(x, "playerVars", js.undefined)
    
    @scala.inline
    def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
