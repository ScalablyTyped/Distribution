package typings.ytSearch.mod

import typings.ytSearch.ytSearchStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoSearchResult extends StObject {
  
  var ago: String
  
  var author: Author
  
  var description: String
  
  var duration: Duration
  
  var image: String
  
  var seconds: Double
  
  var thumbnail: String
  
  var timestamp: String
  
  var title: String
  
  var `type`: video
  
  var url: String
  
  var videoId: String
  
  var views: Double
}
object VideoSearchResult {
  
  @scala.inline
  def apply(
    ago: String,
    author: Author,
    description: String,
    duration: Duration,
    image: String,
    seconds: Double,
    thumbnail: String,
    timestamp: String,
    title: String,
    url: String,
    videoId: String,
    views: Double
  ): VideoSearchResult = {
    val __obj = js.Dynamic.literal(ago = ago.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], videoId = videoId.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("video")
    __obj.asInstanceOf[VideoSearchResult]
  }
  
  @scala.inline
  implicit class VideoSearchResultMutableBuilder[Self <: VideoSearchResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgo(value: String): Self = StObject.set(x, "ago", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthor(value: Author): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Duration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: video): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViews(value: Double): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
  }
}
