package typings.ytSearch.mod

import typings.ytSearch.ytSearchStrings.list
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaylistSearchResult extends StObject {
  
  var author: Author
  
  var image: String
  
  var listId: String
  
  var thumbnail: String
  
  var title: String
  
  var `type`: list
  
  var url: String
  
  var videoCount: Double
}
object PlaylistSearchResult {
  
  inline def apply(
    author: Author,
    image: String,
    listId: String,
    thumbnail: String,
    title: String,
    url: String,
    videoCount: Double
  ): PlaylistSearchResult = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], listId = listId.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], videoCount = videoCount.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("list")
    __obj.asInstanceOf[PlaylistSearchResult]
  }
  
  extension [Self <: PlaylistSearchResult](x: Self) {
    
    inline def setAuthor(value: Author): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setListId(value: String): Self = StObject.set(x, "listId", value.asInstanceOf[js.Any])
    
    inline def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: list): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVideoCount(value: Double): Self = StObject.set(x, "videoCount", value.asInstanceOf[js.Any])
  }
}
