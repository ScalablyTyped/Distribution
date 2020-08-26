package typings.ytSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoMetadataResult extends js.Object {
  var ago: String = js.native
  var author: Author = js.native
  var description: String = js.native
  var duration: Duration = js.native
  var genre: String = js.native
  var image: String = js.native
  var seconds: Double = js.native
  /** @deprecated */
  var thumbnail: String = js.native
  var timestamp: String = js.native
  var title: String = js.native
  var uploadDate: String = js.native
  var url: String = js.native
  var videoId: String = js.native
  var views: Double = js.native
}

object VideoMetadataResult {
  @scala.inline
  def apply(
    ago: String,
    author: Author,
    description: String,
    duration: Duration,
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
  @scala.inline
  implicit class VideoMetadataResultOps[Self <: VideoMetadataResult] (val x: Self) extends AnyVal {
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
    def setAgo(value: String): Self = this.set("ago", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthor(value: Author): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Duration): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setGenre(value: String): Self = this.set("genre", value.asInstanceOf[js.Any])
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeconds(value: Double): Self = this.set("seconds", value.asInstanceOf[js.Any])
    @scala.inline
    def setThumbnail(value: String): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setUploadDate(value: String): Self = this.set("uploadDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setVideoId(value: String): Self = this.set("videoId", value.asInstanceOf[js.Any])
    @scala.inline
    def setViews(value: Double): Self = this.set("views", value.asInstanceOf[js.Any])
  }
  
}

