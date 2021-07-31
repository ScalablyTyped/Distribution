package typings.ytSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaylistItem extends StObject {
  
  var author: Author
  
  var listId: String
  
  var thumbnail: String
  
  var title: String
  
  var videoId: String
}
object PlaylistItem {
  
  @scala.inline
  def apply(author: Author, listId: String, thumbnail: String, title: String, videoId: String): PlaylistItem = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], listId = listId.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], videoId = videoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistItem]
  }
  
  @scala.inline
  implicit class PlaylistItemMutableBuilder[Self <: PlaylistItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: Author): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListId(value: String): Self = StObject.set(x, "listId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
  }
}
