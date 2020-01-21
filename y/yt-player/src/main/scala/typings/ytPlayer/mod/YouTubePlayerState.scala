package typings.ytPlayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ytPlayer.ytPlayerStrings.unstarted
  - typings.ytPlayer.ytPlayerStrings.ended
  - typings.ytPlayer.ytPlayerStrings.playing
  - typings.ytPlayer.ytPlayerStrings.paused
  - typings.ytPlayer.ytPlayerStrings.buffering
  - typings.ytPlayer.ytPlayerStrings.cued
*/
trait YouTubePlayerState extends js.Object

object YouTubePlayerState {
  @scala.inline
  def buffering: typings.ytPlayer.ytPlayerStrings.buffering = this.cast("buffering")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cued: typings.ytPlayer.ytPlayerStrings.cued = this.cast("cued")
  @scala.inline
  def ended: typings.ytPlayer.ytPlayerStrings.ended = this.cast("ended")
  @scala.inline
  def paused: typings.ytPlayer.ytPlayerStrings.paused = this.cast("paused")
  @scala.inline
  def playing: typings.ytPlayer.ytPlayerStrings.playing = this.cast("playing")
  @scala.inline
  def unstarted: typings.ytPlayer.ytPlayerStrings.unstarted = this.cast("unstarted")
}

