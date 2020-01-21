package typings.youtubePlayer.eventNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.youtubePlayer.youtubePlayerStrings.ready
  - typings.youtubePlayer.youtubePlayerStrings.stateChange
  - typings.youtubePlayer.youtubePlayerStrings.playbackQualityChange
  - typings.youtubePlayer.youtubePlayerStrings.playbackRateChange
  - typings.youtubePlayer.youtubePlayerStrings.error
  - typings.youtubePlayer.youtubePlayerStrings.apiChange
  - typings.youtubePlayer.youtubePlayerStrings.volumeChange
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  def apiChange: typings.youtubePlayer.youtubePlayerStrings.apiChange = this.cast("apiChange")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typings.youtubePlayer.youtubePlayerStrings.error = this.cast("error")
  @scala.inline
  def playbackQualityChange: typings.youtubePlayer.youtubePlayerStrings.playbackQualityChange = this.cast("playbackQualityChange")
  @scala.inline
  def playbackRateChange: typings.youtubePlayer.youtubePlayerStrings.playbackRateChange = this.cast("playbackRateChange")
  @scala.inline
  def ready: typings.youtubePlayer.youtubePlayerStrings.ready = this.cast("ready")
  @scala.inline
  def stateChange: typings.youtubePlayer.youtubePlayerStrings.stateChange = this.cast("stateChange")
  @scala.inline
  def volumeChange: typings.youtubePlayer.youtubePlayerStrings.volumeChange = this.cast("volumeChange")
}

