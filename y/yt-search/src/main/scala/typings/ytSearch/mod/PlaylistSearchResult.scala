package typings.ytSearch.mod

import typings.ytSearch.ytSearchStrings.list
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaylistSearchResult extends StObject {
  
  var author: Author = js.native
  
  var image: String = js.native
  
  var listId: String = js.native
  
  var thumbnail: String = js.native
  
  var title: String = js.native
  
  var `type`: list = js.native
  
  var url: String = js.native
  
  var videoCount: Double = js.native
}
object PlaylistSearchResult {
  
  @scala.inline
  def apply(
    author: Author,
    image: String,
    listId: String,
    thumbnail: String,
    title: String,
    `type`: list,
    url: String,
    videoCount: Double
  ): PlaylistSearchResult = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], listId = listId.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], videoCount = videoCount.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistSearchResult]
  }
  
  @scala.inline
  implicit class PlaylistSearchResultMutableBuilder[Self <: PlaylistSearchResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthor(value: Author): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListId(value: String): Self = StObject.set(x, "listId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: list): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoCount(value: Double): Self = StObject.set(x, "videoCount", value.asInstanceOf[js.Any])
  }
}
