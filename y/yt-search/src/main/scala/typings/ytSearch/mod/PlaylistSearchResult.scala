package typings.ytSearch.mod

import typings.ytSearch.ytSearchStrings.list
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaylistSearchResult extends js.Object {
  var author: Author = js.native
  var image: String = js.native
  var listId: String = js.native
  /** @deprecated */
  var thumbnail: String = js.native
  var title: String = js.native
  var `type`: list = js.native
  var url: String = js.native
  var videoCount: Double = js.native
  var videoCountLabel: String = js.native
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
  @scala.inline
  implicit class PlaylistSearchResultOps[Self <: PlaylistSearchResult] (val x: Self) extends AnyVal {
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
    def setAuthor(value: Author): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def setListId(value: String): Self = this.set("listId", value.asInstanceOf[js.Any])
    @scala.inline
    def setThumbnail(value: String): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: list): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setVideoCount(value: Double): Self = this.set("videoCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setVideoCountLabel(value: String): Self = this.set("videoCountLabel", value.asInstanceOf[js.Any])
  }
  
}

