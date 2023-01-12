package typings.ytSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoMetadataOptions extends StObject {
  
  /** @default 'US' */
  var gl: js.UndefOr[String] = js.undefined
  
  /** @default 'en' */
  var hl: js.UndefOr[String] = js.undefined
  
  var videoId: String
}
object VideoMetadataOptions {
  
  inline def apply(videoId: String): VideoMetadataOptions = {
    val __obj = js.Dynamic.literal(videoId = videoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoMetadataOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoMetadataOptions] (val x: Self) extends AnyVal {
    
    inline def setGl(value: String): Self = StObject.set(x, "gl", value.asInstanceOf[js.Any])
    
    inline def setGlUndefined: Self = StObject.set(x, "gl", js.undefined)
    
    inline def setHl(value: String): Self = StObject.set(x, "hl", value.asInstanceOf[js.Any])
    
    inline def setHlUndefined: Self = StObject.set(x, "hl", js.undefined)
    
    inline def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
  }
}
