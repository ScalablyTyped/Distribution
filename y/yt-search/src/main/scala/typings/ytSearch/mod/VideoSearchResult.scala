package typings.ytSearch.mod

import typings.ytSearch.AnonSeconds
import typings.ytSearch.ytSearchStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoSearchResult extends js.Object {
  var ago: String
  var author: Author
  var description: String
  var duration: AnonSeconds
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
    duration: AnonSeconds,
    image: String,
    seconds: Double,
    thumbnail: String,
    timestamp: String,
    title: String,
    `type`: video,
    url: String,
    videoId: String,
    views: Double
  ): VideoSearchResult = {
    val __obj = js.Dynamic.literal(ago = ago.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], videoId = videoId.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoSearchResult]
  }
}

