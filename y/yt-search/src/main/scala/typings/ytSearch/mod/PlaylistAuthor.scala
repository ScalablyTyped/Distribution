package typings.ytSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<yt-search.yt-search.Author, 'userName' | 'channelName'> */
@js.native
trait PlaylistAuthor extends js.Object {
  var channelId: String = js.native
  var channelText: String = js.native
  var channelUrl: String = js.native
  var id: String = js.native
  var name: String = js.native
  var url: String = js.native
  var userId: String = js.native
  var userText: String = js.native
  var userUrl: String = js.native
}

object PlaylistAuthor {
  @scala.inline
  def apply(
    channelId: String,
    channelText: String,
    channelUrl: String,
    id: String,
    name: String,
    url: String,
    userId: String,
    userText: String,
    userUrl: String
  ): PlaylistAuthor = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], channelText = channelText.asInstanceOf[js.Any], channelUrl = channelUrl.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any], userText = userText.asInstanceOf[js.Any], userUrl = userUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistAuthor]
  }
  @scala.inline
  implicit class PlaylistAuthorOps[Self <: PlaylistAuthor] (val x: Self) extends AnyVal {
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
    def setChannelId(value: String): Self = this.set("channelId", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannelText(value: String): Self = this.set("channelText", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannelUrl(value: String): Self = this.set("channelUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserText(value: String): Self = this.set("userText", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserUrl(value: String): Self = this.set("userUrl", value.asInstanceOf[js.Any])
  }
  
}

