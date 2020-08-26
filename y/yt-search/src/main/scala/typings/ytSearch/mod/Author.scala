package typings.ytSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Author extends js.Object {
  var channelId: String = js.native
  var channelName: String = js.native
  var channelUrl: String = js.native
  var id: String = js.native
  var name: String = js.native
  var url: String = js.native
  var userId: String = js.native
  var userName: String = js.native
  var userUrl: String = js.native
}

object Author {
  @scala.inline
  def apply(
    channelId: String,
    channelName: String,
    channelUrl: String,
    id: String,
    name: String,
    url: String,
    userId: String,
    userName: String,
    userUrl: String
  ): Author = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], channelName = channelName.asInstanceOf[js.Any], channelUrl = channelUrl.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any], userUrl = userUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Author]
  }
  @scala.inline
  implicit class AuthorOps[Self <: Author] (val x: Self) extends AnyVal {
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
    def setChannelName(value: String): Self = this.set("channelName", value.asInstanceOf[js.Any])
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
    def setUserName(value: String): Self = this.set("userName", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserUrl(value: String): Self = this.set("userUrl", value.asInstanceOf[js.Any])
  }
  
}

