package typings.youtube.YT

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoOrPlaylistSettings extends StObject {
  
  /**
    * Time, in seconds from the end of the (first) video, when to end playing.
    */
  var endSeconds: js.UndefOr[Double] = js.undefined
  
  /**
    * Time, in seconds from the beginning of the (first) video, when to start playing.
    */
  var startSeconds: js.UndefOr[Double] = js.undefined
  
  /**
    * Suggested video player quality.
    */
  var suggestedQuality: js.UndefOr[SuggestedVideoQuality] = js.undefined
}
object VideoOrPlaylistSettings {
  
  inline def apply(): VideoOrPlaylistSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoOrPlaylistSettings]
  }
  
  extension [Self <: VideoOrPlaylistSettings](x: Self) {
    
    inline def setEndSeconds(value: Double): Self = StObject.set(x, "endSeconds", value.asInstanceOf[js.Any])
    
    inline def setEndSecondsUndefined: Self = StObject.set(x, "endSeconds", js.undefined)
    
    inline def setStartSeconds(value: Double): Self = StObject.set(x, "startSeconds", value.asInstanceOf[js.Any])
    
    inline def setStartSecondsUndefined: Self = StObject.set(x, "startSeconds", js.undefined)
    
    inline def setSuggestedQuality(value: SuggestedVideoQuality): Self = StObject.set(x, "suggestedQuality", value.asInstanceOf[js.Any])
    
    inline def setSuggestedQualityUndefined: Self = StObject.set(x, "suggestedQuality", js.undefined)
  }
}
