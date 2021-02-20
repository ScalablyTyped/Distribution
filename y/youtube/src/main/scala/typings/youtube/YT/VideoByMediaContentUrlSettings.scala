package typings.youtube.YT

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoByMediaContentUrlSettings extends VideoOrPlaylistSettings {
  
  /**
    * Fully qualified player URL.
    */
  var mediaContentUrl: String = js.native
}
object VideoByMediaContentUrlSettings {
  
  @scala.inline
  def apply(mediaContentUrl: String): VideoByMediaContentUrlSettings = {
    val __obj = js.Dynamic.literal(mediaContentUrl = mediaContentUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoByMediaContentUrlSettings]
  }
  
  @scala.inline
  implicit class VideoByMediaContentUrlSettingsMutableBuilder[Self <: VideoByMediaContentUrlSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaContentUrl(value: String): Self = StObject.set(x, "mediaContentUrl", value.asInstanceOf[js.Any])
  }
}
