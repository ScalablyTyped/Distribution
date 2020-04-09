package typings.ytSearch.mod

import typings.ytSearch.ytSearchStrings.channel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelSearchResult extends js.Object {
  var description: String
  var id: String
  var name: String
  var thumbnail: String
  var title: String
  var `type`: channel
  var url: String
  var videoCount: Double
  var videoCountLabel: String
}

object ChannelSearchResult {
  @scala.inline
  def apply(
    description: String,
    id: String,
    name: String,
    thumbnail: String,
    title: String,
    `type`: channel,
    url: String,
    videoCount: Double,
    videoCountLabel: String
  ): ChannelSearchResult = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], videoCount = videoCount.asInstanceOf[js.Any], videoCountLabel = videoCountLabel.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelSearchResult]
  }
}

