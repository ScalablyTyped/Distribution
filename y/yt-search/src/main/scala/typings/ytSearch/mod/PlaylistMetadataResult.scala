package typings.ytSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaylistMetadataResult extends StObject {
  
  var author: Author
  
  var date: String
  
  var image: String
  
  var listId: String
  
  var thumbnail: String
  
  var title: String
  
  var url: String
  
  var videos: js.Array[PlaylistItem]
  
  var views: Double
}
object PlaylistMetadataResult {
  
  inline def apply(
    author: Author,
    date: String,
    image: String,
    listId: String,
    thumbnail: String,
    title: String,
    url: String,
    videos: js.Array[PlaylistItem],
    views: Double
  ): PlaylistMetadataResult = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], listId = listId.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], videos = videos.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistMetadataResult]
  }
  
  extension [Self <: PlaylistMetadataResult](x: Self) {
    
    inline def setAuthor(value: Author): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setListId(value: String): Self = StObject.set(x, "listId", value.asInstanceOf[js.Any])
    
    inline def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVideos(value: js.Array[PlaylistItem]): Self = StObject.set(x, "videos", value.asInstanceOf[js.Any])
    
    inline def setVideosVarargs(value: PlaylistItem*): Self = StObject.set(x, "videos", js.Array(value :_*))
    
    inline def setViews(value: Double): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
  }
}
