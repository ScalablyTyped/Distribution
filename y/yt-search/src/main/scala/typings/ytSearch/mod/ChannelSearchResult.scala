package typings.ytSearch.mod

import typings.ytSearch.ytSearchStrings.channel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelSearchResult extends StObject {
  
  var image: String
  
  var name: String
  
  var subCount: Double
  
  var subCountLabel: String
  
  var thumbnail: String
  
  var title: String
  
  var `type`: channel
  
  var url: String
  
  var videoCount: Double
  
  var videoCountLabel: String
}
object ChannelSearchResult {
  
  inline def apply(
    image: String,
    name: String,
    subCount: Double,
    subCountLabel: String,
    thumbnail: String,
    title: String,
    url: String,
    videoCount: Double,
    videoCountLabel: String
  ): ChannelSearchResult = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subCount = subCount.asInstanceOf[js.Any], subCountLabel = subCountLabel.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], videoCount = videoCount.asInstanceOf[js.Any], videoCountLabel = videoCountLabel.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("channel")
    __obj.asInstanceOf[ChannelSearchResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChannelSearchResult] (val x: Self) extends AnyVal {
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSubCount(value: Double): Self = StObject.set(x, "subCount", value.asInstanceOf[js.Any])
    
    inline def setSubCountLabel(value: String): Self = StObject.set(x, "subCountLabel", value.asInstanceOf[js.Any])
    
    inline def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: channel): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVideoCount(value: Double): Self = StObject.set(x, "videoCount", value.asInstanceOf[js.Any])
    
    inline def setVideoCountLabel(value: String): Self = StObject.set(x, "videoCountLabel", value.asInstanceOf[js.Any])
  }
}
