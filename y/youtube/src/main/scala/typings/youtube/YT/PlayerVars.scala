package typings.youtube.YT

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayerVars extends StObject {
  
  /**
    * Whether to autohide video controls (by default, HideProgressBar).
    */
  var autohide: js.UndefOr[AutoHide] = js.undefined
  
  /**
    * Whether to autoplay the video (by default, NoAutoPlay).
    */
  var autoplay: js.UndefOr[AutoPlay] = js.undefined
  
  /**
    * Default caption language as an ISO 639-1 two-letter language code.
    */
  var cc_lang_pref: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to use user-preferred or forced caption loading (by default, UserDefault).
    */
  var cc_load_policy: js.UndefOr[ClosedCaptionsLoadPolicy] = js.undefined
  
  /**
    * Player progress bar color
    */
  var color: js.UndefOr[ProgressBarColor] = js.undefined
  
  /**
    * How video controls are shown (by default, ShowLoadPlayer).
    */
  var controls: js.UndefOr[Controls] = js.undefined
  
  /**
    * Whether to allow keyboard controls (by default, Enable).
    */
  var disablekb: js.UndefOr[KeyboardControls] = js.undefined
  
  /**
    * Whether the JavaScript API should be enabled (by default, Disable).
    */
  var enablejsapi: js.UndefOr[JsApi] = js.undefined
  
  /**
    * Time, in seconds from the beginning of the video, when to stop playing.
    */
  var end: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether to display the full-screen button (by default, Show).
    */
  var fs: js.UndefOr[FullscreenButton] = js.undefined
  
  /**
    * Player language as an ISO 639-1 two-letter language code or fully-specified locale.
    */
  var hl: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to show video annotations (by default, Show).
    */
  var iv_load_policy: js.UndefOr[IvLoadPolicy] = js.undefined
  
  /**
    * Identifies content that will load.
    * If the listType parameter value is user_uploads, then the list parameter value identifies the YouTube channel whose uploaded videos will be loaded.
    * If the listType parameter value is playlist, then the list parameter value specifies a YouTube playlist ID.
    */
  var list: js.UndefOr[String] = js.undefined
  
  /**
    * Which type of content loads in the player.
    */
  var listType: js.UndefOr[ListType] = js.undefined
  
  /**
    * Whether a single video should be looped (by default, SinglePlay).
    */
  var loop: js.UndefOr[Loop] = js.undefined
  
  /**
    * Whether to hide some YouTube branding (by default, Full).
    */
  var modestbranding: js.UndefOr[ModestBranding] = js.undefined
  
  /**
    * Whether to start the video muted (by default, NotMuted).
    */
  var mute: js.UndefOr[Mute] = js.undefined
  
  /**
    * Origin domain for additional security if using the JavaScript API.
    */
  var origin: js.UndefOr[String] = js.undefined
  
  /**
    * Comma separated list of video IDs to play after the URL path's video.
    */
  var playlist: js.UndefOr[String] = js.undefined
  
  /**
    * Whether videos play inline or fullscreen in an HTML5 player on iOS. (currently by default, Fullscreen).
    */
  var playsinline: js.UndefOr[PlaysInline] = js.undefined
  
  /**
    * Whether to show related videos after the video finishes (by default, Show).
    */
  var rel: js.UndefOr[RelatedVideos] = js.undefined
  
  /**
    * Whether to show video information before playing (by default, Show).
    */
  var showinfo: js.UndefOr[ShowInfo] = js.undefined
  
  /**
    * Time, in seconds from the beginning of the video, when to start playing.
    */
  var start: js.UndefOr[Double] = js.undefined
}
object PlayerVars {
  
  inline def apply(): PlayerVars = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayerVars]
  }
  
  extension [Self <: PlayerVars](x: Self) {
    
    inline def setAutohide(value: AutoHide): Self = StObject.set(x, "autohide", value.asInstanceOf[js.Any])
    
    inline def setAutohideUndefined: Self = StObject.set(x, "autohide", js.undefined)
    
    inline def setAutoplay(value: AutoPlay): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
    
    inline def setCc_lang_pref(value: String): Self = StObject.set(x, "cc_lang_pref", value.asInstanceOf[js.Any])
    
    inline def setCc_lang_prefUndefined: Self = StObject.set(x, "cc_lang_pref", js.undefined)
    
    inline def setCc_load_policy(value: ClosedCaptionsLoadPolicy): Self = StObject.set(x, "cc_load_policy", value.asInstanceOf[js.Any])
    
    inline def setCc_load_policyUndefined: Self = StObject.set(x, "cc_load_policy", js.undefined)
    
    inline def setColor(value: ProgressBarColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setControls(value: Controls): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    inline def setDisablekb(value: KeyboardControls): Self = StObject.set(x, "disablekb", value.asInstanceOf[js.Any])
    
    inline def setDisablekbUndefined: Self = StObject.set(x, "disablekb", js.undefined)
    
    inline def setEnablejsapi(value: JsApi): Self = StObject.set(x, "enablejsapi", value.asInstanceOf[js.Any])
    
    inline def setEnablejsapiUndefined: Self = StObject.set(x, "enablejsapi", js.undefined)
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setFs(value: FullscreenButton): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
    
    inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
    
    inline def setHl(value: String): Self = StObject.set(x, "hl", value.asInstanceOf[js.Any])
    
    inline def setHlUndefined: Self = StObject.set(x, "hl", js.undefined)
    
    inline def setIv_load_policy(value: IvLoadPolicy): Self = StObject.set(x, "iv_load_policy", value.asInstanceOf[js.Any])
    
    inline def setIv_load_policyUndefined: Self = StObject.set(x, "iv_load_policy", js.undefined)
    
    inline def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListType(value: ListType): Self = StObject.set(x, "listType", value.asInstanceOf[js.Any])
    
    inline def setListTypeUndefined: Self = StObject.set(x, "listType", js.undefined)
    
    inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
    
    inline def setLoop(value: Loop): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setModestbranding(value: ModestBranding): Self = StObject.set(x, "modestbranding", value.asInstanceOf[js.Any])
    
    inline def setModestbrandingUndefined: Self = StObject.set(x, "modestbranding", js.undefined)
    
    inline def setMute(value: Mute): Self = StObject.set(x, "mute", value.asInstanceOf[js.Any])
    
    inline def setMuteUndefined: Self = StObject.set(x, "mute", js.undefined)
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setPlaylist(value: String): Self = StObject.set(x, "playlist", value.asInstanceOf[js.Any])
    
    inline def setPlaylistUndefined: Self = StObject.set(x, "playlist", js.undefined)
    
    inline def setPlaysinline(value: PlaysInline): Self = StObject.set(x, "playsinline", value.asInstanceOf[js.Any])
    
    inline def setPlaysinlineUndefined: Self = StObject.set(x, "playsinline", js.undefined)
    
    inline def setRel(value: RelatedVideos): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
    
    inline def setShowinfo(value: ShowInfo): Self = StObject.set(x, "showinfo", value.asInstanceOf[js.Any])
    
    inline def setShowinfoUndefined: Self = StObject.set(x, "showinfo", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
