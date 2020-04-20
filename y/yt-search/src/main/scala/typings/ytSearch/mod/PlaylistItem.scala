package typings.ytSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistItem extends js.Object {
  var author: PlaylistAuthor
  var listId: String
  var owner: String
  var thumbnailUrl: String
  var thumbnailUrlHQ: String
  var title: String
  var url: String
  var videoId: String
}

object PlaylistItem {
  @scala.inline
  def apply(
    author: PlaylistAuthor,
    listId: String,
    owner: String,
    thumbnailUrl: String,
    thumbnailUrlHQ: String,
    title: String,
    url: String,
    videoId: String
  ): PlaylistItem = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], listId = listId.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], thumbnailUrl = thumbnailUrl.asInstanceOf[js.Any], thumbnailUrlHQ = thumbnailUrlHQ.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], videoId = videoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistItem]
  }
}

