package typings.ytSearch.mod

import typings.ytSearch.AnonSeconds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoMetadataResult extends js.Object {
  var ago: String
  var author: Author
  var description: String
  var duration: AnonSeconds
  var genre: String
  var image: String
  var seconds: Double
  var thumbnail: String
  var timestamp: String
  var title: String
  var uploadDate: String
  var url: String
  var videoId: String
  var views: Double
}

object VideoMetadataResult {
  @scala.inline
  def apply(
    ago: String,
    author: Author,
    description: String,
    duration: AnonSeconds,
    genre: String,
    image: String,
    seconds: Double,
    thumbnail: String,
    timestamp: String,
    title: String,
    uploadDate: String,
    url: String,
    videoId: String,
    views: Double
  ): VideoMetadataResult = {
    val __obj = js.Dynamic.literal(ago = ago.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], genre = genre.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], uploadDate = uploadDate.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], videoId = videoId.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VideoMetadataResult]
  }
}

