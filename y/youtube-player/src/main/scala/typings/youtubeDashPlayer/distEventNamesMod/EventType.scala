package typings.youtubeDashPlayer.distEventNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.youtubeDashPlayer.youtubeDashPlayerStrings.ready
  - typings.youtubeDashPlayer.youtubeDashPlayerStrings.stateChange
  - typings.youtubeDashPlayer.youtubeDashPlayerStrings.playbackQualityChange
  - typings.youtubeDashPlayer.youtubeDashPlayerStrings.playbackRateChange
  - typings.youtubeDashPlayer.youtubeDashPlayerStrings.error
  - typings.youtubeDashPlayer.youtubeDashPlayerStrings.apiChange
  - typings.youtubeDashPlayer.youtubeDashPlayerStrings.volumeChange
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  def apiChange: typings.youtubeDashPlayer.youtubeDashPlayerStrings.apiChange = this.cast("apiChange")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.youtubeDashPlayer.youtubeDashPlayerStrings.error = this.cast("error")
  @scala.inline
  def playbackQualityChange: typings.youtubeDashPlayer.youtubeDashPlayerStrings.playbackQualityChange = this.cast("playbackQualityChange")
  @scala.inline
  def playbackRateChange: typings.youtubeDashPlayer.youtubeDashPlayerStrings.playbackRateChange = this.cast("playbackRateChange")
  @scala.inline
  def ready: typings.youtubeDashPlayer.youtubeDashPlayerStrings.ready = this.cast("ready")
  @scala.inline
  def stateChange: typings.youtubeDashPlayer.youtubeDashPlayerStrings.stateChange = this.cast("stateChange")
  @scala.inline
  def volumeChange: typings.youtubeDashPlayer.youtubeDashPlayerStrings.volumeChange = this.cast("volumeChange")
}

