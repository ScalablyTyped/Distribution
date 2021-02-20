package typings.ytSearch.mod

import typings.ytSearch.ytSearchStrings.channel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelSearchResult extends StObject {
  
  var image: String = js.native
  
  var name: String = js.native
  
  var subCount: Double = js.native
  
  var subCountLabel: String = js.native
  
  var thumbnail: String = js.native
  
  var title: String = js.native
  
  var `type`: channel = js.native
  
  var url: String = js.native
  
  var videoCount: Double = js.native
  
  var videoCountLabel: String = js.native
}
object ChannelSearchResult {
  
  @scala.inline
  def apply(
    image: String,
    name: String,
    subCount: Double,
    subCountLabel: String,
    thumbnail: String,
    title: String,
    `type`: channel,
    url: String,
    videoCount: Double,
    videoCountLabel: String
  ): ChannelSearchResult = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subCount = subCount.asInstanceOf[js.Any], subCountLabel = subCountLabel.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], videoCount = videoCount.asInstanceOf[js.Any], videoCountLabel = videoCountLabel.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelSearchResult]
  }
  
  @scala.inline
  implicit class ChannelSearchResultMutableBuilder[Self <: ChannelSearchResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubCount(value: Double): Self = StObject.set(x, "subCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubCountLabel(value: String): Self = StObject.set(x, "subCountLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: channel): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoCount(value: Double): Self = StObject.set(x, "videoCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoCountLabel(value: String): Self = StObject.set(x, "videoCountLabel", value.asInstanceOf[js.Any])
  }
}
