package typings.ytSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchResult extends StObject {
  
  var accounts: js.Array[ChannelSearchResult]
  
  var all: js.Array[
    VideoSearchResult | LiveSearchResult | PlaylistSearchResult | ChannelSearchResult
  ]
  
  var channels: js.Array[ChannelSearchResult]
  
  var lists: js.Array[PlaylistSearchResult]
  
  var live: js.Array[LiveSearchResult]
  
  var playlists: js.Array[PlaylistSearchResult]
  
  var videos: js.Array[VideoSearchResult]
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
  implicit class SearchResultMutableBuilder[Self <: SearchResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccounts(value: js.Array[ChannelSearchResult]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountsVarargs(value: ChannelSearchResult*): Self = StObject.set(x, "accounts", js.Array(value :_*))
    
    @scala.inline
    def setAll(
      value: js.Array[
          VideoSearchResult | LiveSearchResult | PlaylistSearchResult | ChannelSearchResult
        ]
    ): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllVarargs(value: (VideoSearchResult | LiveSearchResult | PlaylistSearchResult | ChannelSearchResult)*): Self = StObject.set(x, "all", js.Array(value :_*))
    
    @scala.inline
    def setChannels(value: js.Array[ChannelSearchResult]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsVarargs(value: ChannelSearchResult*): Self = StObject.set(x, "channels", js.Array(value :_*))
    
    @scala.inline
    def setLists(value: js.Array[PlaylistSearchResult]): Self = StObject.set(x, "lists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListsVarargs(value: PlaylistSearchResult*): Self = StObject.set(x, "lists", js.Array(value :_*))
    
    @scala.inline
    def setLive(value: js.Array[LiveSearchResult]): Self = StObject.set(x, "live", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiveVarargs(value: LiveSearchResult*): Self = StObject.set(x, "live", js.Array(value :_*))
    
    @scala.inline
    def setPlaylists(value: js.Array[PlaylistSearchResult]): Self = StObject.set(x, "playlists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaylistsVarargs(value: PlaylistSearchResult*): Self = StObject.set(x, "playlists", js.Array(value :_*))
    
    @scala.inline
    def setVideos(value: js.Array[VideoSearchResult]): Self = StObject.set(x, "videos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideosVarargs(value: VideoSearchResult*): Self = StObject.set(x, "videos", js.Array(value :_*))
  }
}
