package typings.ytDashPlayer

import typings.ytDashPlayer.ytDashPlayerMod.YoutubePlayerState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ytDashPlayerStrings {
  @js.native
  sealed trait buffering extends YoutubePlayerState
  
  @js.native
  sealed trait cued extends YoutubePlayerState
  
  @js.native
  sealed trait ended extends YoutubePlayerState
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait paused extends YoutubePlayerState
  
  @js.native
  sealed trait playbackQualityChange extends js.Object
  
  @js.native
  sealed trait playbackRateChange extends js.Object
  
  @js.native
  sealed trait playing extends YoutubePlayerState
  
  @js.native
  sealed trait timeupdate extends js.Object
  
  @js.native
  sealed trait unplayable extends js.Object
  
  @js.native
  sealed trait unstarted extends YoutubePlayerState
  
  @scala.inline
  def buffering: buffering = "buffering".asInstanceOf[buffering]
  @scala.inline
  def cued: cued = "cued".asInstanceOf[cued]
  @scala.inline
  def ended: ended = "ended".asInstanceOf[ended]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def paused: paused = "paused".asInstanceOf[paused]
  @scala.inline
  def playbackQualityChange: playbackQualityChange = "playbackQualityChange".asInstanceOf[playbackQualityChange]
  @scala.inline
  def playbackRateChange: playbackRateChange = "playbackRateChange".asInstanceOf[playbackRateChange]
  @scala.inline
  def playing: playing = "playing".asInstanceOf[playing]
  @scala.inline
  def timeupdate: timeupdate = "timeupdate".asInstanceOf[timeupdate]
  @scala.inline
  def unplayable: unplayable = "unplayable".asInstanceOf[unplayable]
  @scala.inline
  def unstarted: unstarted = "unstarted".asInstanceOf[unstarted]
}

