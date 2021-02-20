package typings.youtube.YT

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlayerVars extends StObject {
  
  /**
    * Whether to autohide video controls (by default, HideProgressBar).
    */
  var autohide: js.UndefOr[AutoHide] = js.native
  
  /**
    * Whether to autoplay the video (by default, NoAutoPlay).
    */
  var autoplay: js.UndefOr[AutoPlay] = js.native
  
  /**
    * Whether to use user-preferred or forced caption loading (by default, UserDefault).
    */
  var cc_load_policy: js.UndefOr[ClosedCaptionsLoadPolicy] = js.native
  
  /**
    * Player progress bar color
    */
  var color: js.UndefOr[ProgressBarColor] = js.native
  
  /**
    * How video controls are shown (by default, ShowLoadPlayer).
    */
  var controls: js.UndefOr[Controls] = js.native
  
  /**
    * Whether to allow keyboard controls (by default, Enable).
    */
  var disablekb: js.UndefOr[KeyboardControls] = js.native
  
  /**
    * Whether the JavaScript API should be enabled (by default, Disable).
    */
  var enablejsapi: js.UndefOr[JsApi] = js.native
  
  /**
    * Time, in seconds from the beginning of the video, when to stop playing.
    */
  var end: js.UndefOr[Double] = js.native
  
  /**
    * Whether to display the full-screen button (by default, Show).
    */
  var fs: js.UndefOr[FullscreenButton] = js.native
  
  /**
    * Player language as an ISO 639-1 two-letter language code or fully-specified locale.
    */
  var hl: js.UndefOr[String] = js.native
  
  /**
    * Whether to show video annotations (by default, Show).
    */
  var iv_load_policy: js.UndefOr[IvLoadPolicy] = js.native
  
  /**
    * Identifies content that will load.
    * If listType is search, this is the search query.
    * If listType is user_uploads, this is the YouTube user.
    * If listType is playlist, this is the playlist ID, prepended by 'PL'.
    */
  var list: js.UndefOr[String] = js.native
  
  /**
    * Which type of content loads in the player.
    */
  var listType: js.UndefOr[ListType] = js.native
  
  /**
    * Whether a single video should be looped (by default, SinglePlay).
    */
  var loop: js.UndefOr[Loop] = js.native
  
  /**
    * Whether to hide some YouTube branding (by default, Full).
    */
  var modestbranding: js.UndefOr[ModestBranding] = js.native
  
  /**
    * Origin domain for additional security if using the JavaScript API.
    */
  var origin: js.UndefOr[String] = js.native
  
  /**
    * Comma separated list of video IDs to play after the URL path's video.
    */
  var playlist: js.UndefOr[String] = js.native
  
  /**
    * Whether videos play inline or fullscreen in an HTML5 player on iOS. (currently by default, Fullscreen).
    */
  var playsinline: js.UndefOr[PlaysInline] = js.native
  
  /**
    * Whether to show related videos after the video finishes (by default, Show).
    */
  var rel: js.UndefOr[RelatedVideos] = js.native
  
  /**
    * Whether to show video information before playing (by default, Show).
    */
  var showinfo: js.UndefOr[ShowInfo] = js.native
  
  /**
    * Time, in seconds from the beginning of the video, when to start playing.
    */
  var start: js.UndefOr[Double] = js.native
}
object PlayerVars {
  
  @scala.inline
  def apply(): PlayerVars = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayerVars]
  }
  
  @scala.inline
  implicit class PlayerVarsMutableBuilder[Self <: PlayerVars] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutohide(value: AutoHide): Self = StObject.set(x, "autohide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutohideUndefined: Self = StObject.set(x, "autohide", js.undefined)
    
    @scala.inline
    def setAutoplay(value: AutoPlay): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
    
    @scala.inline
    def setCc_load_policy(value: ClosedCaptionsLoadPolicy): Self = StObject.set(x, "cc_load_policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCc_load_policyUndefined: Self = StObject.set(x, "cc_load_policy", js.undefined)
    
    @scala.inline
    def setColor(value: ProgressBarColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setControls(value: Controls): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    @scala.inline
    def setDisablekb(value: KeyboardControls): Self = StObject.set(x, "disablekb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisablekbUndefined: Self = StObject.set(x, "disablekb", js.undefined)
    
    @scala.inline
    def setEnablejsapi(value: JsApi): Self = StObject.set(x, "enablejsapi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnablejsapiUndefined: Self = StObject.set(x, "enablejsapi", js.undefined)
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setFs(value: FullscreenButton): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
    
    @scala.inline
    def setHl(value: String): Self = StObject.set(x, "hl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHlUndefined: Self = StObject.set(x, "hl", js.undefined)
    
    @scala.inline
    def setIv_load_policy(value: IvLoadPolicy): Self = StObject.set(x, "iv_load_policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIv_load_policyUndefined: Self = StObject.set(x, "iv_load_policy", js.undefined)
    
    @scala.inline
    def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListType(value: ListType): Self = StObject.set(x, "listType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListTypeUndefined: Self = StObject.set(x, "listType", js.undefined)
    
    @scala.inline
    def setListUndefined: Self = StObject.set(x, "list", js.undefined)
    
    @scala.inline
    def setLoop(value: Loop): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    @scala.inline
    def setModestbranding(value: ModestBranding): Self = StObject.set(x, "modestbranding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModestbrandingUndefined: Self = StObject.set(x, "modestbranding", js.undefined)
    
    @scala.inline
    def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    @scala.inline
    def setPlaylist(value: String): Self = StObject.set(x, "playlist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaylistUndefined: Self = StObject.set(x, "playlist", js.undefined)
    
    @scala.inline
    def setPlaysinline(value: PlaysInline): Self = StObject.set(x, "playsinline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaysinlineUndefined: Self = StObject.set(x, "playsinline", js.undefined)
    
    @scala.inline
    def setRel(value: RelatedVideos): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
    
    @scala.inline
    def setShowinfo(value: ShowInfo): Self = StObject.set(x, "showinfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowinfoUndefined: Self = StObject.set(x, "showinfo", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
