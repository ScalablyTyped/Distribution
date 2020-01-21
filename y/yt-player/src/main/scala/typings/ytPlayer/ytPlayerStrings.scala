package typings.ytPlayer

import typings.ytPlayer.mod.YouTubePlayerQuality
import typings.ytPlayer.mod.YouTubePlayerState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ytPlayerStrings {
  @js.native
  sealed trait buffering extends YouTubePlayerState
  
  @js.native
  sealed trait cued extends YouTubePlayerState
  
  @js.native
  sealed trait default extends YouTubePlayerQuality
  
  @js.native
  sealed trait ended extends YouTubePlayerState
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait hd1080 extends YouTubePlayerQuality
  
  @js.native
  sealed trait hd720 extends YouTubePlayerQuality
  
  @js.native
  sealed trait highres extends YouTubePlayerQuality
  
  @js.native
  sealed trait large extends YouTubePlayerQuality
  
  @js.native
  sealed trait medium extends YouTubePlayerQuality
  
  @js.native
  sealed trait paused extends YouTubePlayerState
  
  @js.native
  sealed trait playbackQualityChange extends js.Object
  
  @js.native
  sealed trait playbackRateChange extends js.Object
  
  @js.native
  sealed trait playing extends YouTubePlayerState
  
  @js.native
  sealed trait small extends YouTubePlayerQuality
  
  @js.native
  sealed trait timeupdate extends js.Object
  
  @js.native
  sealed trait unplayable extends js.Object
  
  @js.native
  sealed trait unstarted extends YouTubePlayerState
  
  @scala.inline
  def buffering: buffering = "buffering".asInstanceOf[buffering]
  @scala.inline
  def cued: cued = "cued".asInstanceOf[cued]
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  @scala.inline
  def ended: ended = "ended".asInstanceOf[ended]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def hd1080: hd1080 = "hd1080".asInstanceOf[hd1080]
  @scala.inline
  def hd720: hd720 = "hd720".asInstanceOf[hd720]
  @scala.inline
  def highres: highres = "highres".asInstanceOf[highres]
  @scala.inline
  def large: large = "large".asInstanceOf[large]
  @scala.inline
  def medium: medium = "medium".asInstanceOf[medium]
  @scala.inline
  def paused: paused = "paused".asInstanceOf[paused]
  @scala.inline
  def playbackQualityChange: playbackQualityChange = "playbackQualityChange".asInstanceOf[playbackQualityChange]
  @scala.inline
  def playbackRateChange: playbackRateChange = "playbackRateChange".asInstanceOf[playbackRateChange]
  @scala.inline
  def playing: playing = "playing".asInstanceOf[playing]
  @scala.inline
  def small: small = "small".asInstanceOf[small]
  @scala.inline
  def timeupdate: timeupdate = "timeupdate".asInstanceOf[timeupdate]
  @scala.inline
  def unplayable: unplayable = "unplayable".asInstanceOf[unplayable]
  @scala.inline
  def unstarted: unstarted = "unstarted".asInstanceOf[unstarted]
}

