package typings.youtube.YT

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoByMediaContentUrlSettings
  extends StObject
     with VideoOrPlaylistSettings {
  
  /**
    * Fully qualified player URL.
    */
  var mediaContentUrl: String
}
object VideoByMediaContentUrlSettings {
  
  inline def apply(mediaContentUrl: String): VideoByMediaContentUrlSettings = {
    val __obj = js.Dynamic.literal(mediaContentUrl = mediaContentUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoByMediaContentUrlSettings]
  }
  
  extension [Self <: VideoByMediaContentUrlSettings](x: Self) {
    
    inline def setMediaContentUrl(value: String): Self = StObject.set(x, "mediaContentUrl", value.asInstanceOf[js.Any])
  }
}
