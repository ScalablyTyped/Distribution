package typings.ytSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaylistItem extends js.Object {
  var author: PlaylistAuthor = js.native
  var listId: String = js.native
  var owner: String = js.native
  var thumbnailUrl: String = js.native
  var thumbnailUrlHQ: String = js.native
  var title: String = js.native
  var url: String = js.native
  var videoId: String = js.native
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
  @scala.inline
  implicit class PlaylistItemOps[Self <: PlaylistItem] (val x: Self) extends AnyVal {
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
    def setAuthor(value: PlaylistAuthor): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def setListId(value: String): Self = this.set("listId", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setThumbnailUrl(value: String): Self = this.set("thumbnailUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setThumbnailUrlHQ(value: String): Self = this.set("thumbnailUrlHQ", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setVideoId(value: String): Self = this.set("videoId", value.asInstanceOf[js.Any])
  }
  
}

