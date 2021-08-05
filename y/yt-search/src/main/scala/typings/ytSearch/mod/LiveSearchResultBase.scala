package typings.ytSearch.mod

import typings.ytSearch.ytSearchStrings.live_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiveSearchResultBase extends StObject {
  
  var author: Author
  
  var description: String
  
  var image: String
  
  var thumbnail: String
  
  var title: String
  
  var `type`: live_
  
  var url: String
  
  var videoId: String
  
  var watching: Double
}
object LiveSearchResultBase {
  
  inline def apply(
    author: Author,
    description: String,
    image: String,
    thumbnail: String,
    title: String,
    url: String,
    videoId: String,
    watching: Double
  ): LiveSearchResultBase = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], videoId = videoId.asInstanceOf[js.Any], watching = watching.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("live")
    __obj.asInstanceOf[LiveSearchResultBase]
  }
  
  extension [Self <: LiveSearchResultBase](x: Self) {
    
    inline def setAuthor(value: Author): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: live_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
    
    inline def setWatching(value: Double): Self = StObject.set(x, "watching", value.asInstanceOf[js.Any])
  }
}
