package typings
package youtubeDashPlayerLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YouTubePlayer extends js.Object {
  def addEventListener(event: java.lang.String, listener: js.Function1[/* event */ stdLib.CustomEvent[_], scala.Unit]): scala.Unit = js.native
  def cuePlaylist(playlist: java.lang.String): scala.Unit = js.native
  def cuePlaylist(playlist: java.lang.String, index: scala.Double): scala.Unit = js.native
  def cuePlaylist(playlist: java.lang.String, index: scala.Double, startSeconds: scala.Double): scala.Unit = js.native
  def cuePlaylist(
    playlist: java.lang.String,
    index: scala.Double,
    startSeconds: scala.Double,
    suggestedQuality: java.lang.String
  ): scala.Unit = js.native
  def cuePlaylist(playlist: js.Array[java.lang.String]): scala.Unit = js.native
  def cuePlaylist(playlist: js.Array[java.lang.String], index: scala.Double): scala.Unit = js.native
  def cuePlaylist(playlist: js.Array[java.lang.String], index: scala.Double, startSeconds: scala.Double): scala.Unit = js.native
  def cuePlaylist(
    playlist: js.Array[java.lang.String],
    index: scala.Double,
    startSeconds: scala.Double,
    suggestedQuality: java.lang.String
  ): scala.Unit = js.native
  def cuePlaylist(playlist: youtubeDashPlayerLib.Anon_Index): scala.Unit = js.native
  def cueVideoById(videoId: java.lang.String): scala.Unit = js.native
  def cueVideoById(videoId: java.lang.String, startSeconds: scala.Double): scala.Unit = js.native
  def cueVideoById(videoId: java.lang.String, startSeconds: scala.Double, suggestedQuality: java.lang.String): scala.Unit = js.native
  def cueVideoById(video: youtubeDashPlayerLib.Anon_EndSeconds): scala.Unit = js.native
  def cueVideoByUrl(mediaContentUrl: java.lang.String): scala.Unit = js.native
  def cueVideoByUrl(mediaContentUrl: java.lang.String, startSeconds: scala.Double): scala.Unit = js.native
  def cueVideoByUrl(mediaContentUrl: java.lang.String, startSeconds: scala.Double, suggestedQuality: java.lang.String): scala.Unit = js.native
  def cueVideoByUrl(video: youtubeDashPlayerLib.Anon_EndSecondsMediaContentUrl): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def getAvailablePlaybackRates(): js.Array[scala.Double] = js.native
  def getAvailableQualityLevels(): js.Array[java.lang.String] = js.native
  def getCurrentTime(): scala.Double = js.native
  def getDuration(): scala.Double = js.native
  def getIframe(): stdLib.HTMLIFrameElement = js.native
  def getOption(module: java.lang.String, option: java.lang.String): js.Any = js.native
  def getOptions(): js.Array[java.lang.String] = js.native
  def getOptions(module: java.lang.String): js.Object = js.native
  def getPlaybackQuality(): java.lang.String = js.native
  def getPlaybackRate(): scala.Double = js.native
  def getPlayerState(): youtubeDashPlayerLib.distConstantsPlayerStatesMod.PlayerStates = js.native
  def getPlaylist(): js.Array[java.lang.String] = js.native
  def getPlaylistIndex(): scala.Double = js.native
  def getVideoEmbedCode(): java.lang.String = js.native
  def getVideoLoadedFraction(): scala.Double = js.native
  def getVideoUrl(): java.lang.String = js.native
  def getVolume(): scala.Double = js.native
  def isMuted(): scala.Boolean = js.native
  def loadPlaylist(playlist: java.lang.String): scala.Unit = js.native
  def loadPlaylist(playlist: java.lang.String, index: scala.Double): scala.Unit = js.native
  def loadPlaylist(playlist: java.lang.String, index: scala.Double, startSeconds: scala.Double): scala.Unit = js.native
  def loadPlaylist(
    playlist: java.lang.String,
    index: scala.Double,
    startSeconds: scala.Double,
    suggestedQuality: java.lang.String
  ): scala.Unit = js.native
  def loadPlaylist(playlist: js.Array[java.lang.String]): scala.Unit = js.native
  def loadPlaylist(playlist: js.Array[java.lang.String], index: scala.Double): scala.Unit = js.native
  def loadPlaylist(playlist: js.Array[java.lang.String], index: scala.Double, startSeconds: scala.Double): scala.Unit = js.native
  def loadPlaylist(
    playlist: js.Array[java.lang.String],
    index: scala.Double,
    startSeconds: scala.Double,
    suggestedQuality: java.lang.String
  ): scala.Unit = js.native
  def loadPlaylist(playlist: youtubeDashPlayerLib.Anon_Index): scala.Unit = js.native
  def loadVideoById(videoId: java.lang.String): scala.Unit = js.native
  def loadVideoById(videoId: java.lang.String, startSeconds: scala.Double): scala.Unit = js.native
  def loadVideoById(videoId: java.lang.String, startSeconds: scala.Double, suggestedQuality: java.lang.String): scala.Unit = js.native
  def loadVideoById(video: youtubeDashPlayerLib.Anon_EndSeconds): scala.Unit = js.native
  def loadVideoByUrl(mediaContentUrl: java.lang.String): scala.Unit = js.native
  def loadVideoByUrl(mediaContentUrl: java.lang.String, startSeconds: scala.Double): scala.Unit = js.native
  def loadVideoByUrl(mediaContentUrl: java.lang.String, startSeconds: scala.Double, suggestedQuality: java.lang.String): scala.Unit = js.native
  def loadVideoByUrl(video: youtubeDashPlayerLib.Anon_EndSecondsMediaContentUrl): scala.Unit = js.native
  def mute(): scala.Unit = js.native
  def nextVideo(): scala.Unit = js.native
  def on(
    eventType: youtubeDashPlayerLib.distEventNamesMod.EventType,
    listener: js.Function1[/* event */ stdLib.CustomEvent[_], scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_stateChange(
    eventType: youtubeDashPlayerLib.youtubeDashPlayerLibStrings.stateChange,
    listener: js.Function1[/* event */ stdLib.CustomEvent[_] with youtubeDashPlayerLib.Anon_Data, scala.Unit]
  ): scala.Unit = js.native
  def pauseVideo(): scala.Unit = js.native
  def playVideo(): scala.Unit = js.native
  def playVideoAt(index: scala.Double): scala.Unit = js.native
  def previousVideo(): scala.Unit = js.native
  def removeEventListener(event: java.lang.String, listener: js.Function1[/* event */ stdLib.CustomEvent[_], scala.Unit]): scala.Unit = js.native
  def seekTo(seconds: scala.Double, allowSeekAhead: scala.Boolean): scala.Unit = js.native
  def setLoop(loopPlaylists: scala.Boolean): scala.Unit = js.native
  def setOption(module: java.lang.String, option: java.lang.String, value: js.Any): scala.Unit = js.native
  def setOptions(): scala.Unit = js.native
  def setPlaybackQuality(suggestedQuality: java.lang.String): scala.Unit = js.native
  def setPlaybackRate(suggestedRate: scala.Double): scala.Unit = js.native
  def setShuffle(shufflePlaylist: scala.Boolean): scala.Unit = js.native
  def setSize(width: scala.Double, height: scala.Double): js.Object = js.native
  def setVolume(volume: scala.Double): scala.Unit = js.native
  def stopVideo(): scala.Unit = js.native
  def unMute(): scala.Unit = js.native
}

