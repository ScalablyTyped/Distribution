package typings.ytSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResult extends js.Object {
  var accounts: js.Array[ChannelSearchResult]
  var channels: js.Array[ChannelSearchResult]
  var lists: js.Array[PlaylistSearchResult]
  var playlists: js.Array[PlaylistSearchResult]
  var videos: js.Array[VideoSearchResult]
}

object SearchResult {
  @scala.inline
  def apply(
    accounts: js.Array[ChannelSearchResult],
    channels: js.Array[ChannelSearchResult],
    lists: js.Array[PlaylistSearchResult],
    playlists: js.Array[PlaylistSearchResult],
    videos: js.Array[VideoSearchResult]
  ): SearchResult = {
    val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any], lists = lists.asInstanceOf[js.Any], playlists = playlists.asInstanceOf[js.Any], videos = videos.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult]
  }
}

