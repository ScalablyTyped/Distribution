package typings.ytSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaylistMetadataResult extends js.Object {
  
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
  implicit class PlaylistMetadataResultOps[Self <: PlaylistMetadataResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthor(value: Author): Self = this.set("author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListId(value: String): Self = this.set("listId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail(value: String): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideosVarargs(value: PlaylistItem*): Self = this.set("videos", js.Array(value :_*))
    
    @scala.inline
    def setVideos(value: js.Array[PlaylistItem]): Self = this.set("videos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViews(value: Double): Self = this.set("views", value.asInstanceOf[js.Any])
  }
}
