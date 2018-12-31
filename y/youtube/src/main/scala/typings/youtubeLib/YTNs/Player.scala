package typings
package youtubeLib.YTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("YT.Player")
@js.native
class Player protected () extends js.Object {
  /**
  		 * Initializes a new instance of the Player class.
  		 *
  		 * @param container   DOM element to insert the player's <iframe>.
  		 * @param options   Player options.
  		 */
  def this(elt: stdLib.HTMLElement, options: PlayerOptions) = this()
  /**
  		 * Initializes a new instance of the Player class.
  		 *
  		 * @param id   ID of the DOM element to insert the player's <iframe>.
  		 * @param options   Player options.
  		 */
  def this(id: java.lang.String, options: PlayerOptions) = this()
  @JSName("addEventListener")
  def addEventListener_onApiChange[TEvent /* <: PlayerEvent */](
    eventName: youtubeLib.youtubeLibStrings.onApiChange,
    listener: js.Function1[/* event */ TEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_onError[TEvent /* <: PlayerEvent */](
    eventName: youtubeLib.youtubeLibStrings.onError,
    listener: js.Function1[/* event */ TEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_onPlaybackQualityChange[TEvent /* <: PlayerEvent */](
    eventName: youtubeLib.youtubeLibStrings.onPlaybackQualityChange,
    listener: js.Function1[/* event */ TEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_onPlaybackRateChange[TEvent /* <: PlayerEvent */](
    eventName: youtubeLib.youtubeLibStrings.onPlaybackRateChange,
    listener: js.Function1[/* event */ TEvent, scala.Unit]
  ): scala.Unit = js.native
  /**
  		 * Adds an event listener for the specified event.
  		 *
  		 * @param eventName   Name of the event.
  		 * @param listener   Handler for the event.
  		 */
  @JSName("addEventListener")
  def addEventListener_onReady[TEvent /* <: PlayerEvent */](
    eventName: youtubeLib.youtubeLibStrings.onReady,
    listener: js.Function1[/* event */ TEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_onStateChange[TEvent /* <: PlayerEvent */](
    eventName: youtubeLib.youtubeLibStrings.onStateChange,
    listener: js.Function1[/* event */ TEvent, scala.Unit]
  ): scala.Unit = js.native
  /**
  		 * Queues a playlist of videos.
  		 *
  		 * @param args   Settings to queue the playlist.
  		 */
  def cuePlaylist(args: IPlaylistSettings): scala.Unit = js.native
  /**
  		 * Queues a playlist of videos.
  		 *
  		 * @param playlist   Video ID(s) to play.
  		 * @param index   Start index of the playlist, if not 0.
  		 * @param startSeconds   Time from which the video should start playing.
  		 * @param suggestedQuality   Suggested video player quality.
  		 */
  def cuePlaylist(playlist: java.lang.String): scala.Unit = js.native
  def cuePlaylist(playlist: java.lang.String, index: scala.Double): scala.Unit = js.native
  def cuePlaylist(playlist: java.lang.String, index: scala.Double, startSeconds: scala.Double): scala.Unit = js.native
  def cuePlaylist(
    playlist: java.lang.String,
    index: scala.Double,
    startSeconds: scala.Double,
    suggestedQuality: SuggestedVideoQuality
  ): scala.Unit = js.native
  def cuePlaylist(playlist: js.Array[java.lang.String]): scala.Unit = js.native
  def cuePlaylist(playlist: js.Array[java.lang.String], index: scala.Double): scala.Unit = js.native
  def cuePlaylist(playlist: js.Array[java.lang.String], index: scala.Double, startSeconds: scala.Double): scala.Unit = js.native
  def cuePlaylist(
    playlist: js.Array[java.lang.String],
    index: scala.Double,
    startSeconds: scala.Double,
    suggestedQuality: SuggestedVideoQuality
  ): scala.Unit = js.native
  /**
  		 * Queues a video by ID.
  		 *
  		 * @param args   Settings to queue the video.
  		 */
  def cueVideoById(args: VideoByIdSettings): scala.Unit = js.native
  /**
  		 * Queues a video by ID.
  		 *
  		 * @param videoId   Video ID.
  		 * @param startSeconds   Time from which the video should start playing.
  		 * @param suggestedQuality   Suggested video player quality.
  		 */
  def cueVideoById(videoId: java.lang.String): scala.Unit = js.native
  def cueVideoById(videoId: java.lang.String, startSeconds: scala.Double): scala.Unit = js.native
  def cueVideoById(videoId: java.lang.String, startSeconds: scala.Double, suggestedQuality: SuggestedVideoQuality): scala.Unit = js.native
  /**
  		 * Queues a video by media content URL.
  		 *
  		 * @param args   Settings to play the video.
  		 */
  def cueVideoByUrl(args: VideoByMediaContentUrlSettings): scala.Unit = js.native
  /**
  		 * Queues a video by media content URL.
  		 *
  		 * @param mediaContentUrl   Fully qualified player URL.
  		 * @param startSeconds   Time from which the video should start playing.
  		 * @param suggestedQuality   Suggested video player quality.
  		 */
  def cueVideoByUrl(mediaContentUrl: java.lang.String): scala.Unit = js.native
  def cueVideoByUrl(mediaContentUrl: java.lang.String, startSeconds: scala.Double): scala.Unit = js.native
  def cueVideoByUrl(
    mediaContentUrl: java.lang.String,
    startSeconds: scala.Double,
    suggestedQuality: SuggestedVideoQuality
  ): scala.Unit = js.native
  /**
  		 * Removes the <iframe> containing the player.
  		 */
  def destroy(): scala.Unit = js.native
  /**
  		 * @returns Available playback rates for the current video.
  		 */
  def getAvailablePlaybackRates(): js.Array[scala.Double] = js.native
  /**
  		 * @returns Quality formats in which the current video is available.
  		 */
  def getAvailableQualityLevels(): js.Array[SuggestedVideoQuality] = js.native
  /**
  		 * @returns Elapsed time in seconds since the video started playing.
  		 */
  def getCurrentTime(): scala.Double = js.native
  /**
  		 * @returns Duration in seconds of the currently playing video.
  		 */
  def getDuration(): scala.Double = js.native
  /**
  		 * @returns The DOM node for the embedded <iframe>.
  		 */
  def getIframe(): stdLib.HTMLIFrameElement = js.native
  /**
  		 * @returns Actual video quality of the current video.
  		 */
  def getPlaybackQuality(): SuggestedVideoQuality = js.native
  /**
  		 * @returns Playback rate of the currently playing video.
  		 */
  def getPlaybackRate(): scala.Double = js.native
  /**
  		 * @returns Current player state.
  		 */
  def getPlayerState(): PlayerState = js.native
  /**
  		 * @returns Video IDs in the playlist as they are currently ordered.
  		 */
  def getPlaylist(): js.Array[java.lang.String] = js.native
  /**
  		 * @returns Index of the playlist video that is currently playing.
  		 */
  def getPlaylistIndex(): scala.Double = js.native
  /**
  		 * @returns Embed code for the currently loaded/playing video.
  		 */
  def getVideoEmbedCode(): java.lang.String = js.native
  /**
  		 * @returns A number between 0 and 1 of how much the player has buffered.
  		 */
  def getVideoLoadedFraction(): scala.Double = js.native
  /**
  		 * @returns YouTube.com URL for the currently loaded/playing video.
  		 */
  def getVideoUrl(): java.lang.String = js.native
  /**
  		 * @returns The player's current volume, an integer between 0 and 100.
  		 */
  def getVolume(): scala.Double = js.native
  /**
  		 * @returns Whether the player is muted.
  		 */
  def isMuted(): scala.Boolean = js.native
  /**
  		 * Loads a playlist of videos.
  		 *
  		 * @param args    Settings to queue the playlist.
  		 */
  def loadPlaylist(args: IPlaylistSettings): scala.Unit = js.native
  /**
  		 * Loads a playlist of videos.
  		 *
  		 * @param playlist   Video ID(s) to play.
  		 * @param index   Start index of the playlist, if not 0.
  		 * @param startSeconds   Time from which the video should start playing.
  		 * @param suggestedQuality   Suggested video player quality.
  		 */
  def loadPlaylist(playlist: java.lang.String): scala.Unit = js.native
  def loadPlaylist(playlist: java.lang.String, index: scala.Double): scala.Unit = js.native
  def loadPlaylist(playlist: java.lang.String, index: scala.Double, startSeconds: scala.Double): scala.Unit = js.native
  def loadPlaylist(
    playlist: java.lang.String,
    index: scala.Double,
    startSeconds: scala.Double,
    suggestedQuality: SuggestedVideoQuality
  ): scala.Unit = js.native
  def loadPlaylist(playlist: js.Array[java.lang.String]): scala.Unit = js.native
  def loadPlaylist(playlist: js.Array[java.lang.String], index: scala.Double): scala.Unit = js.native
  def loadPlaylist(playlist: js.Array[java.lang.String], index: scala.Double, startSeconds: scala.Double): scala.Unit = js.native
  def loadPlaylist(
    playlist: js.Array[java.lang.String],
    index: scala.Double,
    startSeconds: scala.Double,
    suggestedQuality: SuggestedVideoQuality
  ): scala.Unit = js.native
  /**
  		 * Loads and plays a video by ID.
  		 *
  		 * @param args   Settings to play the video.
  		 */
  def loadVideoById(args: VideoByIdSettings): scala.Unit = js.native
  /**
  		 * Loads and plays a video by ID.
  		 *
  		 * @param videoId   Video ID.
  		 * @param startSeconds   Time from which the video should start playing.
  		 * @param suggestedQuality   Suggested video player quality.
  		 */
  def loadVideoById(videoId: java.lang.String): scala.Unit = js.native
  def loadVideoById(videoId: java.lang.String, startSeconds: scala.Double): scala.Unit = js.native
  def loadVideoById(videoId: java.lang.String, startSeconds: scala.Double, suggestedQuality: SuggestedVideoQuality): scala.Unit = js.native
  /**
  		 * Loads a video by media content URL.
  		 *
  		 * @param args   Settings to play the video.
  		 */
  def loadVideoByUrl(args: youtubeLib.Anon_EndSeconds): scala.Unit = js.native
  /**
  		 * Loads a video by media content URL.
  		 *
  		 * @param mediaContentUrl   Fully qualified player URL.
  		 * @param startSeconds   Time from which the video should start playing.
  		 * @param suggestedQuality   Suggested video player quality.
  		 */
  def loadVideoByUrl(mediaContentUrl: java.lang.String): scala.Unit = js.native
  def loadVideoByUrl(mediaContentUrl: java.lang.String, startSeconds: scala.Double): scala.Unit = js.native
  def loadVideoByUrl(
    mediaContentUrl: java.lang.String,
    startSeconds: scala.Double,
    suggestedQuality: SuggestedVideoQuality
  ): scala.Unit = js.native
  /**
  		 * Mutes the player.
  		 */
  def mute(): scala.Unit = js.native
  /**
  		 * Loads and plays the next video in the playlist.
  		 */
  def nextVideo(): scala.Unit = js.native
  /**
  		 * Pauses the currently playing video.
  		 */
  def pauseVideo(): scala.Unit = js.native
  /**
  		 * Plays the currently cued/loaded video.
  		 */
  def playVideo(): scala.Unit = js.native
  /**
  		 * Loads and plays the specified video in the playlist.
  		 *
  		 * @param index   Index of the video to play.
  		 */
  def playVideoAt(index: scala.Double): scala.Unit = js.native
  /**
  		 * Loads and plays the previous video in the playlist.
  		 */
  def previousVideo(): scala.Unit = js.native
  /**
  		 * Seeks to a specified time in the video.
  		 *
  		 * @param seconds   Time, in seconds from the beginning of the video.
  		 * @param allowSeekAhead   Whether the player is allowed to make a new request for unbuffered data.
  		 */
  def seekTo(seconds: scala.Double, allowSeekAhead: scala.Boolean): scala.Unit = js.native
  /**
  		 * Sets whether the player should continuously play a playlist.
  		 *
  		 * @param loopPlaylists   Whether to continuously loop playlists.
  		 */
  def setLoop(loopPlaylists: scala.Boolean): scala.Unit = js.native
  /**
  		 * Sets the suggested video quality for the current video.
  		 *
  		 * @param suggestedQuality   Suggested video quality for the current video.
  		 */
  def setPlaybackQuality(suggestedQuality: SuggestedVideoQuality): scala.Unit = js.native
  /**
  		 * Sets the suggested playback rate for the current video.
  		 *
  		 * @param suggestedRate   Suggested playback rate.
  		 */
  def setPlaybackRate(suggestedRate: scala.Double): scala.Unit = js.native
  /**
  		 * Sets whether a playlist's videos should be shuffled.
  		 *
  		 * @param shufflePlaylist   Whether to shuffle playlist videos.
  		 */
  def setShuffle(shufflePlaylist: scala.Boolean): scala.Unit = js.native
  /**
  		 * Sets the size in pixels of the <iframe> that contains the player.
  		 *
  		 * @param width   Width in pixels of the <iframe>.
  		 * @param height   Height in pixels of the <iframe>.
  		 */
  def setSize(width: scala.Double, height: scala.Double): scala.Unit = js.native
  /**
  		 * Sets the player volume.
  		 *
  		 * @param volume   An integer between 0 and 100.
  		 */
  def setVolume(volume: scala.Double): scala.Unit = js.native
  /**
  		 * Stops and cancels loading of the current video.
  		 */
  def stopVideo(): scala.Unit = js.native
  /**
  		 * Unmutes the player.
  		 */
  def unMute(): scala.Unit = js.native
}

