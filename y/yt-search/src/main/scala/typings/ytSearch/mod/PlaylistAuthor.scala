package typings.ytSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<yt-search.yt-search.Author, 'userName' | 'channelName'> */
trait PlaylistAuthor extends js.Object {
  var channelId: String
  var channelText: String
  var channelUrl: String
  var id: String
  var name: String
  var url: String
  var userId: String
  var userText: String
  var userUrl: String
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
}

