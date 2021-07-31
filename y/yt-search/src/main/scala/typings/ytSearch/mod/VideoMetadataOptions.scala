package typings.ytSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoMetadataOptions extends StObject {
  
  var videoId: String
}
object VideoMetadataOptions {
  
  @scala.inline
  def apply(videoId: String): VideoMetadataOptions = {
    val __obj = js.Dynamic.literal(videoId = videoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoMetadataOptions]
  }
  
  @scala.inline
  implicit class VideoMetadataOptionsMutableBuilder[Self <: VideoMetadataOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
  }
}
