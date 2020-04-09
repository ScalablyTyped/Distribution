package typings.ytSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoMetadataOptions extends js.Object {
  var videoId: String
}

object VideoMetadataOptions {
  @scala.inline
  def apply(videoId: String): VideoMetadataOptions = {
    val __obj = js.Dynamic.literal(videoId = videoId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VideoMetadataOptions]
  }
}

