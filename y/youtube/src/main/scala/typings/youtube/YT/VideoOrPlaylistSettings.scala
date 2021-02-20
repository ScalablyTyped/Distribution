package typings.youtube.YT

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoOrPlaylistSettings extends StObject {
  
  /**
    * Time, in seconds from the end of the (first) video, when to end playing.
    */
  var endSeconds: js.UndefOr[Double] = js.native
  
  /**
    * Time, in seconds from the beginning of the (first) video, when to start playing.
    */
  var startSeconds: js.UndefOr[Double] = js.native
  
  /**
    * Suggested video player quality.
    */
  var suggestedQuality: js.UndefOr[SuggestedVideoQuality] = js.native
}
object VideoOrPlaylistSettings {
  
  @scala.inline
  def apply(): VideoOrPlaylistSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoOrPlaylistSettings]
  }
  
  @scala.inline
  implicit class VideoOrPlaylistSettingsMutableBuilder[Self <: VideoOrPlaylistSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndSeconds(value: Double): Self = StObject.set(x, "endSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndSecondsUndefined: Self = StObject.set(x, "endSeconds", js.undefined)
    
    @scala.inline
    def setStartSeconds(value: Double): Self = StObject.set(x, "startSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartSecondsUndefined: Self = StObject.set(x, "startSeconds", js.undefined)
    
    @scala.inline
    def setSuggestedQuality(value: SuggestedVideoQuality): Self = StObject.set(x, "suggestedQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedQualityUndefined: Self = StObject.set(x, "suggestedQuality", js.undefined)
  }
}
