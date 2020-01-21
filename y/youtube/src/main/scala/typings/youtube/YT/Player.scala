package typings.youtube.YT

import typings.std.HTMLElement
import typings.std.HTMLIFrameElement
import typings.youtube.AnonEndSeconds
import typings.youtube.youtubeStrings.onApiChange
import typings.youtube.youtubeStrings.onError
import typings.youtube.youtubeStrings.onPlaybackQualityChange
import typings.youtube.youtubeStrings.onPlaybackRateChange
import typings.youtube.youtubeStrings.onReady
import typings.youtube.youtubeStrings.onStateChange
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
  def this(elt: HTMLElement, options: PlayerOptions) = this()
  /**
  		 * Initializes a new instance of the Player class.
  		 *
  		 * @param id   ID of the DOM element to insert the player's <iframe>.
  		 * @param options   Player options.
  		 */
  def this(id: String, options: PlayerOptions) = this()
  @JSName("addEventListener")
  def addEventListener_onApiChange[TEvent /* <: PlayerEvent */](eventName: onApiChange, listener: js.Function1[/* event */ TEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_onError[TEvent /* <: PlayerEvent */](eventName: onError, listener: js.Function1[/* event */ TEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_onPlaybackQualityChange[TEvent /* <: PlayerEvent */](eventName: onPlaybackQualityChange, listener: js.Function1[/* event */ TEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_onPlaybackRateChange[TEvent /* <: PlayerEvent */](eventName: onPlaybackRateChange, listener: js.Function1[/* event */ TEvent, Unit]): Unit = js.native
  /**
  		 * Adds an event listener for the specified event.
  		 *
  		 * @param eventName   Name of the event.
  		 * @param listener   Handler for the event.
  		 */
  @JSName("addEventListener")
  def addEventListener_onReady[TEvent /* <: PlayerEvent */](eventName: onReady, listener: js.Function1[/* event */ TEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_onStateChange[TEvent /* <: PlayerEvent */](eventName: onStateChange, listener: js.Function1[/* event */ TEvent, Unit]): Unit = js.native
  /**
  		 * Queues a playlist of videos.
  		 *
  		 * @param args   Settings to queue the playlist.
  		 */
  def cuePlaylist(args: IPlaylistSettings): Unit = js.native
  /**
  		 * Queues a playlist of videos.
  		 *
  		 * @param playlist   Video ID(s) to play.
  		 * @param index   Start index of the playlist, if not 0.
  		 * @param startSeconds   Time from which the video should start playing.
  		 * @param suggestedQuality   Suggested video player quality.
  		 */
  def cuePlaylist(playlist: String): Unit = js.native
  def cuePlaylist(playlist: String, index: Double): Unit = js.native
  def cuePlaylist(playlist: String, index: Double, startSeconds: Double): Unit = js.native
  def cuePlaylist(playlist: String, index: Double, startSeconds: Double, suggestedQuality: SuggestedVideoQuality): Unit = js.native
  def cuePlaylist(playlist: js.Array[String]): Unit = js.native
  def cuePlaylist(playlist: js.Array[String], index: Double): Unit = js.native
  def cuePlaylist(playlist: js.Array[String], index: Double, startSeconds: Double): Unit = js.native
  def cuePlaylist(
    playlist: js.Array[String],
    index: Double,
    startSeconds: Double,
    suggestedQuality: SuggestedVideoQuality
  ): Unit = js.native
  /**
  		 * Queues a video by ID.
  		 *
  		 * @param args   Settings to queue the video.
  		 */
  def cueVideoById(args: VideoByIdSettings): Unit = js.native
  /**
  		 * Queues a video by ID.
  		 *
  		 * @param videoId   Video ID.
  		 * @param startSeconds   Time from which the video should start playing.
  		 * @param suggestedQuality   Suggested video player quality.
  		 */
  def cueVideoById(videoId: String): Unit = js.native
  def cueVideoById(videoId: String, startSeconds: Double): Unit = js.native
  def cueVideoById(videoId: String, startSeconds: Double, suggestedQuality: SuggestedVideoQuality): Unit = js.native
  /**
  		 * Queues a video by media content URL.
  		 *
  		 * @param args   Settings to play the video.
  		 */
  def cueVideoByUrl(args: VideoByMediaContentUrlSettings): Unit = js.native
  /**
  		 * Queues a video by media content URL.
  		 *
  		 * @param mediaContentUrl   Fully qualified player URL.
  		 * @param startSeconds   Time from which the video should start playing.
  		 * @param suggestedQuality   Suggested video player quality.
  		 */
  def cueVideoByUrl(mediaContentUrl: String): Unit = js.native
  def cueVideoByUrl(mediaContentUrl: String, startSeconds: Double): Unit = js.native
  def cueVideoByUrl(mediaContentUrl: String, startSeconds: Double, suggestedQuality: SuggestedVideoQuality): Unit = js.native
  /**
  		 * Removes the <iframe> containing the player.
  		 */
  def destroy(): Unit = js.native
  /**
  		 * @returns Available playback rates for the current video.
  		 */
  def getAvailablePlaybackRates(): js.Array[Double] = js.native
  /**
  		 * @returns Quality formats in which the current video is available.
  		 */
  def getAvailableQualityLevels(): js.Array[SuggestedVideoQuality] = js.native
  /**
  		 * @returns Elapsed time in seconds since the video started playing.
  		 */
  def getCurrentTime(): Double = js.native
  /**
  		 * @returns Duration in seconds of the currently playing video.
  		 */
  def getDuration(): Double = js.native
  /**
  		 * @returns The DOM node for the embedded <iframe>.
  		 */
  def getIframe(): HTMLIFrameElement = js.native
  /**
  		 * @returns Actual video quality of the current video.
  		 */
  def getPlaybackQuality(): SuggestedVideoQuality = js.native
  /**
  		 * @returns Playback rate of the currently playing video.
  		 */
  def getPlaybackRate(): Double = js.native
  /**
  		 * @returns Current player state.
  		 */
  def getPlayerState(): PlayerState = js.native
  /**
  		 * @returns Video IDs in the playlist as they are currently ordered.
  		 */
  def getPlaylist(): js.Array[String] = js.native
  /**
  		 * @returns Index of the playlist video that is currently playing.
  		 */
  def getPlaylistIndex(): Double = js.native
  /**
  		 * @returns Embed code for the currently loaded/playing video.
  		 */
  def getVideoEmbedCode(): String = js.native
  /**
  		 * @returns A number between 0 and 1 of how much the player has buffered.
  		 */
  def getVideoLoadedFraction(): Double = js.native
  /**
  		 * @returns YouTube.com URL for the currently loaded/playing video.
  		 */
  def getVideoUrl(): String = js.native
  /**
  		 * @returns The player's current volume, an integer between 0 and 100.
  		 */
  def getVolume(): Double = js.native
  /**
  		 * @returns Whether the player is muted.
  		 */
  def isMuted(): Boolean = js.native
  /**
  		 * Loads a playlist of videos.
  		 *
  		 * @param args    Settings to queue the playlist.
  		 */
  def loadPlaylist(args: IPlaylistSettings): Unit = js.native
  /**
  		 * Loads a playlist of videos.
  		 *
  		 * @param playlist   Video ID(s) to play.
  		 * @param index   Start index of the playlist, if not 0.
  		 * @param startSeconds   Time from which the video should start playing.
  		 * @param suggestedQuality   Suggested video player quality.
  		 */
  def loadPlaylist(playlist: String): Unit = js.native
  def loadPlaylist(playlist: String, index: Double): Unit = js.native
  def loadPlaylist(playlist: String, index: Double, startSeconds: Double): Unit = js.native
  def loadPlaylist(playlist: String, index: Double, startSeconds: Double, suggestedQuality: SuggestedVideoQuality): Unit = js.native
  def loadPlaylist(playlist: js.Array[String]): Unit = js.native
  def loadPlaylist(playlist: js.Array[String], index: Double): Unit = js.native
  def loadPlaylist(playlist: js.Array[String], index: Double, startSeconds: Double): Unit = js.native
  def loadPlaylist(
    playlist: js.Array[String],
    index: Double,
    startSeconds: Double,
    suggestedQuality: SuggestedVideoQuality
  ): Unit = js.native
  /**
  		 * Loads and plays a video by ID.
  		 *
  		 * @param args   Settings to play the video.
  		 */
  def loadVideoById(args: VideoByIdSettings): Unit = js.native
  /**
  		 * Loads and plays a video by ID.
  		 *
  		 * @param videoId   Video ID.
  		 * @param startSeconds   Time from which the video should start playing.
  		 * @param suggestedQuality   Suggested video player quality.
  		 */
  def loadVideoById(videoId: String): Unit = js.native
  def loadVideoById(videoId: String, startSeconds: Double): Unit = js.native
  def loadVideoById(videoId: String, startSeconds: Double, suggestedQuality: SuggestedVideoQuality): Unit = js.native
  /**
  		 * Loads a video by media content URL.
  		 *
  		 * @param args   Settings to play the video.
  		 */
  def loadVideoByUrl(args: AnonEndSeconds): Unit = js.native
  /**
  		 * Loads a video by media content URL.
  		 *
  		 * @param mediaContentUrl   Fully qualified player URL.
  		 * @param startSeconds   Time from which the video should start playing.
  		 * @param suggestedQuality   Suggested video player quality.
  		 */
  def loadVideoByUrl(mediaContentUrl: String): Unit = js.native
  def loadVideoByUrl(mediaContentUrl: String, startSeconds: Double): Unit = js.native
  def loadVideoByUrl(mediaContentUrl: String, startSeconds: Double, suggestedQuality: SuggestedVideoQuality): Unit = js.native
  /**
  		 * Mutes the player.
  		 */
  def mute(): Unit = js.native
  /**
  		 * Loads and plays the next video in the playlist.
  		 */
  def nextVideo(): Unit = js.native
  /**
  		 * Pauses the currently playing video.
  		 */
  def pauseVideo(): Unit = js.native
  /**
  		 * Plays the currently cued/loaded video.
  		 */
  def playVideo(): Unit = js.native
  /**
  		 * Loads and plays the specified video in the playlist.
  		 *
  		 * @param index   Index of the video to play.
  		 */
  def playVideoAt(index: Double): Unit = js.native
  /**
  		 * Loads and plays the previous video in the playlist.
  		 */
  def previousVideo(): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_onApiChange[TEvent /* <: PlayerEvent */](eventName: onApiChange, listener: js.Function1[/* event */ TEvent, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_onError[TEvent /* <: PlayerEvent */](eventName: onError, listener: js.Function1[/* event */ TEvent, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_onPlaybackQualityChange[TEvent /* <: PlayerEvent */](eventName: onPlaybackQualityChange, listener: js.Function1[/* event */ TEvent, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_onPlaybackRateChange[TEvent /* <: PlayerEvent */](eventName: onPlaybackRateChange, listener: js.Function1[/* event */ TEvent, Unit]): Unit = js.native
  /**
  		 * Remove an event listener for the specified event.
  		 *
  		 * @param eventName   Name of the event.
  		 * @param listener   Handler for the event.
  		 */
  @JSName("removeEventListener")
  def removeEventListener_onReady[TEvent /* <: PlayerEvent */](eventName: onReady, listener: js.Function1[/* event */ TEvent, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_onStateChange[TEvent /* <: PlayerEvent */](eventName: onStateChange, listener: js.Function1[/* event */ TEvent, Unit]): Unit = js.native
  /**
  		 * Seeks to a specified time in the video.
  		 *
  		 * @param seconds   Time, in seconds from the beginning of the video.
  		 * @param allowSeekAhead   Whether the player is allowed to make a new request for unbuffered data.
  		 */
  def seekTo(seconds: Double, allowSeekAhead: Boolean): Unit = js.native
  /**
  		 * Sets whether the player should continuously play a playlist.
  		 *
  		 * @param loopPlaylists   Whether to continuously loop playlists.
  		 */
  def setLoop(loopPlaylists: Boolean): Unit = js.native
  /**
  		 * Sets the suggested video quality for the current video.
  		 *
  		 * @param suggestedQuality   Suggested video quality for the current video.
  		 */
  def setPlaybackQuality(suggestedQuality: SuggestedVideoQuality): Unit = js.native
  /**
  		 * Sets the suggested playback rate for the current video.
  		 *
  		 * @param suggestedRate   Suggested playback rate.
  		 */
  def setPlaybackRate(suggestedRate: Double): Unit = js.native
  /**
  		 * Sets whether a playlist's videos should be shuffled.
  		 *
  		 * @param shufflePlaylist   Whether to shuffle playlist videos.
  		 */
  def setShuffle(shufflePlaylist: Boolean): Unit = js.native
  /**
  		 * Sets the size in pixels of the <iframe> that contains the player.
  		 *
  		 * @param width   Width in pixels of the <iframe>.
  		 * @param height   Height in pixels of the <iframe>.
  		 */
  def setSize(width: Double, height: Double): Unit = js.native
  /**
  		 * Sets the player volume.
  		 *
  		 * @param volume   An integer between 0 and 100.
  		 */
  def setVolume(volume: Double): Unit = js.native
  /**
  		 * Stops and cancels loading of the current video.
  		 */
  def stopVideo(): Unit = js.native
  /**
  		 * Unmutes the player.
  		 */
  def unMute(): Unit = js.native
}

