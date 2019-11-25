package typings.ytDashPlayer.ytDashPlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ytDashPlayer.ytDashPlayerStrings.unstarted
  - typings.ytDashPlayer.ytDashPlayerStrings.ended
  - typings.ytDashPlayer.ytDashPlayerStrings.playing
  - typings.ytDashPlayer.ytDashPlayerStrings.paused
  - typings.ytDashPlayer.ytDashPlayerStrings.buffering
  - typings.ytDashPlayer.ytDashPlayerStrings.cued
*/
trait YouTubePlayerState extends js.Object

object YouTubePlayerState {
  @scala.inline
  def buffering: typings.ytDashPlayer.ytDashPlayerStrings.buffering = this.cast("buffering")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cued: typings.ytDashPlayer.ytDashPlayerStrings.cued = this.cast("cued")
  @scala.inline
  def ended: typings.ytDashPlayer.ytDashPlayerStrings.ended = this.cast("ended")
  @scala.inline
  def paused: typings.ytDashPlayer.ytDashPlayerStrings.paused = this.cast("paused")
  @scala.inline
  def playing: typings.ytDashPlayer.ytDashPlayerStrings.playing = this.cast("playing")
  @scala.inline
  def unstarted: typings.ytDashPlayer.ytDashPlayerStrings.unstarted = this.cast("unstarted")
}

