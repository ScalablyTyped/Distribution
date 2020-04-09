package typings.ytSearch.mod

import typings.ytSearch.ytSearchStrings.list
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistSearchResult extends js.Object {
  var author: Author
  var image: String
  var listId: String
  var thumbnail: String
  var title: String
  var `type`: list
  var url: String
  var videoCount: Double
  var videoCountLabel: String
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
    videoCount: Double,
    videoCountLabel: String
  ): PlaylistSearchResult = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], listId = listId.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], videoCount = videoCount.asInstanceOf[js.Any], videoCountLabel = videoCountLabel.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistSearchResult]
  }
}

