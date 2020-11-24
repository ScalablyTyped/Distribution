package typings.ytSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchResult extends js.Object {
  
  var accounts: js.Array[ChannelSearchResult] = js.native
  
  var all: js.Array[
    VideoSearchResult | LiveSearchResult | PlaylistSearchResult | ChannelSearchResult
  ] = js.native
  
  var channels: js.Array[ChannelSearchResult] = js.native
  
  var lists: js.Array[PlaylistSearchResult] = js.native
  
  var live: js.Array[LiveSearchResult] = js.native
  
  var playlists: js.Array[PlaylistSearchResult] = js.native
  
  var videos: js.Array[VideoSearchResult] = js.native
}
object SearchResult {
  
  @scala.inline
  def apply(
    accounts: js.Array[ChannelSearchResult],
    all: js.Array[
      VideoSearchResult | LiveSearchResult | PlaylistSearchResult | ChannelSearchResult
    ],
    channels: js.Array[ChannelSearchResult],
    lists: js.Array[PlaylistSearchResult],
    live: js.Array[LiveSearchResult],
    playlists: js.Array[PlaylistSearchResult],
    videos: js.Array[VideoSearchResult]
  ): SearchResult = {
    val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any], all = all.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any], lists = lists.asInstanceOf[js.Any], live = live.asInstanceOf[js.Any], playlists = playlists.asInstanceOf[js.Any], videos = videos.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult]
  }
  
  @scala.inline
  implicit class SearchResultOps[Self <: SearchResult] (val x: Self) extends AnyVal {
    
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
    def setAccountsVarargs(value: ChannelSearchResult*): Self = this.set("accounts", js.Array(value :_*))
    
    @scala.inline
    def setAccounts(value: js.Array[ChannelSearchResult]): Self = this.set("accounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllVarargs(value: (VideoSearchResult | LiveSearchResult | PlaylistSearchResult | ChannelSearchResult)*): Self = this.set("all", js.Array(value :_*))
    
    @scala.inline
    def setAll(
      value: js.Array[
          VideoSearchResult | LiveSearchResult | PlaylistSearchResult | ChannelSearchResult
        ]
    ): Self = this.set("all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsVarargs(value: ChannelSearchResult*): Self = this.set("channels", js.Array(value :_*))
    
    @scala.inline
    def setChannels(value: js.Array[ChannelSearchResult]): Self = this.set("channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListsVarargs(value: PlaylistSearchResult*): Self = this.set("lists", js.Array(value :_*))
    
    @scala.inline
    def setLists(value: js.Array[PlaylistSearchResult]): Self = this.set("lists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiveVarargs(value: LiveSearchResult*): Self = this.set("live", js.Array(value :_*))
    
    @scala.inline
    def setLive(value: js.Array[LiveSearchResult]): Self = this.set("live", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaylistsVarargs(value: PlaylistSearchResult*): Self = this.set("playlists", js.Array(value :_*))
    
    @scala.inline
    def setPlaylists(value: js.Array[PlaylistSearchResult]): Self = this.set("playlists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideosVarargs(value: VideoSearchResult*): Self = this.set("videos", js.Array(value :_*))
    
    @scala.inline
    def setVideos(value: js.Array[VideoSearchResult]): Self = this.set("videos", value.asInstanceOf[js.Any])
  }
}
