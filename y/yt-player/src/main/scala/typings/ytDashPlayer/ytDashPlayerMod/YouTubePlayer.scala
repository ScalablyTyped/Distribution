package typings.ytDashPlayer.ytDashPlayerMod

import typings.node.eventsMod.EventEmitter
import typings.std.Error
import typings.ytDashPlayer.ytDashPlayerStrings.error
import typings.ytDashPlayer.ytDashPlayerStrings.playbackQualityChange
import typings.ytDashPlayer.ytDashPlayerStrings.playbackRateChange
import typings.ytDashPlayer.ytDashPlayerStrings.timeupdate
import typings.ytDashPlayer.ytDashPlayerStrings.unplayable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YouTubePlayer extends EventEmitter {
  var destroyed: Boolean = js.native
  var videoId: String = js.native
  def destroy(): Unit = js.native
  def getAvailablePlaybackRates(): js.Array[Double] = js.native
  def getCurrentTime(): Double = js.native
  def getDuration(): Double = js.native
  def getPlaybackRate(): Double = js.native
  def getProgress(): Double = js.native
  def getState(): YouTubePlayerState = js.native
  def getVolume(): Double = js.native
  def isMuted(): Boolean = js.native
  def load(videoId: String): Unit = js.native
  def load(videoId: String, autoplay: Boolean): Unit = js.native
  def mute(): Unit = js.native
  def on(event: YouTubePlayerState, callback: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, callback: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_playbackQualityChange(event: playbackQualityChange, callback: js.Function1[/* quality */ YouTubePlayerQuality, Unit]): this.type = js.native
  @JSName("on")
  def on_playbackRateChange(event: playbackRateChange, callback: js.Function1[/* playbackRate */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_timeupdate(event: timeupdate, callback: js.Function1[/* seconds */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_unplayable(event: unplayable, callback: js.Function1[/* videoId */ String, Unit]): this.type = js.native
  def pause(): Unit = js.native
  def play(): Unit = js.native
  def seek(seconds: Double): Unit = js.native
  def setPlaybackQuality(suggestedQuality: YouTubePlayerQuality): Unit = js.native
  def setPlaybackRate(rate: Double): Unit = js.native
  def setSize(width: Double, height: Double): Unit = js.native
  def setVolume(volume: Double): Unit = js.native
  def stop(): Unit = js.native
  def unMute(): Unit = js.native
}

