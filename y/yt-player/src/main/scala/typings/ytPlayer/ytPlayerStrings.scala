package typings.ytPlayer

import typings.ytPlayer.mod.YouTubePlayerQuality
import typings.ytPlayer.mod.YouTubePlayerState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ytPlayerStrings {
  
  @js.native
  sealed trait default extends YouTubePlayerQuality
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait buffering extends YouTubePlayerState
  @scala.inline
  def buffering: buffering = "buffering".asInstanceOf[buffering]
  
  @js.native
  sealed trait cued extends YouTubePlayerState
  @scala.inline
  def cued: cued = "cued".asInstanceOf[cued]
  
  @js.native
  sealed trait ended extends YouTubePlayerState
  @scala.inline
  def ended: ended = "ended".asInstanceOf[ended]
  
  @js.native
  sealed trait error extends StObject
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait hd1080 extends YouTubePlayerQuality
  @scala.inline
  def hd1080: hd1080 = "hd1080".asInstanceOf[hd1080]
  
  @js.native
  sealed trait hd720 extends YouTubePlayerQuality
  @scala.inline
  def hd720: hd720 = "hd720".asInstanceOf[hd720]
  
  @js.native
  sealed trait highres extends YouTubePlayerQuality
  @scala.inline
  def highres: highres = "highres".asInstanceOf[highres]
  
  @js.native
  sealed trait large extends YouTubePlayerQuality
  @scala.inline
  def large: large = "large".asInstanceOf[large]
  
  @js.native
  sealed trait medium extends YouTubePlayerQuality
  @scala.inline
  def medium: medium = "medium".asInstanceOf[medium]
  
  @js.native
  sealed trait paused extends YouTubePlayerState
  @scala.inline
  def paused: paused = "paused".asInstanceOf[paused]
  
  @js.native
  sealed trait playbackQualityChange extends StObject
  @scala.inline
  def playbackQualityChange: playbackQualityChange = "playbackQualityChange".asInstanceOf[playbackQualityChange]
  
  @js.native
  sealed trait playbackRateChange extends StObject
  @scala.inline
  def playbackRateChange: playbackRateChange = "playbackRateChange".asInstanceOf[playbackRateChange]
  
  @js.native
  sealed trait playing extends YouTubePlayerState
  @scala.inline
  def playing: playing = "playing".asInstanceOf[playing]
  
  @js.native
  sealed trait small extends YouTubePlayerQuality
  @scala.inline
  def small: small = "small".asInstanceOf[small]
  
  @js.native
  sealed trait timeupdate extends StObject
  @scala.inline
  def timeupdate: timeupdate = "timeupdate".asInstanceOf[timeupdate]
  
  @js.native
  sealed trait unplayable extends StObject
  @scala.inline
  def unplayable: unplayable = "unplayable".asInstanceOf[unplayable]
  
  @js.native
  sealed trait unstarted extends YouTubePlayerState
  @scala.inline
  def unstarted: unstarted = "unstarted".asInstanceOf[unstarted]
}
