package typings.ytSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaylistMetadataResult extends StObject {
  
  var author: Author = js.native
  
  var date: String = js.native
  
  var image: String = js.native
  
  var listId: String = js.native
  
  var thumbnail: String = js.native
  
  var title: String = js.native
  
  var url: String = js.native
  
  var videos: js.Array[PlaylistItem] = js.native
  
  var views: Double = js.native
}
object PlaylistMetadataResult {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class PlaylistMetadataResultMutableBuilder[Self <: PlaylistMetadataResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: Author): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListId(value: String): Self = StObject.set(x, "listId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideos(value: js.Array[PlaylistItem]): Self = StObject.set(x, "videos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideosVarargs(value: PlaylistItem*): Self = StObject.set(x, "videos", js.Array(value :_*))
    
    @scala.inline
    def setViews(value: Double): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
  }
}
