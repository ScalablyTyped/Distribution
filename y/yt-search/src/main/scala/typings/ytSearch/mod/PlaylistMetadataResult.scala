package typings.ytSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistMetadataResult extends js.Object {
  var author: PlaylistAuthor
  var items: js.Array[PlaylistItem]
  var lastUpdate: String
  var listId: String
  var thumbnail: String
  var title: String
  var url: String
  var videoCount: Double
  var views: Double
}

object PlaylistMetadataResult {
  @scala.inline
  def apply(
    author: PlaylistAuthor,
    items: js.Array[PlaylistItem],
    lastUpdate: String,
    listId: String,
    thumbnail: String,
    title: String,
    url: String,
    videoCount: Double,
    views: Double
  ): PlaylistMetadataResult = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], lastUpdate = lastUpdate.asInstanceOf[js.Any], listId = listId.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], videoCount = videoCount.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PlaylistMetadataResult]
  }
}

