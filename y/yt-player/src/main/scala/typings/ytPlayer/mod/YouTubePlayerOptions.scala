package typings.ytPlayer.mod

import typings.ytPlayer.ytPlayerBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait YouTubePlayerOptions extends js.Object {
  
  /**
    * This parameter indicates whether the player will show video annotations.
    * The default value is true.
    */
  var annotations: js.UndefOr[Boolean] = js.native
  
  /**
    * This parameter indicates whether the initial video will automatically
    * start to play when the player loads. The default value is false.
    */
  var autoplay: js.UndefOr[Boolean] = js.native
  
  /**
    * This parameter indicates whether closed captions should be shown, even if
    * the user has turned captions off. The default behavior is based on user
    * preference.
    */
  var captions: js.UndefOr[`false` | String] = js.native
  
  /**
    * This parameter indicates whether the video player controls are displayed.
    * The default value is true.
    */
  var controls: js.UndefOr[Boolean] = js.native
  
  /**
    * This parameter indicates whether the player will show a fullscreen
    * button. The default value is true.
    */
  var fullscreen: js.UndefOr[Boolean] = js.native
  
  /** This parameter indicates the height of the player. */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * This parameter controls the hostname that videos are loaded from.
    * Set to `https://www.youtube-nocookie.com` for enhanced privacy.
    * The default value is `https://www.youtube.com`.
    */
  var host: js.UndefOr[String] = js.native
  
  /**
    * This parameter indicates whether the player will respond to keyboard
    * shortcuts. The default value is true.
    */
  var keyboard: js.UndefOr[Boolean] = js.native
  
  /**
    * This parameter lets you use a YouTube player that does not show a
    * YouTube logo. Even when this option is enabled, a small YouTube text
    * label will still display in the upper-right corner of a paused video
    * when the user's mouse pointer hovers over the player.
    */
  var modestBranding: js.UndefOr[Boolean] = js.native
  
  /**
    * This parameter controls whether videos play inline or fullscreen in an
    * HTML5 player on iOS. The default is true.
    */
  var playsInline: js.UndefOr[Boolean] = js.native
  
  /**
    * This parameter indicates whether the player should show related videos
    * from other channels
    */
  var related: js.UndefOr[Boolean] = js.native
  
  /**
    * This parameter causes the player to begin playing the video at the given number
    * of seconds from the start of the video. The parameter value is a positive integer.
    * Note that the player will look for the closest keyframe to the time you specify.
    * This means that sometimes the play head may seek to just before the requested time,
    * usually no more than around two seconds. Default is 0.
    */
  var start: js.UndefOr[Double] = js.native
  
  /**
    * The time between onTimeupdate callbacks, in milliseconds. Default is
    * 1000.
    */
  var timeupdateFrequency: js.UndefOr[Double] = js.native
  
  /**  This parameter indicates the width of the player. */
  var width: js.UndefOr[Double] = js.native
}
object YouTubePlayerOptions {
  
  @scala.inline
  def apply(): YouTubePlayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YouTubePlayerOptions]
  }
  
  @scala.inline
  implicit class YouTubePlayerOptionsOps[Self <: YouTubePlayerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnnotations(value: Boolean): Self = this.set("annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotations: Self = this.set("annotations", js.undefined)
    
    @scala.inline
    def setAutoplay(value: Boolean): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
    
    @scala.inline
    def setCaptions(value: `false` | String): Self = this.set("captions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptions: Self = this.set("captions", js.undefined)
    
    @scala.inline
    def setControls(value: Boolean): Self = this.set("controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControls: Self = this.set("controls", js.undefined)
    
    @scala.inline
    def setFullscreen(value: Boolean): Self = this.set("fullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullscreen: Self = this.set("fullscreen", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setKeyboard(value: Boolean): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboard: Self = this.set("keyboard", js.undefined)
    
    @scala.inline
    def setModestBranding(value: Boolean): Self = this.set("modestBranding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModestBranding: Self = this.set("modestBranding", js.undefined)
    
    @scala.inline
    def setPlaysInline(value: Boolean): Self = this.set("playsInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaysInline: Self = this.set("playsInline", js.undefined)
    
    @scala.inline
    def setRelated(value: Boolean): Self = this.set("related", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelated: Self = this.set("related", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setTimeupdateFrequency(value: Double): Self = this.set("timeupdateFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeupdateFrequency: Self = this.set("timeupdateFrequency", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
