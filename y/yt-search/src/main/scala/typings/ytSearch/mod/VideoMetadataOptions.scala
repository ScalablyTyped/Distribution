package typings.ytSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoMetadataOptions extends StObject {
  
  var videoId: String
}
object VideoMetadataOptions {
  
  inline def apply(videoId: String): VideoMetadataOptions = {
    val __obj = js.Dynamic.literal(videoId = videoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoMetadataOptions]
  }
  
  extension [Self <: VideoMetadataOptions](x: Self) {
    
    inline def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
  }
}
