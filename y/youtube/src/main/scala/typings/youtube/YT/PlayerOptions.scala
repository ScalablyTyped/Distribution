package typings.youtube.YT

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayerOptions extends StObject {
  
  /**
    * Handlers for events fired by the player.
    */
  var events: js.UndefOr[Events] = js.undefined
  
  /**
    * Player height
    */
  var height: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Points host to correct origin for CORS
    */
  var host: js.UndefOr[String] = js.undefined
  
  /**
    * Player parameters.
    */
  var playerVars: js.UndefOr[PlayerVars] = js.undefined
  
  /**
    * ID of the video to load.
    */
  var videoId: js.UndefOr[String] = js.undefined
  
  /**
    * Player width.
    */
  var width: js.UndefOr[String | Double] = js.undefined
}
object PlayerOptions {
  
  inline def apply(): PlayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlayerOptions] (val x: Self) extends AnyVal {
    
    inline def setEvents(value: Events): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setPlayerVars(value: PlayerVars): Self = StObject.set(x, "playerVars", value.asInstanceOf[js.Any])
    
    inline def setPlayerVarsUndefined: Self = StObject.set(x, "playerVars", js.undefined)
    
    inline def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
    
    inline def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
    
    inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
