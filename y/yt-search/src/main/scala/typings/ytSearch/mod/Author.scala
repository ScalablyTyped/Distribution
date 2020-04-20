package typings.ytSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Author extends js.Object {
  var channelId: String
  var channelName: String
  var channelUrl: String
  var id: String
  var name: String
  var url: String
  var userId: String
  var userName: String
  var userUrl: String
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
}

